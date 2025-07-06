package comD;
import java.util.Arrays;
import java.util.Scanner;
public class Demo1 {
	public static void main(String[] args) {
		int arr[]= {11 ,22 , 33, 44, 55 };
				//	Search :  	Linear, Binary
		Scanner sc = new Scanner(System.in);
		System.out.println("ENter the Element to Search .....! will see this ");
		int key = sc.nextInt();
		boolean found = false ;

		for(int num :arr) {
			if(num == key) {
				found = true;
				break;
			}
		}
		if(found) {
			System.out.println("Yes Element Found....!");
		}
		else {
			System.out.println("Element Not Found...!");
		}
//		
//		System.out.println("=====SORT  :Bubble/Insertion /Selection /Quick /Merge ====: will see this ");
//		
//		int ar[]= {33,22,11,44,55,88,66};
//		Arrays.sort(ar);
//		System.out.println("Sorted Array : ");
//		for(int num :ar) {
//			System.out.println(num);
//		}
	}
}
