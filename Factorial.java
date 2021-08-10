package week1.day1;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 5;
		int fact =1;
		while(number>0)
		{
			fact=fact*number;
					number--;
		}
	System.out.println("Factorila of Number is : " +fact);
	}
	

}
