import java.util.Random;
import java.util.Scanner;

public class SendHelp {
	public static void main(String[] args) {
		char help;
		final char EXIT = 'N';
		Scanner needHelp = new Scanner(System.in);
		System.out.print("Would you like an inspirational quote? Y/N: ");
		help = needHelp.next().charAt(0);
		help = Character.toUpperCase(help);
		
		while(help != EXIT) {
			switch(help) {
			case 'Y':
				System.out.println("");
				inspQuotes();
				System.out.println("");
				break;
			default:
				System.out.println("Error, please try again.");
			}
			System.out.print("Would you like an inspirational quote? Y/N: ");
			help = needHelp.next().charAt(0);
			help = Character.toUpperCase(help);			
		}if(help == EXIT) {
			System.out.print("Have a nice day!");
		}
		needHelp.close();
	}
	
	public static void inspQuotes(){
			Random rand = new Random();
			int n = rand.nextInt(9);
			System.out.println("*************************");
			System.out.println("");
			switch(n){
			case 1:
				System.out.println("\"Sun is shining and so are you.\" - Axwell /\\ Ingrosso");
				break;
			case 2:
				System.out.println("\"Life is 10% what happens to you and 90% how you react to it.\" - Charles R Swindoll");
				break;
			case 3:
				System.out.println("\"Our greatest glory is not in never falling, but in rising every time we fall.\" — Confucius");
				break;
			case 4:
				System.out.println("\"Success is not final, failure is not fatal: it is the courage to continue that counts.\" — Winston Churchill");
				break;
			case 5:
				System.out.println("\"There is only one thing that makes a dream impossible to achieve: the fear of failure.\" — Paulo Coelho");
				break;
			case 6:
				System.out.println("\"Hard times don’t create heroes. It is during the hard times when the ‘hero’ within us is revealed.\" — Bob Riley");
				break;
			case 7:
				System.out.println("\"Believe you can and you’re halfway there.\" — Theodore Roosevelt");
				break;
			case 8:
				System.out.println("\"It’s a beautiful day. Don’t let it get away.\" — U2");
				break;
			case 9:
				System.out.println("\"Pick yourself up cause legends never die.\" — Against The Current");
				break;
			case 0:
				System.out.println("\"What doesn't kill you makes you stronger.\" — Kelly Clarkson");
				break;
			}
			
			System.out.println("");
			System.out.println("*************************");		
		}
	}
