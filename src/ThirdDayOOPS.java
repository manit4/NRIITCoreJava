class Car {
	
	int i = 4;
	
	void ClimateControl() {
		System.out.println("ClimateControl of Car");
	}
}

class Swift extends Car {
	
	int j = 5;
	
	void powerWindow() {
		System.out.println("PowerWindow");
	}
}

public class ThirdDayOOPS {

	public static void main(String[] args) {
		
		Car c = new Swift();    
		System.out.println(c.i);
		
		Swift s = (Swift) c;
		System.out.println(s.j);
	}	
}




//class Car {
//	
//	
//	void ClimateControl() {
//		System.out.println("ClimateControl of Car");
//	}
//}
//
//class Swift extends Car {
//	
//	void powerWindow() {
//		System.out.println("PowerWindow");
//	}
//}
//
//public class ThirdDayOOPS {
//
//	public static void main(String[] args) {
//		
//		Car c = new Swift();    c.ClimateControl();    c.powerWindow();//this is not legal...
//		Swift s = (Swift) c;    s.powerWindow();
//		
//	}	
//}



//
//class Car {//casting(up and down)
//	
//	void ClimateControl() {
//		System.out.println("ClimateControl of Car");
//	}
//}
//
//class Swift extends Car {
//	
//	void powerWindow() {
//		System.out.println("PowerWindow");
//	}
//}
//
//class Polo extends Car{
//	
//	void abs() {
//		System.out.println("abs");
//	}
//}
//
//public class ThirdDayOOPS {
//
//	public static void main(String[] args) {
//		
////		Swift s1 = new Swift();  //This is down casting which is automatic
////		
////		Car c = s1;
//		
//		Car c = new Swift();
//		Swift s = (Swift) c;
//		 
//		
//	}	
//}


//public class ThirdDayOOPS {
//	
//	int i = 4, j = 5, k;
//	
//	public static void main(String[] args) {
//		
//		ThirdDayOOPS t1 = new ThirdDayOOPS();
//		ThirdDayOOPS t2 = new ThirdDayOOPS();
//		
//		t2.i = 100;
//		
//		boolean status = t1.equals(t2);
//		
//		System.out.println(status);
//		
//	}
//	
//	public boolean equals(Object obj) {
//		
//		ThirdDayOOPS t = (ThirdDayOOPS) obj;
//		
//		if(i == t.i && j == t.j) {
//			return true;
//		}
//		else {
//			return false;
//		}
//	}
//}



//public class ThirdDayOOPS {
//	
//	int i = 4, j = 5, k;
//	
//	public static void main(String[] args) {
//		
//		ThirdDayOOPS t1 = new ThirdDayOOPS();
//		ThirdDayOOPS t2 = new ThirdDayOOPS();
//		
//		t2.i = 100;
//		
//		boolean status = t1.equals(t2);
//		
//		System.out.println(status);
//		
//	}
//	
//	public boolean equals(Object obj) {
//		
//		ThirdDayOOPS t = (ThirdDayOOPS) obj;
//		
//		if(i == t.i) {
//			return true;
//		}
//		else {
//			return false;
//		}
//	}
//}



//public class ThirdDayOOPS {
//	
//	int i = 4, j = 5, k;
//	
//	public static void main(String[] args) {
//		
//		ThirdDayOOPS t1 = new ThirdDayOOPS();
//		ThirdDayOOPS t2 = new ThirdDayOOPS();
//		
//		boolean status = t1.equals(t2);
//		
//		System.out.println(status);
//		
//	}
//	
//	public boolean equals(Object obj) {
//		
//		ThirdDayOOPS t = (ThirdDayOOPS) obj;
//		
//		if(i == t.i) {
//			return true;
//		}
//		else {
//			return false;
//		}
//	}
//}



