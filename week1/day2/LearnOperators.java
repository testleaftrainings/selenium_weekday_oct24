package week1.day1;

public class LearnOperators {

	public static void main(String[] args) {
		
		//Arithmetic operators
		System.out.println(7+7);
		System.out.println(7-7);
		System.out.println(7*7);
		System.out.println(7/7);//quotient
		System.out.println(21%2);//remainder
		
		//assignment opertors
		
		int a=5,b=10;
		a+=10;//a=a+5
		System.out.println(a);
		b-=20;
		System.out.println(b);
		
		//comparison xoperators
		System.out.println(5==5);
		System.out.println(5>=5);
		
		//logical opertors
		System.out.println((5==5)&&(5<5));//1*0=0---false
		System.out.println((5==5)||(5<5));//1+0=1---true
		
		//unary opertors
		int x=1;
		System.out.println(++x);//2
		System.out.println(x++);//2
		System.out.println(x);//3
		System.out.println(--x);//2
		System.out.println(x--);//2
		System.out.println(x);
		
		
		

	}

}
