class Human {
	
	int i = 4;
	
	void display() {
		
		int i = 5;
		
		System.out.println(this.i);//keyword "this" is used to give priority to the object variable if
									//local and global variable has the same name...
	}
}

public class Aishwarya {

	public static void main(String[] args) {
		
		Human h1 = new Human();
		Human h2 = new Human();
		
		h1.display();
		h2.display();
	}	
}


//class Human {//you can have local variable as well as global variable with the same name but local
//				//variable is given preference  but what if I do not want to use the local variable
//				//which is given preference by default but want to use global variable forcefully then 
//				//you should take help of another keyword "this". To understand keyword "this", refer
//				//the next example....
//	
//	int i = 4;
//	
//	void display() {
//		
//		int i = 5;
//		
//		System.out.println(i);
//	}
//}
//
//public class Aishwarya {
//
//	public static void main(String[] args) {
//		
//		Human h1 = new Human();
//		
//		h1.display();
//	}	
//}


//class Car {//We have fixed the duplicacy from the previous example by inheritance. On Child class object,
//			//you can call members(variables as well as methods) of its own class as well as its parent class...
//	
//	void ClimateControl() {
//		System.out.println("ClimateControl of Polo");
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
//public class Aishwarya {
//
//	public static void main(String[] args) {
//		
//		Swift s1 = new Swift();       s1.ClimateControl();     s1.powerWindow();
//		 
//		Polo p1 = new Polo();         p1.ClimateControl();     p1.abs();
//	}	
//}


//class Swift {//This example is without inheritance since there is common functionality(climateControl())
				//is present in both the classses (Swift as well as in Polo). This leads to duplicacy
				//which will be fixed by inheritance in the next example... 
//	
//	void powerWindow() {
//		System.out.println("PowerWindow");
//	}
//	
//	void ClimateControl() {
//		System.out.println("ClimateControl of Swify");
//	}
//}
//
//class Polo {
//	
//	void abs() {
//		System.out.println("abs");
//	}
//	
//	void ClimateControl() {
//		System.out.println("ClimateControl of Polo");
//	}
//}
//
//public class Aishwarya {
//
//	public static void main(String[] args) {
//		
//		Swift s1 = new Swift();       s1.ClimateControl();     s1.powerWindow();
//		 
//		Polo p1 = new Polo();         p1.ClimateControl();     p1.abs();
//	}	
//}







//class Human {
//
//	int aptitude = 10;
//	int height = 1;
//	int mascularStrength = 20;
//
//	void playBasketBall() {
//
//		height = height + 1;
//	}
//
//	void studing() {
//
//		aptitude = aptitude + 3;
//	}
//
//	void gyming() {
//
//		mascularStrength = mascularStrength + 10;
//	}
//}
//
//public class Aishwarya {
//
//	public static void main(String[] args) {
//
//		Human durga = new Human();
//		Human manit = new Human();
//		Human divya = new Human();
//
//		System.out.println("Before methods calling...");
//
//		System.out.println(durga.aptitude);
//		System.out.println(durga.mascularStrength);
//		System.out.println(durga.height);
//
//		System.out.println(manit.aptitude);
//		System.out.println(manit.mascularStrength);
//		System.out.println(manit.height);
//
//		System.out.println(divya.aptitude);
//		System.out.println(divya.mascularStrength);
//		System.out.println(divya.height);
//		
//
//		durga.studing();
//		durga.playBasketBall();
//
//		manit.gyming();
//
//		divya.studing();
//
//		System.out.println("after methods calling...");
//
//		System.out.println(durga.aptitude);
//		System.out.println(durga.mascularStrength);
//		System.out.println(durga.height);
//
//		System.out.println(manit.aptitude);
//		System.out.println(manit.mascularStrength);
//		System.out.println(manit.height);
//
//		System.out.println(divya.aptitude);
//		System.out.println(divya.mascularStrength);
//		System.out.println(divya.height);
//	}
//}

