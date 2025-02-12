import java.util.Random;

public class PasswordGenerator {
	public static void main(String args[]) {
		
		char[] characters = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm',
							'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z',
							'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M',
							'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z',
							'1', '2', '3', '4', '5', '6', '7', '8', '9', '0',
							'!', '@', '#', '$', '%', '^', '&', '*', '(', ')'};
		
		char[] password = new char[10];
				
		Random rand = new Random();
		int randomIndex = 0;
		
		for(int i = 0; i < password.length; i++) {
			randomIndex = rand.nextInt(characters.length);
			password[i] += characters[randomIndex];
			System.out.print(password[i]);
		}
	}
}