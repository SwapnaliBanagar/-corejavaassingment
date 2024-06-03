package Ifelse;

public class CharacterCount {

	public static void main(String[] args) {
		String name="AAACCCDFF";
		int length=name.length();
		int countA=0;
		int countC=0;
		int countD=0;
		int countF=0;
		for(int i=0; i<length; i++) {
			if("A".equals(String.valueOf(name.charAt(i)))) {
				countA++;
			}
			else if("C".equals(String.valueOf(name.charAt(i)))) {
				countC++;

			}
			else if("D".equals(String.valueOf(name.charAt(i)))) {
				countD++;
			}
			else if("F".equals(String.valueOf(name.charAt(i)))) {
				countF++;
			}
			else {
				System.out.println("Try Again");
			}
		} 
		System.out.print("A"+countA+"C"+countC+"D"+countD+"F"+countF);
		

	}
}


