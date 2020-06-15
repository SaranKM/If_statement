package If_statement;
import java.util.*;
public class Sixth {
public static void main(String[] args) {
Scanner s=new Scanner(System.in);
String gender=s.next();
if(gender.equals("Female")&&(Integer.parseInt(args[0])>=1 && Integer.parseInt(args[0])<=58))
    System.out.println("the percentage of interest is 8.2%");
else if(gender.equals("Female")&&(Integer.parseInt(args[0])>=59 && Integer.parseInt(args[0])<=100))
	System.out.println("the percentage of interest is 9.2%");
else if(gender.equals("Male")&&(Integer.parseInt(args[0])>=1 && Integer.parseInt(args[0])<=58))
	System.out.println("the percentage of interest is 8.4%");
else if(gender.equals("Male")&&(Integer.parseInt(args[0])>=59 && Integer.parseInt(args[0])<=100))
	System.out.println("the percentage of interest is 10.5%");
}
}
