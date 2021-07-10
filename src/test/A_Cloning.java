package test;

class A {
	int z = 10;
	int l;

	A(int a) {
		this.l = a;
	}

}

public class A_Cloning implements Cloneable {
	A a;

	public A_Cloning clone() throws CloneNotSupportedException {
		return (A_Cloning) super.clone();
	}

	A_Cloning(int aa) {
		// TODO Auto-generated constructor stub
		a = new A(aa);
	}

	public static void main(String arg[]) throws CloneNotSupportedException {
		A_Cloning ac2;

		A_Cloning ac = new A_Cloning(100);

		System.out.println(ac.a.l);
		ac2 = ac.clone();
		System.out.println(ac2.a.l);
		ac2.a.l=1000;
		System.out.println(ac.a.l);
	}

}
