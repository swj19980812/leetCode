package 常用函数;

public class Print<T> {


	public static <T> void print(T[] n) {
		for(T i:n) {
			System.out.println(i);
		}
	}
}
