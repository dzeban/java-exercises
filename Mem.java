import java.util.*;

public class Mem
{

	static Collection<Object> objects = new ArrayList<Object>();
	static long lastMaxMemory = 0;

	public static void main(String[] args) {
		try {
			while (true) {
				printMaxMemory();
				consumeSpace();
			}
		} catch (OutOfMemoryError e) {
			System.out.println("OutOfMemory");
			freeSpace();
			printMaxMemory();
		}
	}

	static void printMaxMemory() {
		long currentMaxMemory = Runtime.getRuntime().maxMemory();
		System.out.format("Runtime.getRuntime().maxMemory(): %,dK.%n", currentMaxMemory / 1024);
	}

	static void consumeSpace() {
		objects.add(new int[1_000_000]);
	}

	static void freeSpace() {
		objects.clear();
	}
}