//class A {
//	
//	int i = 4, j = 5, k = 12, l = 15, m = 20, n = 100;
//	
//	public String toString() {
//		return "the value is "+i;
//	}
//}
//
//
//public class ThirdDayOOPS {
//	
//	int i = 4, j = 5, k = 12, l = 15, m = 20, n = 100;
//	
//	public static void main(String[] args) {
//		
//		ThirdDayOOPS t1 = new ThirdDayOOPS();
//		A a = new A();
//		
//		System.out.println(t1);	
//		System.out.println(a);
//	}
//	
//	public String toString() {
//		
//		return "The values are "+i+", "+j+", "+k+", "+l+", "+m+", "+n;
//	}
//	
//	
//}

//public class ThirdDayOOPS {
//	
//	int i = 4, j = 5, k = 12, l = 15, m = 20, n = 100;
//	
//	public static void main(String[] args) {
//		
//		ThirdDayOOPS t1 = new ThirdDayOOPS();
//		ThirdDayOOPS t2 = new ThirdDayOOPS();
//		
//		System.out.println(t1);	
//		System.out.println(t2.toString());
//	}
//	
//	public String toString() {
//		
//		return "The values are "+i+", "+j+", "+k+", "+l+", "+m+", "+n;
//	}
//	
//	
//}


//public class ThirdDayOOPS {
//	
//	int i = 4;
//	int j = 5;
//	int k;
//
//	public static void main(String[] args) {
//		
//		ThirdDayOOPS t1 = new ThirdDayOOPS();
//		ThirdDayOOPS t2 = new ThirdDayOOPS();
//		
//		System.out.println("Before");
//		
//		System.out.println(t1.i);
//		System.out.println(t1.j);
//		System.out.println(t1.k);
//		System.out.println(t2.i);
//		System.out.println(t2.j);
//		System.out.println(t2.k);
//		
//		t1.add(t2);
//		
//		System.out.println("after");
//		
//		System.out.println(t1.i);
//		System.out.println(t1.j);
//		System.out.println(t1.k);
//		System.out.println(t2.i);
//		System.out.println(t2.j);
//		System.out.println(t2.k);
//	}
//	
//	void add(ThirdDayOOPS t) {
//		
//		t.k = i + t.j;
//	}
//}


//class Human {
//	
//	int iq = 5;
//	int height = 1;
//	
//	Human() {
//		
//	}
//	
//	Human(int i, int j) {
//		iq = i;
//		height = j;
//	}
//	
//	void studying() {
//		iq = iq + 1;
//	}
//	void playingBasketball() {
//		height++;
//	}
//}
//
//public class ThirdDayOOPS {
//
//	public static void main(String[] args) {
//		
//		Human sai = new Human(10, 2);
//		
//		Human manit = new Human();
//		
//		System.out.println(sai.iq);
//		System.out.println(sai.height);
//	
//		System.out.println(manit.iq);
//		System.out.println(manit.height);
//		
//	}	
//}


//
//class Human {
//	
//	int iq = 5;
//	int height = 1;
//	
//	Human() {//constructor name must be as same as the class name. Difference between constructor
//			//and the method is that the constructor does not have a return-type but method has return-type...
//		System.out.println("inside constructor...");
//	} 
//	
//	void studying() {
//		iq = iq + 1;
//	}
//	void playingBasketball() {
//		height++;
//	}
//}
//
//public class ThirdDayOOPS {
//
//	public static void main(String[] args) {
//		
//		Human manit = new Human();
//		Human sai = new Human();
//		
//		System.out.println(manit.iq);
//		System.out.println(manit.height);
//		
//		System.out.println(sai.iq);
//		System.out.println(sai.height);
//		
//	}	
//}


//class Human {
//	
//	int iq = 5;
//	int height = 1;
//	
//	void studying() {
//		iq = iq + 1;
//	}
//	void playingBasketball() {
//		height++;
//	}
//}
//
//public class ThirdDayOOPS {
//
//	public static void main(String[] args) {
//		
//		Human manit = new Human();//Here I am creating the object of Human class with the help 
//									//of no-argument constructor and is given by default in the 
//									//class(Human class)...
//		Human sai = new Human();
//		
//		System.out.println(manit.iq);
//		System.out.println(manit.height);
//		
//		System.out.println(sai.iq);
//		System.out.println(sai.height);
//	}	
//}


