package codevita;

class fibonacci {
	static int i=0;
	static int fib(int n) {
		
		System.out.println(n);
		if (n <= 1)
			return n;
		int a = fib(n - 1);
		System.out.println("value of a:-"+a+"---"+n);
		int b=fib(n - 2);
		System.out.println("value of b:-"+b+"---"+n);
		return a+b;
	}

	public static void main(String args[]) {
		int n = 6;
		System.out.println(fib(n));
	}
}