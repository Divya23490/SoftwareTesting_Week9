package basics;

public class StringEquals {

	public static void main(String[] args) {
		String s1="welcome";
		String s2="Welcome";
		String s3="welcome";
		String s4="Hello!";
		System.out.println(s1.equals(s2));// false as case is not same
		System.out.println(s1.equals(s3));//true
		System.out.println(s1.equals(s4));//false
		
		System.out.println(s1.equalsIgnoreCase(s2));//true
		System.out.println(s1.equalsIgnoreCase(s3));//true
		System.out.println(s1.equalsIgnoreCase(s4));//
		
		
		System.out.println(s1.length());//7
		System.out.println(s4.length());//6
		
		System.out.println(s1.substring(2));//lcome
		System.out.println(s1.substring(0, 2));// we
		
		
		String s="I have earned $4000";
		String s5="Welcome to the java Training!";
//		System.out.println(s5.replace('e', 'a'));
		String[] words=s5.split("\\s");
		for(String s6:words) {
			System.out.println(s6);
		}
		
		
		String s7="welcome TO THE TRAINING!";
		System.out.println(s7.toLowerCase());
		
		String s8="welcome to THE training!";
		System.out.println(s8.toUpperCase());
		
		
		int value=30;
		String s9=String.valueOf(value);
		System.out.println(s9+10);
		
		boolean valuenew=true;
		String s10=String.valueOf(valuenew);
		System.out.println(s10+ false);
		

	}

}
