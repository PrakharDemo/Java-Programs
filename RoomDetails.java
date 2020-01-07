package program;

public class RoomDetails implements BillComponent
{
	public enum typeOfRoom
	{
		Standard, 
		Deluxe, 
		Cottage
	}
	
	private String customerName;
	private int billId;
	private int noOfDaysOfStay;
	private static int counter = 100;
	private typeOfRoom room;
	private int noOfExtraPeople;
	
	public RoomDetails (String customerName, int noOfDaysOfStay, typeOfRoom room, int noOfExtraPeople) 
	{
		this.customerName = customerName;
		this.noOfDaysOfStay = noOfDaysOfStay;
		this.room = room;
		this.noOfExtraPeople = noOfExtraPeople;
	}

	public String getCustomerName() 
	{
		return customerName;
	}

	public int getBillId() 
	{
		billId = ++counter;
		return billId;
	}

	public int getNoOfDaysOfStay() 
	{
		return noOfDaysOfStay;
	}

	

	public int getNoOfExtraPeople() 
	{
		return noOfExtraPeople;
	}
	
	public boolean validateNoOfDaysOfStay()
	{
		if (noOfDaysOfStay < 1) 
		{
			System.out.println("Invalid duration of stay.");
			System.out.println("Please check the number of days.\n");
			return false;
		}
		else if (noOfDaysOfStay > 15)
		{
			System.out.println("Duration of the stay exceeds the maximum allowed booking period.");
			System.out.println("Please reduce the number days to within 15.\n");
			return false;
		}
		else
			return true;
	}
	
	public boolean validateNoOfExtraPeople()
	{
		if (noOfExtraPeople < 0)
		{
			System.out.println("O oh! You've entered an invalid value, for the number of people in the room\n");
			return false;
		}
			
		else if (noOfExtraPeople > 2)
		{
			System.out.println("The maximum number of extra people in the room is exceeded.\nPlease book more rooms.\n");
			return false;
		}
		else
			return true;
	}
	
	public boolean validateTypeOfRoom()
	{
		if (room != typeOfRoom.Deluxe && room != typeOfRoom.Standard && room != typeOfRoom.Cottage)
		{
			System.out.println("\nYou have entered an invalid value for the type of room\n");
			return false;
		}
		else
			return true;
	}
	
	public float calculateBillAmount()
	{
		float billAmount = 0.0f;
		float baseFare = 0.0f;
		if (validateTypeOfRoom())
		{
			if (validateNoOfDaysOfStay())
			{
				if (validateNoOfExtraPeople())
				{
					switch (room)
					{
						case Standard:
							baseFare = 2500;
							break;
							
						case Deluxe:
							baseFare = 3500;
							break;
							
						case Cottage:
							baseFare = 5500;
							break;
							
						default:
							break;
					}
					billAmount = (float)((baseFare + foodCharge)*noOfDaysOfStay + extraPersonCharge*noOfExtraPeople);
					billAmount += tax*billAmount;
					return billAmount;
				}
			}
		}
		return 0;
	}
}
