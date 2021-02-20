package strings;

public class Anagram {

	public static void main(String[] args) {
	
		String a = "aabbc";
		String b = "cbba";
//		boolean visited[] = new boolean[b.length()];
//		boolean isAnagram = false;
//		
//		if(a.length()==b.length()) {
//			for(int i =0; i<a.length() ; i++)
//				{ 
//				  char c = a.charAt(i);
//				  isAnagram = false;
//				  for(int j =0 ; j<b.length() ; j++) {
//					  
//					  if(b.charAt(j) == c && visited[j] == false)
//					  {
//						  isAnagram = true;
//						  visited[j] = true;
//						  break;
//						  
//					  }
//				  }
//					  if(!isAnagram)
//					  break;
//					  	
//			}
//			
//		}
//		else
//			System.out.println("Not Anagram");
//	
//	if(isAnagram==true)
//		System.out.println("Yes , Strings are anagram");
//	if(isAnagram==false)
//		System.out.println("No , Strings are not Anagaram");
	
//	int al[] = new int[256];
//	int bl[] = new int[256];
//	boolean isAnagram = false;
//	for(char c : a.toCharArray())
//		{
//			int index = (int)c;
//			al[index]++;
//			
//		}
//	for(char c : b.toCharArray())
//		{	int index = (int)c;
//			bl[index]++;
//		
//		}
//	for(int i =0 ; i<256 ;i++) {
//	if(al[i] == bl[i])
//		isAnagram = true;
//	}
//	
//	if(isAnagram==true)
//		System.out.println("Yes , They are anagram");
//	else
//		System.out.println("No. They are not Anagram");

	
	int al[] = new int[256];
	int bl[] = new int[256];
	boolean isAnagram = false;
	for(char c : a.toCharArray())
		{
			int index = (int)c;
			al[index]++;
			
		}
	for(char c : b.toCharArray())
		{	int index = (int)c;
			al[index]--;
		
		}
	for(int i =0 ; i<256 ;i++) {
	isAnagram = true;
		if(al[i] != 0 ) {
			isAnagram = false;
			break;
		}
	}
		if(isAnagram==true)
		System.out.println("Yes , They are anagram");
	else
		System.out.println("No. They are not Anagram");

	
	}
	}
