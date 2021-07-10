package test;

class Temp1 implements Cloneable {
	int g;

	Temp1(int g) {
		this.g = g;
	}

	public Temp1 clone() {
		try {
			return (Temp1) super.clone();
		} catch (Exception e) {
			return null;
		}
	}
}

class Deep implements Cloneable {
	int x = 10;
	Temp1 t;

	Deep(int a) {
		t = new Temp1(a);
	}

	public Deep clone() {
//deep clone
		try {
			Deep d = (Deep) super.clone();
			d.t = t.clone();
			return d;
		} catch (Exception e) {
			return null;
		}
	}

	public static void main(String arg[]) {
		Deep c = null;
		Deep m = new Deep(100);
		System.out.println("m" + m.t.g);
		try {
			c = m.clone();
//c.t=m.t.clone();
		} catch (Exception e) {
		}
		System.out.println("c" + c.t.g);
		c.t.g = 300;
		System.out.println("m after" + m.t.g);
		if (m.t != c.t) {
			System.out.println("deep");
		}
	}
}