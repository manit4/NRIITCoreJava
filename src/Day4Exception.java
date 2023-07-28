
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

class AgeOver10Exception extends RuntimeException {
	
}

public class Day4Exception {

	public static void main(String[] args) throws IOException {
		
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter your age!!!");
			
			int age = sc.nextInt();
			
			if(age <= 10) {
				System.out.println("You are welcome...");
			}
			else {
				throw new AgeOver10Exception();
			}
	}
}



//import java.io.File;
//import java.io.FileReader;
//import java.io.IOException;
//
//public class Day4Exception {
//
//	public static void main(String[] args) throws IOException {
//		
//			method1();
//		
//	}
//
//	static void method1() throws IOException {
//
//		method2();
//
//	}
//
//	static void method2() throws IOException {
//
//		File file = new File("C:\\Users\\Manit Hira\\OneDrive\\Documents\\NRIIT-Workspace//nri.txt");
//
//		FileReader reader = new FileReader(file);
//
//		System.out.println((char) reader.read());
//
//	}
//
//}



//import java.io.File;
//import java.io.FileReader;
//import java.io.IOException;
//
//public class Day4Exception {
//
//	public static void main(String[] args) {
//		try {
//			method1();
//		} catch (Exception e) {
//			System.out.println("catccchhh");
//			e.printStackTrace();
//		}
//	}
//
//	static void method1() throws IOException {
//
//		method2();
//
//	}
//
//	static void method2() throws IOException {
//
//		File file = new File("C:\\Users\\Manit Hira\\OneDrive\\Documents\\NRIIT-Workspace//nri.txt");
//
//		FileReader reader = new FileReader(file);
//
//		System.out.println((char) reader.read());
//
//	}
//
//}

//import java.io.File;
//import java.io.FileReader;
//import java.io.IOException;
//
//public class Day4Exception {
//
//	public static void main(String[] args) {
//
//		method1();
//	}
//
//	static void method1() {
//
//		try {
//			method2();
//		}
//		catch (Exception e) {
//			System.out.println("catccchhh");
//			e.printStackTrace();
//		}
//	}
//
//	static void method2() throws IOException{
//		
//		File file = new File("C:\\Users\\Manit Hira\\OneDrive\\Documents\\NRIIT-Workspace//nri.txt");
//		
//		
//			FileReader reader = new FileReader(file);
//			
//			System.out.println((char)reader.read());
//		
//			
//	}
//
//}

//import java.io.File;
//import java.io.FileReader;
//import java.io.IOException;
//
//public class Day4Exception {
//
//	public static void main(String[] args) {
//
//		method1();
//	}
//
//	static void method1() {
//
//		
//			method2();
//		
//	}
//
//	static void method2() {
//		
//		File file = new File("C:\\Users\\Manit Hira\\OneDrive\\Documents\\NRIIT-Workspace//nri.txt");
//		
//		try {
//			FileReader reader = new FileReader(file);
//			
//			System.out.println((char)reader.read());
//	}
//	catch (Exception e) {
//		System.out.println("catccchhh");
//		e.printStackTrace();
//	}
//			
//	}
//
//}

//import java.io.File;
//import java.io.FileReader;
//import java.io.IOException;
//
//public class Day4Exception {
//	
//	public static void main(String[] args) throws IOException{
//		
//		File file = new File("C:\\Users\\Manit Hira\\OneDrive\\Documents\\NRIIT-Workspace//nri.txt");
//		
//		
//			FileReader reader = new FileReader(file);
//			
//			System.out.println((char)reader.read());
//		
//	}
//}

//import java.io.File;
//import java.io.FileReader;
//
//public class Day4Exception {
//	
//	public static void main(String[] args) {
//		
//		File file = new File("C:\\Users\\Manit Hira\\OneDrive\\Documents\\NRIIT-Workspace//nri.txt");
//		
//		try {
//			FileReader reader = new FileReader(file);
//			
//			System.out.println((char)reader.read());
//		}
//		catch (Exception e) {
//			System.out.println("catch");
//			e.printStackTrace();
//		}	
//	}
//}

