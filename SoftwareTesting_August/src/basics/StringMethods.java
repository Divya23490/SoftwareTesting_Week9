package basics;

public class StringMethods {

	public static void main(String[] args) {
		String name="Welcome";
		           //0123456
		
		char ch=name.charAt(3); //m
		System.out.println(ch);
		
		String s=" to java training";
		
		name=name.concat(s);// combine  Welcome to java training
		System.out.println(name);
		System.out.println(name.contains("Divya")); //

	}

}
