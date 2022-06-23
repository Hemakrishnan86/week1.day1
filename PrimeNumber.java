package week1.day1;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int input = 15;
		int flag = 0;
		
		
		
		if(input == 0 || input == 1)
		{
			System.out.println("Its is a prime number");
		}	
		 else {
			
			 //this if loop is reduce the number of iteration
		
		for (int i = 2; i <= input/2; i++) {
			
			if (input%i == 0)
			{
				System.out.println("Is not a prime number");
				flag = 1; 
				break;
			}
			
		}
		
		if (flag == 0)
			
		{
			System.out.println("Its is a prime number");
		}
			
		}
		
		}
	}