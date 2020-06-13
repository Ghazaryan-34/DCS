package sorting;

public class Swap {
	private int a;
	private int b;
	public void set(int a, int b) {
		this.a = a;
		this.b = b;
	}
	public int getA() {
		return this.a;
	}
	public int getB() {
		return this.b;
	}
	public void printValues() {
		System.out.println("a = " + getA() + "; b = " + getB());
	}
	public void swapValues() {     //  a = 2;  b = 5
		this.a = this.a + this.b;  //  a = 7
		this.b = this.a - this.b;  //  b = 2
		this.a = this.a - this.b;  //  a = 5
	}
}
