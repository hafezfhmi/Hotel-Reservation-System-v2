public class Room
{
	private String CustName;
	private String CustPhone;
	private String CustID;
	private String CustType;
	private String Gender;
	private String RoomNo;
	private String RoomType;
	private int NumberofDay;
	private double RoomPrice;
	private double TotalPrice;
	private double PackagePrice;
	private double Average;
	private double TotalAllCustomer;
	private  static int count;
	
	//=====================================================================================
		
	//default constructor
	public Room()				
	{
		CustName = "";
		CustPhone = "";
		CustID = "";
		CustType = "";
		Gender = "";
		RoomNo = "";
		RoomType = "";
		NumberofDay = 0;
		RoomPrice = 0;
		TotalPrice = 0;
		PackagePrice = 0;
		Average = 0;
		TotalAllCustomer = 0;
		count = 0 ;
	}
	
	//normal constructor
	public Room(String CustName, String CustPhone, String CustID, String CustType, String Gender, String RoomNo, String RoomType, int NumberofDay, double RoomPrice,
	 double TotalPrice, double PackagePrice, double Average,double TotalAllCustomer, int count)
	{
		this.CustName = CustName;
		this.CustPhone = CustPhone;
		this.CustID = CustID;
		this.CustType = CustType;
		this.Gender = Gender;
		this.RoomNo = RoomNo;
		this.RoomType = RoomType;
		this.NumberofDay = NumberofDay;
		this.RoomPrice = RoomPrice;
		this.TotalPrice = TotalPrice;
		this.PackagePrice = PackagePrice;
		this.Average = Average;
		this.TotalAllCustomer = TotalAllCustomer;
		this.count = count;
	}
	
	//=====================================================================================
	
	//setter
	public void setCustName(String CustName)
	{
		this.CustName = CustName;
	}
	
	public void setCustPhone(String CustPhone)
	{
		this.CustPhone = CustPhone;
	}
	
	public void setCustID(String CustID)
	{
		this.CustID = CustID;
	}
	
	public void setCustType(String CustType)
	{
		this.CustType = CustType;
	}
	
	public void setGender(String Gender)
	{
		this.Gender = Gender;
	}
	
	public void setRoomNo(String RoomNo)
	{
		this.RoomNo = RoomNo;
	}
	
	public void setRoomType(String RoomType)
	{
		this.RoomType = RoomType;
	}
	
	public void setNumberofDay(int NumberofDay)
	{
		this.NumberofDay = NumberofDay;
	}
	
	public void setRoomPrice(double RoomPrice)
	{
		this.RoomPrice = RoomPrice;
	}
	
	public void setTotalPrice(double TotalPrice)
	{
		this.TotalPrice = TotalPrice;
	}
	
	public void setPackagePrice(double PackagePrice)
	{
		this.PackagePrice = PackagePrice;
	}
	
	public void setAverage(double Average)
	{
		this.Average = Average;
	}
	
	public void setTotalAllCustomer(double TotalAllCustomer)
	{
		this.TotalAllCustomer = TotalAllCustomer;
	}
	
	public void setCount(int count)
	{
		this.count = count;
	}
	
	//=====================================================================================
	
	//getter
	public String getCustName()
	{
		return CustName;
	}
	
	public String getCustPhone()
	{
		return CustPhone;
	}
	
	public String getCustID()
	{
		return CustID;
	}
	
	public String getCustType()
	{
		return CustType;
	}
	
	public String getGender()
	{
		return Gender;
	}
	
	public String getRoomNo()
	{
		return RoomNo;
	}
	
	public String getRoomType()
	{
		return RoomType;
	}
	
	public int getNumberofDay()
	{
		return NumberofDay;
	}
	
	public double getRoomPrice()
	{
		return RoomPrice;
	}
	
	public double getTotalPrice()
	{
		return TotalPrice;
	}
	
	public double getPackagePrice()
	{
		return PackagePrice;
	}
	
	public double getAverage()
	{
		return Average;
	}
	
	public double getTotalAllCustomer()
	{
		return TotalAllCustomer;
	}
	
	public int getCount()
	{
		return count;
	}
	
	//=====================================================================================
	
	//to string method for some of the attributes(mainly customer's details)
	public String toString()
	{
		return "Name: " + CustName +
			"\nPhone: " + CustPhone +
			"\nID: " + CustID +
			"\nType: " + CustType +
			"\nGender: " + Gender +
			"\nRoom Number: " + RoomNo +
			"\nRoom Type: " + RoomType +
			"\nNumber of Day: " + NumberofDay +
			"\nRoom Price: " + RoomPrice +
			"\nPackage Price: " + Gender +
			"\nTotal Price(Package + Room): " + TotalPrice;
	}
	
	//=====================================================================================

	public void CalculateRoomPrice()			//calculate the RoomPrice based on RoomType
	{
		if(RoomType.equals("Basic"))
		{
			RoomPrice = NumberofDay * 200;		//for "Basic" RoomType, the price is NumberofDay * 200
		}
		
		if(RoomType.equals("Regular"))
		{
			RoomPrice = NumberofDay * 320;		//for "Regular" RoomType, the price is NumberofDay * 200
		}
		
		if(RoomType.equals("Premium"))			//for "Premium" RoomType, the price is NumberofDay * 200
		{
			RoomPrice = NumberofDay * 500;
		}
		
		if(RoomType.equals("VIP"))				//for "VIP" RoomType, the price is NumberofDay * 200
		{
			RoomPrice = NumberofDay * 700;
		}
	}
	
	public void CalculateTotalPrice()			//calculate the TotalPrice
	{
		TotalPrice = RoomPrice + PackagePrice;
	}
	
	public void CalculateDiscount()				//calculate the price after discount is applied to "LOCAL CITIZENS" type of customers
	{
		if(CustType.equals("LOCAL CITIZENS"))
		{
			TotalPrice = TotalPrice * 0.8;		//discount of 20%
		}
	}
	
	public void CalculateTotalAllCustomer()		//calculate the collection from all the customer of the day/occurence
	{
		TotalAllCustomer = TotalAllCustomer + TotalPrice;
	}	
		
	public void CalculateAverage()				//calculate the average collection of the day/occurence
	{
		Average = TotalAllCustomer / count;
	}
	
	public void addcount()						//increment the number of count
	{
		count = count + 1;
	}
}