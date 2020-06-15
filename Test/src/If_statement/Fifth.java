package If_statement;

public class Fifth {

	public static void main(String[] args) {
		char z='A';
		if(z>=48 && z<=57)
			System.out.println("Digit");
		else if((z>=65 && z<=90)||(z>=97 && z<=122))
			System.out.println("Alphabet");
		else
			System.out.println("Special Charatcer");

	}

}