//class Arithmetic {
//	
//	int i = 4;
//
//	void add() {
//
//		System.out.println("inside add()");
//	}
//}
//
//public class Aishwarya {
//
//	public static void main(String[] args) {
//		
//		Arithmetic a1 = new Arithmetic();
//		
//		System.out.println(a1.i);
//
//	}
//}

//class Arithmetic {
//
//	static void add() {
//
//		System.out.println("inside add()");
//	}
//}
//
//public class Aishwarya {
//
//	public static void main(String[] args) {
//		
//		Arithmetic.add();//Here I am trying to tell system forcefully to access the add() of Arithmetic
//						//class since add() is in Aishwarya as well as in Arithmetic class. So by default, 
//						//executes the add() version of that class from where you are calling...
//
//	}
//
//	static void add() {
//
//		System.out.println("inside main()");
//	}
//
//}

//class Arithmetic {
//
//	static void add() {
//
//		System.out.println("inside add()");
//	}
//}
//
//public class Aishwarya {
//
//	public static void main(String[] args) {
//		
//		add();//I could call add() without the class name itself, since I am calling add() from the
//				//Aishwarya class and add() also in the Aishwarya class...
//
//	}
//
//	static void add() {
//
//		System.out.println("inside main()");
//	}
//
//}

//class Arithmetic {
//	
//	static void add() {
//		
//		System.out.println("inside add()");
//	}
//}
//
//public class Aishwarya {
//
//	public static void main(String[] args) {
//
//		System.out.println("inside main()");
//		
//		Arithmetic.add();//here, I am trying to call add() which is static. That means, I do not need 
//						//object to call add(). But I am calling add() with the class name, since I am 
//						//trying to call add() from the Aishwarya class but the add() is in another class
//						//In that case, You need class name also...
//		
//	}
//
//}

//class Arithmetic {
//	
//	void add() {
//		
//		System.out.println("inside add()");
//	}
//}
//
//public class Aishwarya {
//
//	public static void main(String[] args) {
//
//		System.out.println("inside main()");
//		
//		Arithmetic a =  new Arithmetic();
//		
//		a.add();//to call add(), you should have object of that class to which add() belongs... 
//		
//	}
//
//}

//public class Aishwarya {
//	
//	int i = 4;
//
//	public static void main(String[] args) {
//
//		System.out.println(i);// since main() is static method and that is why I can not access the
//		// non static variable and this is why this is illegal to call variable
//		// "i" from the static main()...
//		
//	}
//
//	void add() {
//
//		System.out.println(i);// here statement is legal since I can access the non static variable from
//								// the non static methods....
//	}
//
//}

//public class Aishwarya {
//	
//	int i = 4;
//	static int j = 5;
//	
//	public static void main(String[] args) {
//		
//		Aishwarya a1 = new Aishwarya();
//		
//		a1.add();
//			
//	}
//	
//	void add() {
//		
//		System.out.println(i);
//		System.out.println(j);//static variables can be accessed from the static as well as non static methods... 
//	}		
//}

//public class Aishwarya {
//	
//	int i = 4;
//	
//	public static void main(String[] args) {
//		
//		add();
//			
//	}
//	
//	static void add() {//from the static method, I can not access non-static variables but I can call
//						//only static variable/s
//		
//		System.out.println(i);//here I am trying to access non-static variable from the static method
//								//which is illegal... 
//	}		
//}

//public class Aishwarya {//static variables are not part of object and there is only copy per class
//						//of static variable/s...
//	
//	int i = 4;
//	int j = 5;
//	static int k;
//	
//	public static void main(String[] args) {
//		
//		Aishwarya a1 = new Aishwarya();
//		Aishwarya a2 = new Aishwarya();
//		
//		a1.add();
//		a2.add();
//			
//	}
//	
//	void add() {
//		
//		k = i + j + k;
//		
//		System.out.println(k);
//	}		
//}