//interface Car {
//	
//	int i = 5;
//	
//	void abs();
//	void musicSystem();
//}
//
//
//
//public class ThirdDayOOPS {
//
//	public static void main(String[] args) {
//		
//		Car.i = 10; //all the variables decalred in an interface are internally public static and final, so you
//					//do not object to call the variable just interface name is enough and since 
//					//the variable is final so you can not change or update it...
//	}	
//}



//interface Car {
//	
//	void abs();//you do not need to write abstract with method since all the methods in an interface are abstract internally...
//	void musicSystem();
//}
//
//class Swift implements Car {//Swift here is implementation class
//	
//	public void abs() {//you must write the public keyword while giving implementation to 
//						//abstract method of an interface in implementation class. Swift here is implementation class...
//		System.out.println("abs");
//	}
//	public void musicSystem() {
//		System.out.println("musicSystem");
//	}
//}
//
//public class ThirdDayOOPS {
//
//	public static void main(String[] args) {
//		
//		 Swift s1 = new Swift();
//		 Car c = new Swift();
//	}	
//}



//interface Car {
//	
//	void abs();
//	void musicSystem(); //all the methods in an interface must be abstract(no body defined)
//						//you can not create object of an interface...
//}
//
//public class ThirdDayOOPS {
//
//	public static void main(String[] args) {
//		
//		 Car car = new Car();//You can not create object of an interface...
//	}	
//}


//abstract class Car {//Here there is no method unimplemented or abstract yet the class is 
//					//abstract...
//	
//	void abs() {
//		System.out.println("abs");
//	}
//	void musicSystem() {
//		System.out.println("musicSystem");
//	}
//}
//
//class Swift extends Car {
//	
//	void climateControl() {
//		System.out.println("ClimateControl");
//	}
//}
//
//public class ThirdDayOOPS {
//
//	public static void main(String[] args) {
//		
//		  Swift s1 = new Swift();   s1.climateControl();    s1.abs();    s1.musicSystem();
//		  Car c = new Swift();//You can keep the object of child class in the reference variable of
//		  						//abstract class, but can not create object of abstract class...
//		  c.abs();   c.musicSystem();
//	}	
//}


//abstract class Car {//Here there is no method unimplemented or abstract yet the class is 
//					//abstract...
//	
//	void abs() {
//		System.out.println("abs");
//	}
//	void musicSystem() {
//		System.out.println("musicSystem");
//	}
//}
//
//public class ThirdDayOOPS {
//
//	public static void main(String[] args) {
//		
//		    Car car = new Car();//Abstract can not be instantiated or you can not create object
//		    					//of abstract class...
//		
//	}	
//}



//abstract class Car {
//	
//	void abs() {
//		System.out.println("abs");
//	}
//	abstract void musicSystem();//This is abstract method sine the method does not have a body
//								//If the method does not have a body then the method must 	
//								//be used with abstract keyword. If you have atleast one method 
//								//abstract or unimplemented in a class, then the class must be abstract... 
//}
//
//public class ThirdDayOOPS {
//
//	public static void main(String[] args) {
//		
//		    
//		
//	}	
//}


//final class Car {
//	
//	void ClimateControl() {
//		System.out.println("ClimateControl of Car");
//	}
//	
//}
//class Swift extends Car {//final class can not be extended....
//	
//	void powerWindow() {
//		
//		System.out.println("inside powerWindow of Swift");
//	}
//}
//
//public class ThirdDayOOPS {
//
//	public static void main(String[] args) {
//		
//		Swift s1 = new Swift();      
//		
//	}	
//}


//class Car {
//	
//	void ClimateControl() {
//		System.out.println("ClimateControl of Car");
//	}
//	final void abs() {
//		System.out.println("inside abs of Car...");
//	}
//}
//class Swift extends Car {
//	
//	void powerWindow() {
//		
//		System.out.println("inside powerWindow of Swift");
//	}
//	void abs() {//this is liiegal since you can not override the final method of Parent class...
//		System.out.println("inside abs of Swift...");
//	}
//}
//
//public class ThirdDayOOPS {
//
//	public static void main(String[] args) {
//		
//		Swift s1 = new Swift();       s1.ClimateControl();     s1.powerWindow();   s1.abs();
//		
//	}	
//}


