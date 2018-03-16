
public class StringReverse {

	public static void main(String[] args) {
	
//		StringBuffer s1 = new StringBuffer("Raghvendra");
//		System.out.println(s1.reverse());
		
		String a = "Raghvendra";
		
		for(int i = a.length()-1;i>=0;i--){
			System.out.print(a.charAt(i));
		}
		
	}

}
