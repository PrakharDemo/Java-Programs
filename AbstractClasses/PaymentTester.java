package program;

public class PaymentTester 
{
	public static void main(String[] args) 
	{
		CreditCardPayment ccPay1 = new CreditCardPayment (10000.23, 5001); 
		ccPay1.payBill(15000);

		CreditCardPayment ccPay2 = new CreditCardPayment (10000.23, 5001); 
		ccPay2.payBill(0);
		
		OnlinePayment olPay1 = new OnlinePayment (10000.23, 5001); 
		olPay1.payBill(5000);
		
		OnlinePayment olPay2 = new OnlinePayment (5000, 5001); 
		olPay2.payBill(5000);
		
		OnlinePayment olPay3 = new OnlinePayment (5000, 561328); 
		olPay3.payBill(5000);
		
		
		OnlinePayment olPay4 = new OnlinePayment (5000, 561328); 
		olPay4.payBill(6000);
	}
}
