package program;

import program.RoomDetails.typeOfRoom;

public class Tester
{
	public static void main(String[] args) 
	{
		
		
		// Standard Rooms
		
		// Room 1
		RoomDetails standardRoom1 = new RoomDetails("Parth", 12, typeOfRoom.Standard, 2);
		
		System.out.println("\n\tCustomer \t: \t" + standardRoom1.getCustomerName());
		if (standardRoom1.validateNoOfExtraPeople())
		{
			System.out.println("\tNo. of People \t: \t" + standardRoom1.getNoOfExtraPeople());
			if (standardRoom1.validateNoOfDaysOfStay())
			{
				System.out.println("\tStay Period \t: \t" + standardRoom1.getNoOfDaysOfStay());
				if (standardRoom1.validateTypeOfRoom())
				{
					System.out.println("*************Bill Details**************");
					System.out.println("\tBill ID  \t: \t" + standardRoom1.getBillId());
					System.out.println("\tBill Amount \t: \t"+standardRoom1.calculateBillAmount() + "\n\n");
				}
			}
		}
		
			
		// Room 2
		RoomDetails standardRoom2 = new RoomDetails("Shiva", 2, typeOfRoom.Standard, 20);
		
		System.out.println("\n\tCustomer \t: \t" + standardRoom2.getCustomerName());
		if (standardRoom2.validateNoOfExtraPeople())
		{
			System.out.println("\tNo. of People \t: \t" + standardRoom2.getNoOfExtraPeople());
			if (standardRoom2.validateNoOfDaysOfStay())
			{
				System.out.println("\tStay Period \t: \t" + standardRoom2.getNoOfDaysOfStay());
				if (standardRoom2.validateTypeOfRoom())
				{
					System.out.println("***********Bill Details*************");
					System.out.println("\tBill ID  \t: \t" + standardRoom2.getBillId());
					System.out.println("\tBill Amount \t: \t"+standardRoom2.calculateBillAmount() + "\n\n");
				}
			}
		}
		
		
		// Room 3
		RoomDetails standardRoom3 = new RoomDetails("Param", 16, typeOfRoom.Standard, 1);
		
		System.out.println("\n\tCustomer \t: \t" + standardRoom3.getCustomerName());
		if (standardRoom3.validateNoOfExtraPeople())
		{
			System.out.println("\tNo. of People \t: \t" + standardRoom3.getNoOfExtraPeople());
			if (standardRoom3.validateNoOfDaysOfStay())
			{
				System.out.println("\tStay Period \t: \t" + standardRoom3.getNoOfDaysOfStay());
				if (standardRoom3.validateTypeOfRoom())
				{
					System.out.println("***********Bill Details*************");
					System.out.println("\tBill ID  \t: \t" + standardRoom3.getBillId());
					System.out.println("\tBill Amount \t: \t"+standardRoom3.calculateBillAmount() + "\n\n");
				}
			}
		}
		
		
		// RoomDetails standardRoom4 = new RoomDetails("Scholes", 10, typeOfRoom.Homestay, 3);
		// This above line will be compiled if typeOfRoom is not an enum, and any value can be passed
		// In that case, this value will be validated by the validateTypeOfRoom() method.
		
		
		
		// Deluxe Rooms
		
		// Room 1
		RoomDetails deluxeRoom1 = new RoomDetails("Simon", 10, typeOfRoom.Deluxe, 2);
		System.out.println("\n\tCustomer \t: \t" + deluxeRoom1.getCustomerName());
		if (deluxeRoom1.validateNoOfExtraPeople())
		{
			System.out.println("\tNo. of People \t: \t" + deluxeRoom1.getNoOfExtraPeople());
			if (deluxeRoom1.validateNoOfDaysOfStay())
			{
				System.out.println("\tStay Period \t: \t" + deluxeRoom1.getNoOfDaysOfStay());
				if (deluxeRoom1.validateTypeOfRoom())
				{
					System.out.println("***********Bill Details*************");
					System.out.println("\tBill ID  \t: \t" + deluxeRoom1.getBillId());
					System.out.println("\tBill Amount \t: \t"+deluxeRoom1.calculateBillAmount() + "\n\n");
				}
			}
		}
				
		// Room 2
		RoomDetails deluxeRoom2 = new RoomDetails("Sally", 16, typeOfRoom.Deluxe, 2);
		System.out.println("\n\tCustomer \t: \t" + deluxeRoom2.getCustomerName());
		if (deluxeRoom2.validateNoOfExtraPeople())
		{
			System.out.println("\tNo. of People \t: \t" + deluxeRoom2.getNoOfExtraPeople());
			if (deluxeRoom2.validateNoOfDaysOfStay())
			{
				System.out.println("\tStay Period \t: \t" + deluxeRoom2.getNoOfDaysOfStay());
				if (deluxeRoom2.validateTypeOfRoom())
				{
					System.out.println("***********Bill Details*************");
					System.out.println("\tBill ID  \t: \t" + deluxeRoom2.getBillId());
					System.out.println("\tBill Amount \t: \t"+deluxeRoom2.calculateBillAmount() + "\n\n");
				}
			}
		}
		
		// Room 3
		RoomDetails deluxeRoom3 = new RoomDetails("Pooja", 9, typeOfRoom.Deluxe, 4);
		System.out.println("\n\tCustomer \t: \t" + deluxeRoom3.getCustomerName());
		if (deluxeRoom3.validateNoOfExtraPeople())
		{
			System.out.println("\tNo. of People \t: \t" + deluxeRoom3.getNoOfExtraPeople());
			if (deluxeRoom3.validateNoOfDaysOfStay())
			{
				System.out.println("\tStay Period \t: \t" + deluxeRoom1.getNoOfDaysOfStay());
				if (deluxeRoom3.validateTypeOfRoom())
				{
					System.out.println("***********Bill Details*************");
					System.out.println("\tBill ID  \t: \t" + deluxeRoom3.getBillId());
					System.out.println("\tBill Amount \t: \t"+deluxeRoom3.calculateBillAmount()+"\n\n");
				}
			}
		}
		
		
		
		// Cottage Rooms
		
		// Room 1
		RoomDetails cottageRoom1 = new RoomDetails("Greg", 5, typeOfRoom.Cottage, -1);
		System.out.println("\n\tCustomer \t: \t" + cottageRoom1.getCustomerName());
		if (cottageRoom1.validateNoOfExtraPeople())
		{
			System.out.println("\tNo. of People \t: \t" + cottageRoom1.getNoOfExtraPeople());
			if (cottageRoom1.validateNoOfDaysOfStay())
			{
				System.out.println("\tStay Period \t: \t" + cottageRoom1.getNoOfDaysOfStay());
				if (cottageRoom1.validateTypeOfRoom())
				{
					System.out.println("***********Bill Details*************");
					System.out.println("\tBill ID  \t: \t" + cottageRoom1.getBillId());
					System.out.println("\tBill Amount \t: \t"+cottageRoom1.calculateBillAmount()+"\n\n");
				}
			}
		}
		
		// Room 2
		RoomDetails cottageRoom2 = new RoomDetails("Santosh", 16, typeOfRoom.Cottage, 2);
		System.out.println("\n\tCustomer \t: \t" + cottageRoom2.getCustomerName());
		if (cottageRoom2.validateNoOfExtraPeople())
		{
			System.out.println("\tNo. of People \t: \t" + cottageRoom2.getNoOfExtraPeople());			if (cottageRoom2.validateNoOfDaysOfStay())
			{
				System.out.println("\tStay Period \t: \t" + cottageRoom2.getNoOfDaysOfStay());
				if (cottageRoom2.validateTypeOfRoom())
				{
					System.out.println("***********Bill Details*************");
					System.out.println("\tBill ID  \t: \t" + cottageRoom2.getBillId());
					System.out.println("\tBill Amount \t: \t"+cottageRoom2.calculateBillAmount()+"\n\n");
				}
			}
		}
		
		// Room 3
		RoomDetails cottageRoom3 = new RoomDetails("Adam", 0, typeOfRoom.Deluxe, 1);
		System.out.println("\n\tCustomer \t: \t" + cottageRoom3.getCustomerName());
		if (cottageRoom3.validateNoOfExtraPeople())
		{
			System.out.println("\tNo. of People \t: \t" + cottageRoom3.getNoOfExtraPeople());
			if (cottageRoom3.validateNoOfDaysOfStay())
			{
				System.out.println("\tStay Period \t: \t" + cottageRoom3.getNoOfDaysOfStay());
				if (cottageRoom3.validateTypeOfRoom())
				{
					System.out.println("***********Bill Details*************");
					System.out.println("\tBill ID  \t: \t" + cottageRoom3.getBillId());
					System.out.println("\tBill Amount \t: \t"+cottageRoom3.calculateBillAmount()+"\n\n");
				}
			}
		}
	}

}
