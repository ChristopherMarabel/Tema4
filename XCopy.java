package bee_the_compiler;

public class XCopy {

	public static void main(String[] args) {
		int orig = 42;
		XCopy x = new XCopy();
		int y = x.sum(orig);
		System.out.println(orig + " " + y);
	}
	
	int sum(int arg) {
		arg = arg * 2;
		return arg;
	}
}

