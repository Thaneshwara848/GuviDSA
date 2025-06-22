package comE;

import java.util.Scanner;

public class Demo1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the A value ");int num1 = sc.nextInt();// 100
		System.out.println("Enter the B value :");int num2 = sc.nextInt();//50 
//		int max=0;
//		if(num1 > num2 ) {
//				max=num1;
//		}
//		else {
//			max=num2;
//		}
//		System.out.println("max :"+ max);
		System.out.println("Max is :"+ Math.max(num1, num2));
		System.out.println("Min is :"+ Math.min(num1, num2));
		System.out.println("Pow :"+ Math.pow(num1, num2));
		System.out.println(Math.sqrt(9));
		System.out.println(Math.cbrt(125));
		System.out.println(Math.floor(100.8)); // down 
		System.out.println(Math.ceil(100.8)); // Up 
		System.out.println("=======================");
		System.out.println("Enter the Base value ");int base = sc.nextInt();// 100
		System.out.println("Enter the Exp value :");int exp = sc.nextInt();//50 
		int result=1;
		
		for(int i=1 ; i<=exp;i++ ) {
				result= result * base ;
		}
		System.out.println(base + " ^ "+ exp + " = "+ result );
		
	}
}

