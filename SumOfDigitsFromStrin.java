package Week2.day2.Assignment;

public class SumOfDigitsFromStrin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "Tes12Le79af65";
		int sum = 0;

		String T = text.replaceAll("\\D", "");
		char[] Array = T.toCharArray();
		for (int i = 0; i < Array.length; i++) {
			int num = Character.getNumericValue(Array[i]);
			sum = sum + num;
		}
		System.out.println(sum);

	}

}
/*Method2
 * String text = "Tes12Le79af65"; int sum = 0; for (int i = 0; i <
 * text.length(); i++) { if (Character.isDigit(text.charAt(i))) { int
 * j=Character.getNumericValue(text.charAt(i)); sum=sum+j; } }
 * System.out.println(sum);
 * 
 */