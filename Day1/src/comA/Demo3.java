package comA;
public class Demo3 {
	public static void main(String[] args) {
		
		String name1="Thanesh";
		String name2="Thanesh";
		String name3= new String("Thanesh");
		String name4= new String("Thanesh");
		String name5= new String("Thanesh");		
		System.out.println(name1==name2);		// true
		System.out.println(name1==name3);		// false 
		System.out.println(name3==name4);		// false 
				// == it will the refrences 
		System.out.println(name3.equals(name4));//	 true
				// . equals will the check only the content not the refrence 
//		MCQ: Interview Question : 
//		diff b/n .equals and == in java 


	}
}
