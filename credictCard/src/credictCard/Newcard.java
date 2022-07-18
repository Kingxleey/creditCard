package credictCard;

import java.util.Scanner;

public class Newcard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String atmMachine = "UNITED BANK FOR AFRICA";
		int atmCardPin = 1234;
		if(atmMachine == "UNITED BANK FOR AFRICA") {
			System.out.println("KINGSLEY WELCOME TO UBA BANK\n");
		//introduced scanner to make input physically
		Scanner scanner = new Scanner(System.in);
		 atmCardPin = 1234;
			System.out.print("PLEASE ENTER YOUR CARD PIN:");
			//VALID ATM PIN IS 1234
		 atmCardPin = scanner.nextInt();
		System.out.println(atmCardPin);
		
		//verifying the card pin
		if(atmCardPin == 1234){
			System.out.println("CORRECT PIN!!");
		}
		//repeat the warning if the pin is incorrect
			while(atmCardPin !=1234) {
		System.out.println("WARNING, INCORRECT PIN!! \nPLEASE RE-ENTER YOUR CARD PIN:");
		//keep inputing your card pin
		atmCardPin = scanner.nextInt();
		System.out.println(atmCardPin);
		}
		
			if (true)
				System.out.println("ACCESSS GRANTED!!");
		}
			//PLEASE INPUT THE AMOUNT TO WITHDRAW MANUALLY
			Scanner scanner1 = new Scanner(System.in) ;
			int amount1 = 5000;
				System.out.println("PLEASE INPUT THE AMOUNT TO WITHDRAW:");
			amount1 = scanner1.nextInt();
		System.out.println(amount1 + " NAIRA ONLY!");
		
		if (amount1<5000) { 
			System.out.println("YOUR TRANSACTION IS IN PROGRESS,PLEASE WAIT.");	
		}
		
				if (amount1>5000) { 
					System.out.println("INSUFFICIENT BALANCE.");			
			while(amount1>5000) {
				System.out.println("PLEASE RE-ENTER LOWER AMOUNT TO WITHDRAW:");
				amount1 = scanner1.nextInt();
				System.out.println(amount1);
			}
			if (true) {
				System.out.println("YOUR TRANSACTION IS IN PROGRESS,PLEASE WAIT.");
			}
}			
  }
	}
	 

       