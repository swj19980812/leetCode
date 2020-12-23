package 数据结构.表和栈和队列.使用;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import 常用函数.GenerateData;

public class QueueUse {

	
	/**
	 * 队列解决约瑟夫环问题
	 * 瑟夫环是一个数学的应用问题，具体为，已知 n 个人（以编号 1，2，3...n 分别表示）围坐在一张圆桌周围。
	 * 从编号为 k 的人开始报数，数到 m 的那个人出列；他的下一个人又从 1 开始报数，数到 m 的那个人又出列；依此规律重复下去，
	 * 直到圆桌周围的人全部出列。这个问题的输入变量就是 n 和 m，即 n 个人和数到 m 的出列的人。输出的结果，就是 n 个人出列的顺序。
	 */
	public static void jsoePhus(Integer n,Integer m) {
		LinkedList<Integer> que = new LinkedList();
		List<Integer> peList = GenerateData.generateList(n);
		System.out.println("起始顺序: "+peList.toString());
		Integer flag = 1;
		for(Integer a : peList) {
			que.add(a);
		}
		List<Integer> out = new ArrayList();
		while(que.size()>0) {
			Integer a = que.pop();
			
			if(flag == m) {
				flag = 1;
				out.add(a);
			}else {
				que.add(a);
				flag++;
			}
		}
		System.out.println("出列顺序: "+out.toString());
		
	}
	public static void main(String[] args) {
		jsoePhus(10,5);
	}
}
