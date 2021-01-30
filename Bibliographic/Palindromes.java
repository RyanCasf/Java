import java.util.Scanner;

public class Palindromes {

	public static void main(String[] args) {
		
		//A palindrome is a word that is the same reversed
		//Ex: racecar, mam, poop, nurses run
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a phrase: ");
		String phrase = scan.next() + scan.nextLine();
		phrase = phrase.replace(" ", "");
		
		String reverse = "";
		
		for(int i = phrase.length() - 1; i >= 0; i--) {
			reverse += phrase.charAt(i);
		}
		
		System.out.println(reverse);
		
		boolean palindrome = true;
		for(int i = 0; i < phrase.length(); i++) {
			if(reverse.charAt(i) != phrase.charAt(i)) {
				palindrome = false;
			}
		}
		
		if(palindrome) {
			System.out.println("Palindrome!");
		} else {
			System.out.println("Not a palindrome");
		}
		
		
	}

}