//
//class Car {
//	
//	final int i = 4;
//	
//	void ClimateControl() {
//		
//		i = 6;//It is illegal to update the value of final keyword...
//		System.out.println("ClimateControl of Car");
//	}
//	
//}
//
//public class ThirdDayOOPS {
//
//	public static void main(String[] args) {
//		
//		Car c = new Car();
//		
//		c.i = 10;//this is also illegal since I can not update the value of final keyword...
//		
//	}	
//}

//
//class Arithmetic {
//
//	void add(int i, int j) {
//
//		System.out.println(i + j);
//	}
//	void add(int i, int j, int k) {
//
//		System.out.println(i + j + k);
//	}
//	void add(int i, int j, int k, int l) {
//
//		System.out.println(i + j + k + l);
//	}
//}
//
//public class ThirdDayOOPS {
//
//	public static void main(String[] args) {
//		
//		Arithmetic a1 = new Arithmetic();
//		a1.add(20, 15, 50, 100);
//		a1.add(40, 5, 70);
//
//	}
//}

//class Car {//Method-Overriding is done when Child class does not like any method/s of Parent class
//			//What you can do is to redefine the method in the child class also. As you can see
//			//abs was already present in the Parent class yet I redefined in the Child class
//			//also. The rule you must follow is to keep the method signature same in the child class( means, method 
//			//name, return type, method arguments list...
//	
//	void ClimateControl() {
//		System.out.println("ClimateControl of Car");
//	}
//	void abs() {
//		System.out.println("inside abs of Car...");
//	}
//}
//class Swift extends Car {
//	
//	void powerWindow() {
//		
//		System.out.println("inside powerWindow of Swift");
//	}
//	void abs() {
//		System.out.println("inside abs of Swift...");
//	}
//}
//
//public class ThirdDayOOPS {
//
//	public static void main(String[] args) {
//		
//		Swift s1 = new Swift();       s1.ClimateControl();     s1.powerWindow();   s1.abs();
//		
//	}	
//}

//class Car {
//	
//	void ClimateControl() {
//		System.out.println("ClimateControl of Car");
//	}
//}
//class Swift extends Car {
//	
//	void powerWindow() {
//		
//		System.out.println("inside powerWindow of Swift");
//	}
//}
//
//public class ThirdDayOOPS {
//
//	public static void main(String[] args) {
//		
//		Swift s1 = new Swift();       s1.ClimateControl();     s1.powerWindow();
//		Car c = new Car();      c.ClimateControl();
//		Car c1 = new Swift();   c1.ClimateControl();       
//		c1.powerWindow();//This is illegal statement since I am trying to call powerWindow()
//						//on c1 and c1 is of Car type then it will check whether powerWindw()
//						//is present in the class Car or not. If not there, then it is a problem...
//		
//	}	
//}

//
//class Car {
//	
//	void ClimateControl() {
//		System.out.println("ClimateControl of Car");
//	}
//}
//
//
//class Swift extends Car {
//	
//	void powerWindow() {
//		
//		System.out.println("inside powerWindow of Swift");
//	}
//}
//
//public class ThirdDayOOPS {
//
//	public static void main(String[] args) {
//		
//		Swift s1 = new Swift();       s1.ClimateControl();     s1.powerWindow();
//		Car c = new Car();      c.ClimateControl();
//		Car c1 = new Swift();//you can have object of Child class in the reference variable of Child
//							//class as well as in the reference variable of Parent class...
//								
//	}	
//}

//class Car {
//	
//	int phone = 4;
//	
//	void ClimateControl() {
//		System.out.println("The value of i is "+phone);
//	}
//}
//
//
//class Swift extends Car {
//	
//	int phone = 5;
//	
//	void powerWindow() {
//		
//		int phone = 6;
//		
//		System.out.println("The value of j of Swift is "+this.phone);
//	}
//}
//
//public class ThirdDayOOPS {
//
//	public static void main(String[] args) {
//		
//		Swift s1 = new Swift();       s1.ClimateControl();     s1.powerWindow();
//		 
//	}	
//}

