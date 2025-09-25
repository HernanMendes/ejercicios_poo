public class Clase2 {
	static void myMethod() {
		System.out.println("I just got executed!");
	}

	static void myMethod(String fname) {
		System.out.println("Hello " + fname);
	}

	static void myMethod(String fname, int age) {
		System.out.println(fname + " tiene " + age);
	}

	static int myMethod(int x, int y) {
		return x + y;
	}

	public static void main(String[] args) {// TODO Auto-generated method stub
		myMethod();
		myMethod("Rolando");
		myMethod();
		myMethod("Juan");
		myMethod("Pedro", 22);
		System.out.println(myMethod(5, 3));

	}
}
