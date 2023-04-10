class OutABC {
	int num = 50;

	class Inner {
		public void print() {
			System.out.println("x = " + num);
		}
	}

	void InMethod() {
		Inner I = new Inner();
		I.print();
	}
}

public class InnerClass {

	public static void main(String args[]) {
		OutABC O = new OutABC();
		O.InMethod();
	}
}