//import java.util.Scanner;
//
//public class Day4Exception {//you can have catch as well as finally with one try. You can 
//							//have finally without catch with try....
//	
//	public static void main(String[] args) {
//		
//		Scanner sc = new Scanner(System.in);
//		
//		try {
//			System.out.println("Please enter any no!!");
//			int enteredNo = sc.nextInt();
//			int i = 100/enteredNo;
//			System.out.println("second statement");
//			
//			String name = "Manit";
//			System.out.println("Enter the index!!");
//			int index = sc.nextInt();
//			System.out.println(name.charAt(index));
//			
//			int[] ages = {45, 34, 43};
//			System.out.println("Please enter the index of ages array!!");
//			int ageIndex = sc.nextInt();
//			System.out.println(ages[ageIndex]);
//			
//		}
//		
//		
//		finally {
//			System.out.println("inside finally...");
//		}
//	}
//
//}

//import java.util.Scanner;
//
//public class Day4Exception {//finally is a block which will always run whether we have exception 
//							//raised or not...
//	
//	public static void main(String[] args) {
//		
//		Scanner sc = new Scanner(System.in);
//		
//		try {
//			System.out.println("Please enter any no!!");
//			int enteredNo = sc.nextInt();
//			int i = 100/enteredNo;
//			System.out.println("second statement");
//			
//			String name = "Manit";
//			System.out.println("Enter the index!!");
//			int index = sc.nextInt();
//			System.out.println(name.charAt(index));
//			
//			int[] ages = {45, 34, 43};
//			System.out.println("Please enter the index of ages array!!");
//			int ageIndex = sc.nextInt();
//			System.out.println(ages[ageIndex]);
//			
//		}
//		
//		catch(ArithmeticException e) {
//			System.out.println("inside catch of ArithmeticException...");
//			e.printStackTrace();
//		}
//		catch (Exception e) {
//			System.out.println("inside EXception");
//			e.printStackTrace();
//		}
//		finally {
//			System.out.println("inside finally...");
//		}
//	}
//
//}

//import java.util.Scanner;
//
//public class Day4Exception {
//	
//	public static void main(String[] args) {
//		
//		Scanner sc = new Scanner(System.in);
//		
//		try {
//			System.out.println("Please enter any no!!");
//			int enteredNo = sc.nextInt();
//			int i = 100/enteredNo;
//			System.out.println("second statement");
//			
//			String name = "Manit";
//			System.out.println("Enter the index!!");
//			int index = sc.nextInt();
//			System.out.println(name.charAt(index));
//			
//			int[] ages = {45, 34, 43};
//			System.out.println("Please enter the index of ages array!!");
//			int ageIndex = sc.nextInt();
//			System.out.println(ages[ageIndex]);
//			
//		}
//		catch (Exception e) {
//			System.out.println("inside EXception");
//			e.printStackTrace();
//		}
//		catch(ArithmeticException e) {
//			System.out.println("inside catch of ArithmeticException...");
//			e.printStackTrace();
//		}
//		
//		
//	}
//
//}

//import java.util.Scanner;
//
//public class Day4Exception {
//	
//	public static void main(String[] args) {
//		
//		Scanner sc = new Scanner(System.in);
//		
//		try {
//			System.out.println("Please enter any no!!");
//			int enteredNo = sc.nextInt();
//			int i = 100/enteredNo;
//			System.out.println("second statement");
//			
//			String name = "Manit";
//			System.out.println("Enter the index!!");
//			int index = sc.nextInt();
//			System.out.println(name.charAt(index));
//			
//			int[] ages = {45, 34, 43};
//			System.out.println("Please enter the index of ages array!!");
//			int ageIndex = sc.nextInt();
//			System.out.println(ages[ageIndex]);
//			
//		}
//		catch(ArithmeticException e) {
//			System.out.println("inside catch of ArithmeticException...");
//			e.printStackTrace();
//		}
//		catch (Exception e) {
//			System.out.println("inside EXception");
//			e.printStackTrace();
//		}
//		
//	}
//
//}

