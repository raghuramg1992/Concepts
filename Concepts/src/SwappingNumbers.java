import java.util.Scanner;

public class SwappingNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwappingNumbers s=new SwappingNumbers();
Scanner in=new Scanner(System.in);
int a=in.nextInt();
int b=in.nextInt();
System.out.println(s.withoutThird(a,b));
	}

	String  withoutThird(int a, int b) {
		// TODO Auto-generated method stub
		a=a+b;
		b=a-b;
		a=a-b;
		return ("After Swapping a and b is "+a+" and "+b);
	}

}
