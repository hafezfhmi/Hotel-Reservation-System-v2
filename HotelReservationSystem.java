/**
 * @(#)HotelReservationSystem.java
 *
 *
 * @author hafez,adib1, adib2
 * @version 1.00 2019/12/4
 */

import java.awt.*;
import javax.swing.*;
import java.awt.GridLayout;
import javax.swing.JOptionPane;
import java.awt.event.*;
import java.io.*;
import java.text.*;
import java.util.*;

public class HotelReservationSystem {
	
	public static void main(String[] args)
	{    
	
		Room room = new Room();													//create new Room object
		room.setCount(0);														//set the count value to 0. Count is used to calculate the number of customer booking
		
		
        JFrame frame1 = new JFrame();
        JFrame frame2 = new JFrame();
        
        String m = JOptionPane.showInputDialog(frame1,"ENTER RECEPTIONIST ID");
         
         if(m.isEmpty())
         	{
            	 frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
            }
            
        else {
        
        JOptionPane.showMessageDialog(frame2,"HELLO DEAR, WELCOME TO AWANA HOTEL RESERVATION SYSTEM!");
        
        JFrame f = new JFrame();
		
        JPanel panel = new JPanel(new GridLayout(18,2));
  
    	f.setTitle("AWANA HOTEL RESERVATION SYSTEM");
    	f.setSize(700, 500);   
    	f.setVisible(true);  
    	
		panel.setBackground(Color.white);
		
		
		JLabel output1 = new JLabel("PLEASE INPUT THE CUSTOMER DETAILS");
		JLabel blank1 = new JLabel();
		JLabel cstnm=new JLabel("Customer Full Name: ");
		JTextField CustName = new JTextField(20);
		JLabel cstph=new JLabel("Customer Phone Number: ");
		JTextField CustPhone = new JTextField(20);
		JLabel custid = new JLabel("Customer IC Number: ");
		JTextField CustomerID = new JTextField(20);
		panel.add(output1);
		panel.add(blank1);
		panel.add(cstnm);
		panel.add(CustName);
		panel.add(cstph);
		panel.add(CustPhone);
		panel.add(custid);
		panel.add(CustomerID);
		
		JLabel output2 = new JLabel("CUSTOMER GENDER: ");
		JLabel blank2 = new JLabel();
		JRadioButton rb1=new JRadioButton("A) Male");    
		JRadioButton rb2=new JRadioButton("B) Female"); 
		rb1.setBounds(75,50,100,30);    
		rb2.setBounds(75,100,100,30);
		ButtonGroup bg1=new ButtonGroup();    
		bg1.add(rb1);
		bg1.add(rb2);    
		panel.add(output2);
		panel.add(blank2);
		panel.add(rb1);
		panel.add(rb2);
		
		JLabel output3 = new JLabel("CUSTOMER TYPE:");
		JLabel blank3 = new JLabel();
        JRadioButton rb3=new JRadioButton("A) LOCAL CITIZENS");    
		JRadioButton rb4=new JRadioButton("B) FOREIGNER");
		rb1.setBounds(75,50,100,30);    
		rb2.setBounds(75,100,100,30); 
		ButtonGroup bg2=new ButtonGroup();    
		bg2.add(rb3);
		bg2.add(rb4);     
		panel.add(output3);
		panel.add(blank3);
		panel.add(rb3);
		panel.add(rb4);
		
		JLabel output4 = new JLabel("ROOM DETAILS FOR THAT CUSTOMER: ");
		JLabel blank4 = new JLabel();
		JLabel roomno=new JLabel("Room Number: ");
		JTextField RoomNo = new JTextField(20);
		JLabel roomtype=new JLabel("The Type Of The Room:");
		JLabel blank5 = new JLabel();
		JRadioButton rb5=new JRadioButton("A) Basic");    
		JRadioButton rb6=new JRadioButton("B) Regular");
		JRadioButton rb7=new JRadioButton("C) Premium"); 
		JRadioButton rb8=new JRadioButton("D) VIP");
		rb5.setBounds(75,50,100,30);    
		rb6.setBounds(75,100,100,30);
		rb7.setBounds(75,50,100,30);
		rb8.setBounds(75,50,100,30);
		ButtonGroup bg3=new ButtonGroup();    
		bg3.add(rb5);
		bg3.add(rb6);
		bg3.add(rb7);
		bg3.add(rb8);
		JLabel days = new JLabel("Number Of Days: ");
		JTextField Days = new JTextField(20);
		panel.add(output4);
		panel.add(blank4);
		panel.add(roomno);
		panel.add(RoomNo);
		panel.add(blank5);
		panel.add(roomtype);
		panel.add(blank5);
		panel.add(rb5);
		panel.add(rb6);
		panel.add(rb7);
		panel.add(rb8);
		panel.add(days);
		panel.add(Days);
		
		JLabel output5 = new JLabel("ROOM DETAILS FOR THAT CUSTOMER: ");
		JLabel blank6 = new JLabel();
		JCheckBox checkBox1 = new JCheckBox("PACKAGE 1 - GYM(RM30/EACH)",true);  
        checkBox1.setBounds(100,100, 50,50);  
        JCheckBox checkBox2 = new JCheckBox("PACKAGE 2 - KARAOKE(RM40/EACH)",true);  
        checkBox2.setBounds(100,150, 50,50);
        JCheckBox checkBox3 = new JCheckBox("PACKAGE 3 - BUFFET(RM50/EACH)",true);  
        checkBox3.setBounds(100,150, 50,50);
        JCheckBox checkBox4 = new JCheckBox("PACKAGE 4 - SPA(RM60/EACH)",true);  
        checkBox4.setBounds(100,150, 50,50);
        panel.add(output5);
        panel.add(blank6);
        panel.add(checkBox1);  
        panel.add(checkBox2);
        panel.add(checkBox3);
        panel.add(checkBox4);  
		
		JButton submit1 = new JButton("SUBMIT");
        panel.add(submit1);
        JButton cancel1 = new JButton("CANCEL");
        panel.add(cancel1);
          
        f.add(panel);
        f.show(); // Jframe for input customer details
        
        
		cancel1.addActionListener(new ActionListener(){				//if the cancell button is clicked, the frame window will close
			public void actionPerformed(ActionEvent e){
				f.dispose();
        	}
        });
        
      	submit1.addActionListener(new ActionListener(){				//if the submit1 button is clicked, the process of calculating and writing the details will occur
			public void actionPerformed(ActionEvent e){
				room.addcount();									//add the count whenever the button is clicked
				room.setCustName(CustName.getText());				//get the input from the CustName JTextField
				room.setCustPhone(CustPhone.getText());				//get the input from the CustPhone JTextField
				room.setCustID(CustomerID.getText());				//get the input from the CustomerID JTextField
				room.setRoomNo(RoomNo.getText());					//get the input from the RoomNo JTextField
				room.setNumberofDay(Integer.parseInt(Days.getText()));	//get the input from the Days JTextField and convert it to int data type
      	 	
      	 	if(rb1.isSelected())								
			{	
				room.setGender("Male");								//call the setGender and set it to "Male" if the rb1 JRadioButton is checked
			}
			else if(rb2.isSelected())								//call the setGender and set it to "Female" if the rb2 JRadioButton is checked
			{
			room.setGender("Female");
			}
      	 	 
			//=====================================================================================
      	 	 
			if(rb3.isSelected())
			{
				room.setCustType("LOCAL CITIZENS");					//call the setCustType and set it to "LOCAL CITIZENS" if the rb3 JRadioButton is checked
 			}
			else if(rb4.isSelected())
			{
				room.setCustType("FOREIGNER");						//call the setCustType and set it to "FOREIGNER" if the rb3 JRadioButton is checked
			}
      	 	 
			//=====================================================================================
      	 	 
			if(rb5.isSelected())
			{
				room.setRoomType("Basic");							//call the setRoomType and set it to "Basic" if the rb5 JRadioButton is checked
			}
			else if(rb6.isSelected())
			{
				room.setRoomType("Regular");						//call the setRoomType and set it to "Regular" if the rb6 JRadioButton is checked
 			}
			else if(rb7.isSelected())
			{
				room.setRoomType("Premium");						//call the setRoomType and set it to "Premium" if the rb7 JRadioButton is checked
			}
			else if(rb8.isSelected())
			{
				room.setRoomType("VIP");							//call the setRoomType and set it to "VIP" if the rb8 JRadioButton is checked
			}
      	 	 
			//=====================================================================================
      	 		
			double packages = 0;				//to calculate the sum of packages charge;
      	 	
			if(checkBox1.isSelected())
			{
				packages+=30;					// add 30 to packages if checkBox1 JCheckBox is selected
			}
			if(checkBox2.isSelected())
 			{
				packages+=40;					// add 40 to packages if checkBox1 JCheckBox is selected
			}
			if(checkBox3.isSelected())
			{
				packages+=50;					// add 50 to packages if checkBox1 JCheckBox is selected
			}
			if(checkBox4.isSelected())
			{
				packages+=60;					// add 60 to packages if checkBox1 JCheckBox is selected
			}
      	 	 
			//=====================================================================================
      	 	 
			room.CalculateRoomPrice();			//calculate the RoomPrice for the current customer
      	 	room.setPackagePrice(packages);		//calculate the PackagePrice for the current customer
      	 	room.CalculateTotalPrice();			//calculate the TotalPrice for the current customer
      	 	room.CalculateDiscount();			//calculate the TotalPrice with discount applied for the current customer
      	 	room.CalculateTotalAllCustomer();	//calculate the TotalAllCustomer (Sum of price of all customer)
      	 	room.CalculateAverage();			//calculate the Average price of all customer
      	 	
      	 	//=====================================================================================
      	 	
      	 	SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  		//format the date
      	 	Date date = new Date();															//used to get the current date and time the app is used(submit1 button is clicked)
      	 	
      	 	//=====================================================================================
      	 	
      	 	try{
      	 		
				FileWriter fw = new FileWriter("ManagerReceipt.txt");						//create a FileWriter fw for ManagerReceipt.txt
				BufferedWriter bw = new BufferedWriter(fw);									//create a BufferedWriter bw using fw
				File file = new File("CustomerDetails.txt");								//create a File for CustomerDetails.txt			
				PrintWriter outfile = new PrintWriter(new FileWriter(file, true));			//create a PrintWriter outfile that don't overwrite the file when used
				PrintWriter outfile2 = new PrintWriter(fw);									//create a PrintWriter outfile2 using fw
				
      	 	
      	 		outfile.println (formatter.format(date));									//print current date and time in CustomerDetails.txt
				outfile.println ("Name: " + room.getCustName());							//print customer's name in CustomerDetails.txt
				outfile.println ("Phone number: " + room.getCustPhone());					//print customer's phone number in CustomerDetails.txt
				outfile.println ("ID: " + room.getCustID());								//print customer's ID in CustomerDetails.txt
				outfile.println ("Gender: " + room.getGender());							//print customer's gender in CustomerDetails.txt
				outfile.println ("Customer Type: " + room.getCustType());					//print the type of customer in CustomerDetails.txt
				outfile.println ("Room number: " + room.getRoomNo());						//print customer's room number in CustomerDetails.txt
				outfile.println ("Room type: " + room.getRoomType());						//print customer's room type in CustomerDetails.txt
				outfile.println ("Number of days: " + room.getNumberofDay());				//print customer's number of stay(days) in CustomerDetails.txt
				outfile.println ("Package price: RM " + room.getPackagePrice());				//print customer's package price in CustomerDetails.txt
				outfile.println ("Room price: RM " + room.getRoomPrice());					//print customer's room price in CustomerDetails.txt
				outfile.println ("Total price: RM " + room.getTotalPrice());					//print customer's total price(discount applied) in CustomerDetails.txt
				outfile.println ("\n\n---------------------------------------\n\n");		//print the border of each customer in CustomerDetails.txt
				outfile.close();															//close outfile for CustomerDetails.txt
				outfile2.println (formatter.format(date));									//print current date and time in ManagerReceipt.txt
				outfile2.println ("TOTAL COLLECTION FOR THE DAY: RM " + room.getTotalAllCustomer());		//print total collection for the day/occurence in ManagerReceipt.txt
				outfile2.println ("AVERAGE COLLECTION FOR THE DAY: RM " + room.getAverage());			//print average collection for the day/occurence in ManagerReceipt.txt
				outfile2.println ("NUMBER OF CUSTOMER FOR THE DAY: " + room.getCount());				//print number of customer for the day/occurence in ManagerReceipt.txt
				outfile2.close();
      	 	}
      	 	
      	 	catch (Exception i)																//catch any exception in try:{}
      	 	{
      	 		System.out.println(i.getMessage());
      	 	}
      	 	
      	 	JFrame end = new JFrame();
      	 	JOptionPane.showMessageDialog(end,"DATA SAVED. Enter more data and submit if you want to store more data, otherwise close the windows.");	//indicate that data is stored
			}	
		});
		}     	
	}	
}