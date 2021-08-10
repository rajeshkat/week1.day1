package week1.day1;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Code To find whether a number is a Prime number or not
		int num =13;
		boolean IsNotPrime=false;
		
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				IsNotPrime=true;
			}
		}
		if(IsNotPrime==true) {
			System.out.println("The number: "+num+" is Not Prime");	
		}
		else
			System.out.println("The number is prime");
	
	}	
		
		
		
		
	}