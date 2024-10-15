package week1.day1;

public class LearnSwitchCase {

	public static void main(String[] args) {
		
		String browser="firefox";
		
	//shortcut--->type switch and do ctrl+space
		switch (browser) {
		case "Chrome":
			System.out.println("open chrome browser");
			break;
		case "edge":
			System.out.println("open edge browser");
			break;
			
		case "safari":
			System.out.println("open safari browser");
			break;
			default:
				System.out.println("open IE");
		}

	}

}
