package controller;
import java.util.Scanner;

public class controllers {
	    Scanner scanner = new Scanner(System.in);
	    double USD=82.54;
	    double AUD=52.47;
	    double UAED=22.53;
	    double JPY=0.56;
	    double ESP=81.62;
		double inr;
        
		public void usdToInr() {

		    double inr =scanner.nextDouble();
			USD=USD*inr;
			System.out.println(USD + " Rs.");
		}
		
		
		public void audToInr() {

			double inr = scanner.nextDouble();
			AUD*=inr;
			System.out.println(AUD + " Rs.");
		}
		
		public void cadToInr() {

			double inr= scanner.nextDouble();
		UAED*=inr;
			System.out.println(UAED + " Rs.");
		}
		
		public void jpyToInr() {

			double inr = scanner.nextDouble();
			JPY*=inr;
			System.out.println(JPY + " Rs.");
		}
		
		public void espToInr() {

			double inr=scanner.nextDouble();
			ESP*=inr;
			System.out.println(ESP + " Rs.");
		}
	

}