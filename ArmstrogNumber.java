package week1.day1;

import jdk.internal.misc.FileSystemOption;

public class ArmstrogNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int num=153;
			int quo=1, rem,calc=0;
			int newnum =num;
			while (newnum>0) {
						
				rem=newnum%10;				
				calc= calc+(rem*rem*rem);
				System.out.println(+calc);
				newnum=newnum/10;
				
				
			}
			if(calc==num) {
				System.out.println("The number is Armstrong");
			}
			else
				System.out.println("The number is not armstrong");
	}
	

}
