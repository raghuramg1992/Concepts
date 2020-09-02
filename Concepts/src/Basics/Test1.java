package Basics;

public class Test1 {
 static int a=6;
	static void method(){
		System.out.println("Base class static method");
	}
	
	void nonStatic() {

		System.out.println("Base class non static method");
	}
public static void main(String[] args) {
	Test1.method();
	sub.method();

	new sub().nonStatic();
}
}
class sub extends Test1{
	static void method() {
		System.out.println("Sub class");
	}
	@Override
	void nonStatic() {		
		System.out.println(a);
		System.out.println("Sub class non static method");
	}
}