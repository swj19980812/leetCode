package 常用函数;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Random;
import java.util.Stack;

public class GenerateData {

	public static Stack<Integer> generateStack(Integer num) {
		
		Stack stack = new Stack();
		List<Integer> list  = generateList(num);
		for(Integer li :list) {
			stack.push(li);
		}
		return stack;
	}
	public static List<Integer> generateList(Integer num) {
		List<Integer> list = new ArrayList();
		Random radom = new Random();
		for(int i=0;i<num;i++) {
			list.add(radom.nextInt(100));
		}
		//stack.push();
		return list;
	}
	public static List<Integer> generateOrderList(Integer num) {
		
		List<Integer> list = new ArrayList();
		Random radom = new Random();
		for(int i=0;i<num;i++) {
			list.add(radom.nextInt(100));
		}
		list.sort((Integer x,Integer y)-> x.compareTo(y));
		//stack.push();
		return list;
	}
	public static Queue generateQueue(Integer num) {
		
		Queue<Integer> queue = new LinkedList<Integer>();
		List<Integer> list  = generateList(num);
		for(Integer li :list) {
			queue.add(li);
		}
		return queue;
	}
	
	 public static void main(String[] args) {
		System.out.println(generateStack(10));
	}
}