//class Car {
//	
//	int phone = 4;
//	
//	void ClimateControl() {
//		System.out.println("The value of i is "+phone);
//	}
//}
//
//
//class Swift extends Car {
//	
//	int phone = 5;
//	
//	void powerWindow() {
//		
//		System.out.println("The value of j of Swift is "+super.phone);
//	}
//}
//
//public class ThirdDayOOPS {
//
//	public static void main(String[] args) {
//		
//		Swift s1 = new Swift();       s1.ClimateControl();     s1.powerWindow();
//		 
//	}	
//}

//class Car {
//	
//	int i = 4;
//	
//	void ClimateControl() {
//		System.out.println("The value of i is "+i);
//	}
//}
//
//
//class Swift extends Car {
//	
//	int j = 5;
//	
//	void powerWindow() {
//		System.out.println("The value of j of Swift is "+j);
//	}
//}
//
//class Polo extends Car{
//	
//	int j = 6;
//	
//	void abs() {
//		System.out.println("The vale of j of Polo is "+j);
//	}
//}
//
//public class ThirdDayOOPS {
//
//	public static void main(String[] args) {
//		
//		Swift s1 = new Swift();       s1.ClimateControl();     s1.powerWindow();
//		 
//		Polo p1 = new Polo();         p1.ClimateControl();     p1.abs();
//	}	
//}

//class Car {
//	
//	int i = 4;
//	
//	void ClimateControl() {
//		System.out.println(i);
//	}
//}
//
//
//class Swift extends Car {
//	
//	int j = 5;
//	
//	void powerWindow() {
//		System.out.println(i+j);//here I am using "i and j" in the Child class since "i" is
//								//declared in the parent class and "j" is declared in the 
//								//Child class...
//	}
//}
//
//class Polo extends Car{
//	
//	void abs() {
//		System.out.println(i+j);//We can not use "j" here since "j" is not declared in Polo
//								//as well as in Car class...
//	}
//}
//
//public class ThirdDayOOPS {
//
//	public static void main(String[] args) {
//		
//		Swift s1 = new Swift();       s1.ClimateControl();     s1.powerWindow();
//		 
//		Polo p1 = new Polo();         p1.ClimateControl();     p1.abs();
//		
//		Car c = new Car();       c.ClimateControl();
//	}	
//}

//class Car {
//	
//	int i = 4;
//	
//	void ClimateControl() {
//		System.out.println(i);
//	}
//}
//
//
//class Swift extends Car {
//	
//	void powerWindow() {
//		System.out.println(i);//We can use the variables in the child class methods 
//							//which is declared in the Parent class...
//	}
//}
//
//class Polo extends Car{
//	
//	void abs() {
//		System.out.println(i);
//	}
//}
//
//public class ThirdDayOOPS {
//
//	public static void main(String[] args) {
//		
//		Swift s1 = new Swift();       s1.ClimateControl();     s1.powerWindow();
//		 
//		Polo p1 = new Polo();         p1.ClimateControl();     p1.abs();
//		
//		Car c = new Car();       c.ClimateControl();
//	}	
//}

//class Car {
//	
//	void ClimateControl() {
//		System.out.println("ClimateControl of Car");
//	}
//}
//
//
//class Swift extends Car {
//	
//	void powerWindow() {
//		System.out.println("PowerWindow");
//	}
//}
//
//class Polo extends Car{
//	
//	void abs() {
//		System.out.println("abs");
//	}
//}
//
//public class ThirdDayOOPS {
//
//	public static void main(String[] args) {
//		
//		Swift s1 = new Swift();       s1.ClimateControl();     s1.powerWindow();
//		 
//		Polo p1 = new Polo();         p1.ClimateControl();     p1.abs();
//		
//		Car c = new Car();       c.ClimateControl();
//	}	
//}
