
public class ChocolateTester 
{
	public static void main(String[] args) 
	{
		Chocolate choc = new Chocolate();
		
		choc.setBarCode(101);
		choc.setName("Cadbury");
		choc.setWeight(12);
		choc.setCost(10);
		
		System.out.println("Attributes \t Values");
		
		System.out.println("barCode \t " + choc.getBarCode());
		System.out.println("Name \t\t " + choc.getName());
		System.out.println("Weight \t\t " + choc.getWeight());
		System.out.println("Cost \t\t " + choc.getCost());
	}
}
