package array;

public class Diagonal {
	public static void abc() {
	System.out.println("xx");
	}
	public  void abc1() {
		System.out.println("xx");
	}

	public static void main(String[] args) {
		Diagonal d = null;
		d.abc();//print xx
		d.abc1();//null pointer exception
	}
}
