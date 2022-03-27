package generics;

public class MainClass {
	public static void main(String[] args) {
		Integer ai = 1, bi = 2, ci = 3;
		Float af = 1.1f, bf = 2.2f, cf = 3.3f;
		String as = "hel", bs = "hell", cs = "hello";

		FindMaxStringUC3 test = new FindMaxStringUC3();
		test.findMaxValue(ai, bi, ci);
		test.printMax(af, bf, cf);
		test.findMaxValue(as, bs, cs);
	}
}
