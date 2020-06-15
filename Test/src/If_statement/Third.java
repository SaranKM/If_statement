package If_statement;

public class Third {

	public static void main(String[] args) {
		if(args.length==0)
     		System.out.println("No Values");
		else
		{
			for(String r:args)
				System.out.print(r+",");
		}
	}

}