//public class Aishwarya {
//	
//	int i = 4;
//	int j = 5;
//	int k;
//	
//	public static void main(String[] args) {
//		
//		Aishwarya a1 = new Aishwarya();
//		Aishwarya a2 = new Aishwarya();
//		
//		a1.add();
//		a2.add();
//			
//	}
//	
//	void add() {
//		
//		k = i + j + k;
//		
//		System.out.println(k);
//	}		
//}

//public class Aishwarya {
//	
//	public static void main(String[] args) {
//		
//	add();//accessed add() without object since the method is static...
//			
//	}
//	
//	static void add() {
//		
//		System.out.println("inside add()...");
//	}		
//}

//public class Aishwarya {//static keyword which is used with global variables(not with local variables) or
//						//with methods...
//	
//	static int i = 4;
//	
//	public static void main(String[] args) {
//		
//		System.out.println(i);//static variable got accessed with object even if "i" is globally declared...
//			
//	}
//		
//}

//public class Aishwarya {//this example is for method argument as well as for return statement together...
//	
//	public static void main(String[] args) {
//		
//		int j = 5;
//		
//		Aishwarya a1 = new Aishwarya();
//		
//		int returnedValue =  a1.add(j);
//		
//		System.out.println(returnedValue);
//	}
//	
//	int add(int value1) {
//		
//		int k = 10;
//		
//		value1 = value1 + k * 3;
//		
//		k = value1 +100;
//		
//		return k;
//	}	
//}

//public class Aishwarya {//this example is for method argument as well as for return statement together...
//	
//	public static void main(String[] args) {
//		
//		int j = 5;
//		
//		Aishwarya a1 = new Aishwarya();
//		
//		int returnedValue =  a1.add(j);
//		
//		System.out.println(returnedValue);
//	}
//	
//	int add(int value1) {
//		
//		int k = 10;
//		
//		value1 = value1 + k * 3;
//		
//		k = value1 +100;
//		
//		return k;
//	}	
//}

//public class Aishwarya {//example of method argument/parameter...
//	
//	public static void main(String[] args) {
//		
//		int j = 5;
//		int k = 10;
//		
//		Aishwarya a1 = new Aishwarya();
//		
//		a1.add(j, k);
//	}
//	
//	void add(int value1, int value2) {
//		
//		System.out.println(value1);
//		System.out.println(value2);	
//		
//	}	
//}

//public class Aishwarya {
//	
//	int i = 20;
//
//	public static void main(String[] args) {
//		
//		Aishwarya a = new Aishwarya();
//		
//		int returnedValue = a.add();
//		
//		System.out.println(returnedValue);
//		
//		
//	}
//	
//	int add() {
//		
//		int j = 5;
//		
//		System.out.println(j);
//		
//		j = j * 10 + i;
//		
//		return j;//return statement must be the last statement that means you can not have any more statement
//					//after the return statement...
//		
//	}	
//}

//public class Aishwarya {
//
//	public static void main(String[] args) {
//		
//		Aishwarya a = new Aishwarya();
//		
//		a.add();//this code is legal however, is not justified since add() is returning me  something
//				//and I am not taking or accepting it which is not good in any sense...
//		
//		
//	}
//	
//	int add() {
//		
//		int j = 5;
//		
//		System.out.println(j);
//		
//		return j;
//		
//	}	
//}

//public class Aishwarya {
//	
//	int i = 4;
//
//	public static void main(String[] args) {
//		
//		Aishwarya a1 = new Aishwarya();
//		Aishwarya a2 = new Aishwarya();
//		
//		a1.add();
//		
//		a2.add();
//		
//		
//	}
//	
//	void add() {
//		
//		int j = 5;
//		
//		j = i * 10 + j;
//		
//		System.out.println(j);
//	}	
//}

//public class Aishwarya {
//	
//	int i = 4;
//
//	public static void main(String[] args) {
//		
//		Aishwarya a = new Aishwarya();
//		
//		a.add();
//		
//		
//	}
//	
//	void add() {
//		
//		int j = 5;
//		
//		System.out.println(i);
//		
//		System.out.println(j);
//
//
//	}	
//}

