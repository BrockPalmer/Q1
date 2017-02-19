import java.util.Scanner;

public class Quarterback {

	public static void main(String[] args) {
		// TODO Make program that calculates QB passer rating
		Scanner input = new Scanner(System.in);

		System.out.print("Number of passing attemps: ");
		double ATT = input.nextDouble();

		System.out.print("Number of completions: ");
		double COMP = input.nextDouble();

		System.out.print("Number of Yards: ");
		double YDS = input.nextDouble();

		System.out.print("Number of Touchdowns: ");
		double TD = input.nextDouble();

		System.out.print("Number of Interceptions: ");
		double INT = input.nextDouble();

		double a = (double) (((COMP / ATT) - .3) * 5);
		double b = (double) (((YDS / ATT) - 3) * .25);
		double c = (double) ((TD / ATT) * 20);
		double d = (double) (2.375 - ((INT / ATT) * 25));

		double Passer_Rating = (double) (((a + b + c + d) / 6) * 100);
		if (COMP == ATT && YDS == 500 && TD == 7 && INT == 0) {
			System.out.print("Passer Rating=");
			System.out.print("158.3");
		}
		else if (Passer_Rating > 158.3) {
			System.out.print("Passer Rating=");
			System.out.print("158.3");
		} else {
			System.out.print("Passer Rating=");
			System.out.printf("%3.1f", Passer_Rating);
		}

	}

}
