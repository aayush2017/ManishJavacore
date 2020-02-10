
public class exceptionExam {
	public static void main(String s[]) {
		try {
		System.out.println(10*2);
		System.out.println(10+2);
		System.out.println(10/2);
		System.out.println(10-2);
			System.out.println(10/0); // Error
		} catch(Exception e) {
			System.out.println(e);
		}
		System.out.println(10*2);
	}
}
