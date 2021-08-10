package week1.day1;

public class Sumofdigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num =123, quo=1, rem;
		int sum=0;
		while(quo!=0)
		{
			quo =num/10;
			rem=num%10;
			sum =sum+rem;
			num=quo;
			
		}
System.out.println("sum of digit is"+ sum);
	}

}
