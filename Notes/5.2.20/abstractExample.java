abstract class demo5 {
	public void display() {
		System.out.println("Hello from Function");
	}
	abstract void printMess();
}
class demo6 extends demo5 {
	public void printMess() {
		System.out.println("Abstract Method");
	}
}
public class abstractExample {
	public static void main(String s[]) {
		demo6 d = new demo6();
		d.display();
		d.printMess();
	}
}
