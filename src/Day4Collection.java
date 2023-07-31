import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Day4Collection {

	public static void main(String[] args) {
		
	HashMap<Integer, String> map = new HashMap<>();
	
	map.put(100, "Sai");
	map.put(101, "Rama");
	map.put(102, "Sai");
	
	Set<Integer> set = map.keySet();
	
	for(int val : set) {
		
		System.out.println(map.get(val));
	}
	}
}



//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.HashMap;
//
//public class Day4Collection {
//
//	public static void main(String[] args) {
//		
//	HashMap<Integer, String> map = new HashMap<>();
//	
//	map.put(100, "Sai");
//	map.put(101, "Rama");
//	map.put(102, "Sai");
//	
//	System.out.println(map.get(101));
//	
//	map.put(101, "Amrita");
//	
//	System.out.println(map.get(101));
//	}
//}


//public class Day4Collection {
//
//	public static void main(String[] args) {
//		
//	HashMap<Integer, String> map = new HashMap<>();
//	
//	map.put(100, "Sai");
//	map.put(101, "Rama");
//	map.put(102, "Sai");
//	
//	//System.out.println(map.size());
//	
//	System.out.println(map.get(101));
//	}
//}


//public class Day4Collection {
//
//	public static void main(String[] args) {
//		
//		ArrayList<Integer> al = new ArrayList<>();
//		
//		al.add(45);    al.add(12);    al.add(876);
//		
//		Collections.sort(al);//Sort() is static method of Collections inbuilt class which is used to sort the list...
//		
//		for(int value : al) {
//			
//			System.out.println(value);
//		}
//	}
//}



//import java.util.Comparator;
//import java.util.TreeSet;
//
//class A implements Comparable<A>{
//	
//	int i = 4, j = 5;
//
//	@Override
//	public int compareTo(A o) {
//		System.out.println("isnide Comparable ");
//		if(i < o.i) {
//			return -1;
//		}
//		else {
//			return 1;
//		}
//	}
//}
//
//class JComparator implements Comparator<A> {
//
//	@Override
//	public int compare(A o1, A o2) {
//		System.out.println("inside comparator...");
//		if(o1.j < o2.j) {
//			return -1;
//		}
//		else {
//			return 1;
//		}
//	}
//}
//
//public class Day4Collection {
//
//	public static void main(String[] args) {
//
//		TreeSet<A> set = new TreeSet<>(new JComparator());// TreeSet is sorted...
//
//		A a1 = new A();  A a2 = new A();   A a3 = new A();
//		a1.i = 67;    a2.i = 87;     a1.j = 10;
//		
//		set.add(a1);                       set.add(a2);                    set.add(a3);
//		
//		for(A a : set) {
//			
//			System.out.println(a.i+", "+a.j);
//		}
//
//	}
//}




//import java.util.TreeSet;
//
//class A implements Comparable<A>{
//	
//	int i = 4, j = 5;
//
//	@Override
//	public int compareTo(A o) {
//		System.out.println("isnde ");
//		if(i < o.i) {
//			return -1;
//		}
//		else {
//			return 1;
//		}
//	}
//}
//
//public class Day4Collection {
//
//	public static void main(String[] args) {
//
//		TreeSet<A> set = new TreeSet<>();// TreeSet is sorted...
//
//		A a1 = new A();  A a2 = new A();   A a3 = new A();
//		a1.i = 67;    a2.i = 87;
//		
//		set.add(a1);                       set.add(a2);                    set.add(a3);
//		
//		for(A a : set) {
//			
//			System.out.println(a.i+", "+a.j);
//		}
//
//	}
//}


//public class Day4Collection {
//
//	public static void main(String[] args) {
//
//		TreeSet<Integer> set = new TreeSet<>();// TreeSet is sorted...
//
//		set.add(45);
//		set.add(67);
//		set.add(12);
//		set.add(23);
//
//		for (int name : set) {
//
//			System.out.println(name);
//		}
//
//	}
//}

//public class Day4Collection {
//
//	public static void main(String[] args) {
//
//	TreeSet<String> set = new TreeSet<>();//TreeSet is sorted...
//
//	set.add("Manit");
//	set.add("Sai");
//	set.add("Rama");
//	set.add("Krishna");
//	
//	for(String name : set) {
//		
//		System.out.println(name);
//	}
//	
//	}
//}

//public class Day4Collection {
//
//	public static void main(String[] args) {
//
//	HashSet<String> set = new HashSet<>();//This HashSet is unordered that means you will not get the get the 
//																	//elemenets in the same order in which they were inserted...
//
//	set.add("Manit");
//	set.add("Sai");
//	set.add("Rama");
//	set.add("Krishna");
//	
//	for(String name : set) {
//		
//		System.out.println(name);
//	}
//	
//	}
//}

//import java.util.ArrayList;
//import java.util.HashSet;
//
//class A {
//	
//	int i = 4, j = 5;
//	
//	public int hashCode() {
//		System.out.println("inside hashCode()");
//		return 10;
//	}
//	
//	public boolean equals(Object obj) {
//		System.out.println("insdie equals");
//		A a = (A)obj;
//		
//		if(i == a.i) {
//			
//			return true;
//		}
//		else {
//			return false;
//		}
//	}
//}
//
//public class Day4Collection {
//
//	public static void main(String[] args) {
//
//	HashSet<A> set = new HashSet<>();
//
//		A a1 = new A();
//		A a2 = new A();
//		
//		a2.i = 10;
//		
//		set.add(a1);   set.add(a2);
//		
//		System.out.println(set.size());
//		
//	
//	}
//}

