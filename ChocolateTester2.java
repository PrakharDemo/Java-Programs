
public class ChocolateTester2 
{
	public static void main(String[] args) 
	{
		Chocolate2 choc = new Chocolate2();
		
		choc.setBarCode(102);
		choc.setName("Nestle");
		choc.setWeight(20);
		choc.setCost(50);
		
		System.out.println("Attributes \t Values");
		
		System.out.println("barCode \t " + choc.getBarCode());
		System.out.println("Name \t\t " + choc.getName());
		System.out.println("Weight \t\t " + choc.getWeight());
		System.out.println("Cost \t\t " + choc.getCost());
	

	}

}
