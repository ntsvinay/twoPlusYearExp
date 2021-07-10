package test;

public class MainCheck {
	public static void main(String[] args) {
		System.out.println("main ka ");
		new MainCheck().main();
	}

	public void main() {
		System.out.println("main ka without static");
	}
}