//import java.util.ArrayList;
//import java.util.HashSet;
//
//class A {
//	
//	int i = 4, j = 5;
//	
//	public int hashCode() {
//		System.out.println("inside hashCode()");
//		return 10;
//	}
//	
//	public boolean equals(Object obj) {
//		System.out.println("insdie equals");
//		A a = (A)obj;
//		
//		if(i == a.i) {
//			
//			return true;
//		}
//		else {
//			return false;
//		}
//	}
//}
//
//public class Day4Collection {
//
//	public static void main(String[] args) {
//
//	HashSet<A> set = new HashSet<>();
//
//		A a1 = new A();
//		A a2 = new A();
//		
//		set.add(a1);   set.add(a2);
//		
//		System.out.println(set.size());
//		
//	
//	}
//}

//class A {
//	
//	int i = 4, j = 5;
//	
//	public boolean equals(Object obj) {
//		System.out.println("insdie equals");
//		A a = (A)obj;
//		
//		if(i == a.i) {
//			
//			return true;
//		}
//		else {
//			return false;
//		}
//	}
//}
//
//public class Day4Collection {
//
//	public static void main(String[] args) {
//
//	HashSet<A> set = new HashSet<>();
//
//		A a1 = new A();
//		A a2 = new A();
//		
//		set.add(a1);   set.add(a2);
//		
//		System.out.println(set.size());
//		
//	
//	}
//}

//import java.util.ArrayList;
//import java.util.HashSet;
//
//public class Day4Collection {
//
//	public static void main(String[] args) {
//
//	HashSet<String> set = new HashSet<>();
//
//		set.add("23");
//		
//		set.add("4565");
//		
//		set.add("Manit");
//		
//		set.add("23");
//		set.add("t544");
//		
////		System.out.println(set.size());
//		
//		for(String val : set) {
//			System.out.println(val);
//		}
//	
//	}
//}

//import java.util.ArrayList;
//
//public class Day4Collection {
//
//	public static void main(String[] args) {
//
//		ArrayList<Integer> list = new ArrayList<>();
//
//		list.add(34);
//		list.add(67);
//		list.add(21);
//
//		// list.add("Sai");//This is illegal since ArrayList is generic to only Integer
//		// values...
//
////		for (int i = 0; i < list.size(); i++) {
////
////			System.out.println(list.get(i));
////		}
//		
//		for(int value : list) {
//			
//			System.out.println(value+10);
//		}
//
//	}
//}

//import java.util.ArrayList;
//
//public class Day4Collection {
//	
//	public static void main(String[] args) {
//		
//		ArrayList al = new ArrayList();//THis arrayList can have any type of data which is not good for programming...
//		
//		al.add(10);
//		al.add(23);
//		al.add(32);
//		
//		al.add("Sai");
//		
//		Day4Collection d1 = new Day4Collection();
//		
//		
//		al.add(d1);
//		
//		for(int i = 0; i < al.size(); i++) {
//			
//			System.out.println(al.get(i));
//		}
//	}
//}

//import java.util.ArrayList;
//
//public class Day4Collection {
//	
//	public static void main(String[] args) {
//		
//		ArrayList al = new ArrayList();
//		
//		al.add(10);
//		al.add(23);
//		al.add(32);
//		
//		al.set(1, 50);
//		
//		for(int i = 0; i < al.size(); i++) {
//			
//			System.out.println(al.get(i));
//		}	
//	}
//
//}

//public class Day4Collection {
//	
//	public static void main(String[] args) {
//		
//		ArrayList al = new ArrayList();
//		
//		al.add(10);
//		al.add(23);
//		al.add(32);
//		
//		al.add(1, 50);
//		
//		for(int i = 0; i < al.size(); i++) {
//			
//			System.out.println(al.get(i));
//		}	
//	}
//
//}

//public class Day4Collection {
//	
//	public static void main(String[] args) {
//		
//		ArrayList al = new ArrayList();
//		
//		al.add(10);
//		al.add(23);
//		al.add(32);
//		
//		for(int i = 0; i < al.size(); i++) {
//			
//			System.out.println(al.get(i));
//		}	
//	}
//
//}

//public class Day4Collection {
//	
//	public static void main(String[] args) {
//		
//		ArrayList al = new ArrayList();
//		
//		al.add(10);
//		al.add(23);
//		al.add("Rama Krishna");
//		
//		System.out.println(al.get(2));
//	}
//
//}

//public class Day4Collection {
//	
//	public static void main(String[] args) {
//		
//		ArrayList al = new ArrayList();
//		
//		al.add(10);
//		al.add(23);
//		al.add("Rama Krishna");
//		
//		System.out.println(al.contains(23));
//	}
//
//}

//public class Day4Collection {
//	
//	public static void main(String[] args) {
//		
//		ArrayList al = new ArrayList();
//		
//		al.add(10);
//		al.add(23);
//		al.add("Rama Krishna");
//		
//		System.out.println(al.size());
//	}
//
//}

//public class Day4Collection {
//	
//	public static void main(String[] args) {
//		
//		ArrayList al = new ArrayList();
//		
//		System.out.println(al.isEmpty());
//	}
//
//}
