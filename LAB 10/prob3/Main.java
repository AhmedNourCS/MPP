package prob3;

import java.util.Arrays;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Bob", "Joe", "Tom");
		boolean result = Main.contains(list, "Tom");
		System.out.println(result);
	}

	public static boolean contains1(List<String> list, String s) {
		for (String x : list) {
			if (x == null && s == null)
				return true;
			if (s == null || x == null)
				continue;
			if (x.contentEquals(s))
				return true;
		}
		return false;
	}

	public static <T extends Comparable<? super T>> boolean contains(List<T> list, T t) {
		for (T x : list) {
			if (x == null && t == null)
				return true;
			if (x == null || t == null)
				continue;
			if (x.equals(t))
				return true;
		}

		return false;
	}

}