//import java.util.Scanner;
//
//public class Day4Exception {
//	
//	public static void main(String[] args) {
//		
//		Scanner sc = new Scanner(System.in);
//		
//		try {
//			System.out.println("Please enter any no!!");
//			int enteredNo = sc.nextInt();
//			int i = 100/enteredNo;
//			System.out.println("second statement");
//			
//			String name = "Manit";
//			System.out.println("Enter the index!!");
//			int index = sc.nextInt();
//			System.out.println(name.charAt(index));
//			
//			int[] ages = {45, 34, 43};
//			System.out.println("Please enter the index of ages array!!");
//			int ageIndex = sc.nextInt();
//			System.out.println(ages[ageIndex]);
//			
//		}
//		catch(ArithmeticException e) {
//			System.out.println("inside catch of ArithmeticException...");
//			e.printStackTrace();
//		}
//		catch (IndexOutOfBoundsException e) {
//			System.out.println("indexOfBounds");
//			e.printStackTrace();
//		}
//		
//	}
//
//}

//import java.util.Scanner;
//
//public class Day4Exception {
//	
//	public static void main(String[] args) {
//		
//		Scanner sc = new Scanner(System.in);
//		
//		try {
//			System.out.println("Please enter any no!!");
//			int enteredNo = sc.nextInt();
//			int i = 100/enteredNo;
//			System.out.println("second statement");
//			
//			String name = "Manit";
//			System.out.println("Enter the index!!");
//			int index = sc.nextInt();
//			System.out.println(name.charAt(index));
//			
//			int[] ages = {45, 34, 43};
//			System.out.println("Please enter the index of ages array!!");
//			int ageIndex = sc.nextInt();
//			System.out.println(ages[ageIndex]);
//			
//		}
//		catch(ArithmeticException e) {
//			System.out.println("inside catch of ArithmeticException...");
//			e.printStackTrace();
//		}
//		catch (StringIndexOutOfBoundsException e) {
//			System.out.println("Inside catch of Stringindex");
//			e.printStackTrace();
//		}
//		catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println("inside catch of ArrayIndex");
//			e.printStackTrace();
//		}
//		
//	}
//
//}

//import java.util.Scanner;
//
//public class Day4Exception {
//	
//	public static void main(String[] args) {
//		
//		enterDivider();	
//	}
//	
//	static void enterDivider() {
//		
//		try {
//			Scanner sc = new Scanner(System.in);
//			System.out.println("Please enter any no!!");
//			int enteredNo = sc.nextInt();
//			int i = 100/enteredNo;
//			System.out.println("second statement");
//			
//			enterIndex();
//		}
//		catch(Exception e) {
//			e.printStackTrace();
//			enterDivider();
//		}
//		
//			
//	}
//	
//	static void enterIndex() {
//		try {
//			Scanner sc = new Scanner(System.in);
//			String name = "Manit";
//			System.out.println("Enter the index!!");
//			int index = sc.nextInt();
//			System.out.println(name.charAt(index));
//		}
//		catch (Exception e) {
//			e.printStackTrace();
//			enterIndex();
//		}
//		
//		
//	}
//
//}

//import java.util.Scanner;
//
//public class Day4Exception {
//	
//	public static void main(String[] args) {
//		
//		Scanner sc = new Scanner(System.in);
//		
//		try {
//			
//
//			System.out.println("Please enter any no!!");
//			int enteredNo = sc.nextInt();
//			int i = 100/enteredNo;
//			System.out.println("second statement");
//			
//			String name = "Manit";
//			System.out.println("Enter the index!!");
//			int index = sc.nextInt();
//			System.out.println(name.charAt(index));
//			
//		}
//		catch(Exception e) {
//			System.out.println("inside catch...");
//			e.printStackTrace();
//			main(null);
//		}
//		
//	}
//
//}

//public class Day4Exception {
//	
//	public static void main(String[] args) {
//		
//		
//		try {
//			System.out.println("inside try block");
//			int i = 4/0;
//			System.out.println("second statement");
//		}
//		catch(Exception e) {
//			System.out.println("inside catch...");
//			e.printStackTrace();
//		}
//		
//	}
//
//}

//public class Day4Exception {
//	
//	public static void main(String[] args) {
//		
//		String name = "Manit";
//		
//		System.out.println(name.charAt(7));
//	}
//
//}

//public class Day4Exception {
//	
//	public static void main(String[] args) {
//		
//		String names[] = {"Sai", "Manit"};
//		
//		System.out.println(names[2]);
//	}
//
//}

//public class Day4Exception {
//	
//	public static void main(String[] args) {
//		
//		int i = 4/0;
//	}
//
//}
