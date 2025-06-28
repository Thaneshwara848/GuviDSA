package comD;
public class Demo1 {
	public static void main(String[] args) {
		String name="tHanesh";
		System.out.println(name.toUpperCase());
		System.out.println(name.toLowerCase());
		System.out.println(name.length());
		name="Thanaesh";
		System.out.println(name.length());
		System.out.println(name.trim().length()); // trim , it will remove the space 
		System.out.println(name.replace('t', 'M'));
		System.out.println(name.charAt(3));
		System.out.println(name.endsWith("z"));
		System.out.println(name.startsWith("A"));
		System.out.println(name.substring(0,4));
		name=name.concat("Kumar");
		System.out.println(name);
		System.out.println(name.contains("Kumar"));
		String n1="Suresh";
		System.out.println(n1.equals("suresh"));
		System.out.println(n1.equalsIgnoreCase("suresh"));
		
		
		System.out.println("=========================");
		String user="Sachin";
		System.out.println(user);
		user.concat("Kumar");		// string is a immuatble // we cant change 
		//user=user.concat("Kumar");
		System.out.println(user);
		
		StringBuffer sb= new StringBuffer("Sachin");	// SB is a mutable : we can modify 
		sb.append("Kuamr");
		System.out.println(sb);
		sb.insert(0, "Mr ");
		System.out.println(sb);
		sb.delete(9, 14);
		System.err.println(sb);
		sb.reverse();
		System.out.println(sb);
		
	}

}
