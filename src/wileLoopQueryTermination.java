import java.util.Scanner;


public class wileLoopQueryTermination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Choose (y) to continue or (n) to quit: ");
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		
		while("y".equals(input)) {
			//System.out.println("This is working");
			//System.out.print("Choose y or no: ");
			//input = scan.nextLine();
			
			System.out.print("Enter a number to square: ");
			String num = scan.nextLine();
			int enterNum = Integer.parseInt(num);
			
			int square = enterNum * enterNum;
			System.out.println(enterNum + " squared is " + square);
			System.out.print("Continue? (y/n): ");
			input = scan.nextLine();
		}
		System.out.print("End of algorithm. Seeya!");
		scan.close();
	}

}
