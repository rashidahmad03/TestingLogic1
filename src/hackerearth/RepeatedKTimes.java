package hackerearth;

import java.util.TreeSet;

public class RepeatedKTimes {

//	public static void main(String[] args) throws Exception {
//		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
//		String T = bf.readLine();
//
//	}
	public static void main(String args[]) {
		TreeSet<Integer> set = new TreeSet<>();
		set.add(4);
		set.add(2);
		set.add(3);
		set.add(1);

		System.out.println(set.headSet(1).size());// 0
		System.out.println(set.headSet(2).size());// 1
		System.out.println(set.headSet(3).size());// 2
		System.out.println(set.headSet(4).size());// 3
		System.out.println(set.headSet(-1).size());// 0!!Caution!,retusn 0 though it does not exits

	}
}
