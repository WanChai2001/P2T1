import java.util.Scanner;

public class NumberGuess {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int i = 0, n = 0;
			int secethnummber = (int)(Math.random()*100);
			System.out.println("Key in your guess number : ");
			while (n!=secethnummber) {
			n = sc.nextInt();
			i+=1;
			if (n == secethnummber) {
				System.out.printf("Congratulation! %d is Secret Number",n);
			}
			else if (n < secethnummber) {
				System.out.printf("Tey higher");
			}
			else if (n > secethnummber) {
				System.out.printf("Tey lower");
			}

	}
			System.out.println();
			System.out.printf("You got it in %d trials!",i);
	}
}