package comC;
public class Demo {
	public static void main(String[] args) {
		int [] arr = {20,10,33,43,60,50};
		for(int i=0;i<arr.length;i++) {
			System.out.println("Elememts ay index"+ i + " is "+arr[i]);
		}
System.out.println("============== Sum of total array=====");
		int sum=0;
		for(int x :arr) {
					sum+=x;
		}
		System.out.println("SUm = "+sum);
System.out.println("============= Largest Element in Array====");
		int max =arr[0]; // 20 
		for(int n :arr) {
			if(n > max) {
				max=n;
			}
		}
		System.out.println("max :"+ max);
System.out.println("============= Minumum Element in Array====");
		int min =arr[0]; // 20 	
		for(int n :arr) {
			if(n < min) {
				min=n;
			}
		}
		System.out.println("MIN :"+ min);
System.out.println("============= Count even / odd ====");
		int even=0 ;int odd = 0;
		for(int x :arr) {
			if(x%2==0) {
				even++;
			}else {odd++;}
		}
		System.out.println("Even count :"+even);
		System.out.println("Odd Count :" + odd );
//		Revesrse the Array
//		Copy one array into Another 
//		Caculate the avarage of Array Elememts
		// search an element in Array 
		// sort the Array (Ascending order )
	}
}
