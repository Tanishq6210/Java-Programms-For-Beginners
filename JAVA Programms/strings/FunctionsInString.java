package strings;

public class FunctionsInString {

	public static void main(String[] args) {
		
		String name = "Tanishq";
		String name2 = "    Tyagi    ";
	    String name3 = new String("Tanishq");
	    
			System.out.println(name.charAt(4));
			System.out.println(name.length());
			System.out.println(name.substring(4));
			System.out.println(name.substring(2,5));
			System.out.println(name.contains("a"));
			System.out.println(name.equals(name2));
			System.out.println(name.equals(name3));
			System.out.println(name.isEmpty());
			System.out.println(name + " Tyagi");// Its the alter of conacat function of string
			System.out.println(name.concat(" Tyagi"));
			System.out.println(name.replace("a", "x"));
			
//		String names = "Tanishq , Vaibhav , Aditya , Abhay";
//		String names2[] = names.split(",");
//		for(int nam : names2) {
//			System.out.println(nam);
			System.out.println(name.indexOf("a"));
			System.out.println(name.toUpperCase());
			System.out.println(name2.trim());
	
	}
		}

	


