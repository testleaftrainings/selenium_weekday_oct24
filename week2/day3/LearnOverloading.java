package week2.day3;

public class LearnOverloading {
	public void add() {
		int a=10;
		int b=20;
		System.out.println(a+b);
	}
	public void add(int a,float b) {
		System.out.println(a+b);
		
	}
	public static void main(String[] args) {
		LearnOverloading lo=new LearnOverloading();
		lo.add();
		lo.add(5, 6.7f);
	}
}