//public class Aishwarya {
//	
//	int i = 4;
//
//	public static void main(String[] args) {
//		
//		Aishwarya a1 = new Aishwarya();
//		Aishwarya a2 = new Aishwarya();
//		
//		a2.i = 20;
//		
//		a1.add();
//		
//		a2.add();
//		
//		
//	}
//	
//	void add() {
//
//		System.out.println(i);
//
//	}	
//}

//public class Aishwarya {
//	
//	int i = 4;
//
//	public static void main(String[] args) {
//		
//		Aishwarya a1 = new Aishwarya();
//		Aishwarya a2 = new Aishwarya();
//		
//		a1.add();
//		
//		a2.add();
//		
//		
//	}
//	
//	void add() {
//
//		System.out.println(i);
//
//	}	
//}

//public class Aishwarya {
//	
//	int i = 4;
//
//	public static void main(String[] args) {
//		
//		Aishwarya aish = new Aishwarya();
//		
//		aish.add();
//	}
//	
//	void add() {
//
//		System.out.println(i);
//
//	}	
//}

//public class Aishwarya {//we can have same variables in more than 1 method as we have declared int i = 4
//						//in both the methods(main() as well as add())...
//
//	public static void main(String[] args) {
//		
//		int i = 4;//local variable of main() which can be used only inside main()...
//
//		System.out.println(i);
//		
//		Aishwarya a = new Aishwarya();
//		
//		a.add();
//
//	}
//
//	void add() {
//
//		int i = 4;//local variable of add() which can be used only inside add()...
//
//		System.out.println(i);
//
//	}
//
//}

//public class Aishwarya {
//	
//	
//	public static void main(String[] args) {
//		
//		Aishwarya aish = new Aishwarya();
//		
//		System.out.println("inside main()1");
//		
//		aish.add();
//		
//		
//		System.out.println("inside main()2");
//		
//	}
//	
//	void add() {
//		
//		System.out.println("inside add()");
//		System.out.println("inside add()2");
//	}
//	
//	
//}

//public class Aishwarya {
//	
//	
//	public static void main(String[] args) {
//		
//		
//		
//		
//	}
//	
//	void add() {
//		
//		System.out.println("inside add()");
//	}
//	
//	
//}

//public class Aishwarya {
//	
//	int i = 20;
//	
//	
//	public static void main(String[] args) {
//		
//		Aishwarya a1 = new Aishwarya();
//		Aishwarya a2 = new Aishwarya();
//		Aishwarya a3 = new Aishwarya();
//		
//		a1.i = a2.i + a3.i;
//		
//		System.out.println(a1.i);
//		
//		System.out.println(a2.i);
//		System.out.println(a3.i);
//		
//		
//		
//	}
//
//}

//public class Aishwarya {
//	
//	int i = 20;
//	
//	
//	public static void main(String[] args) {
//		
//		Aishwarya a1 = new Aishwarya();
//		Aishwarya a2 = new Aishwarya();
//		Aishwarya a3 = new Aishwarya();
//		
//		System.out.println(a1.i);
//		System.out.println(a2.i);
//		
//		System.out.println(a3.i);
//		
//		
//		
//	}
//
//}

//
//public class Aishwarya {//global variables are given space in the object...
//	
//	int i = 20;//This is global variable and if someone  wants to access this variable "i", that someone
//				//has to have object...
//	
//	
//	public static void main(String[] args) {
//		
//		int j = 30;//this is local variable and can not be given space in an object....
//		
//		Aishwarya a = new Aishwarya();
//		
//		System.out.println(a.i);//"i" is gobal variable so that is why it needed Object to be accessed...
//		
//		System.out.println(j);//since "j" islocal variable of main method that is why it was accessed
//								//directly(without any object 
//		
//		
//	}
//
//}

//
//public class Aishwarya {
//	
//	int i = 20;
//	int j = 30;
//	
//	public static void main(String[] args) {
//		
//		Aishwarya a = new Aishwarya();
//		
//		System.out.println(a.i);
//		
//		System.out.println(a.j);
//		
//		
//	}
//
//}
