package week1.day1;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int first=0, second=1, sum=0;
		int series =10;
		for(int i=2;i<=series;i++) {
			sum = first+second;
			second=sum;
			first=second;
			
		}
	
	System.out.println("The sum of ficconacci series upto: "+series+ "is: " +sum);
	}
	

}
