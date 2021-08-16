package Week2.day2.Assignment;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "We learn java basics as part of java sessions in java week1";
		String[] A = text.split(" ");
		int count = 0;

		for (int i = 0; i < A.length; i++) {
			// System.out.println(i+" "+A[i]);

			for (int j = i + 1; j < A.length; j++) {
				if (A[i].equals(A[j])) {
					count = count + 1;
				}

				if (count>=1) {
					A[j]=A[j].replace(A[i],"");
					//System.out.println(i+" "+j);
					//count=0;
				}
}
			System.out.print(" "+A[i]+" ");

		}

	}
}
