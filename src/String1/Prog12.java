//accept the name of a person and guess the gender3
package String1;
import java.util.*;
public class Prog12 {
	public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("plz enter any string");
        String name;
        name = sc.nextLine();
        name = name.toLowerCase();
        if(name.startsWith("mr "))
        {
            System.out.println("Male");
        }
        else if(name.startsWith("miss  "))
        {
            System.out.println("Female");
        }
        else if(name.startsWith("mrs"))
        {
            System.out.println("Married Female");
        }
        else if(name.startsWith("kumari "))
        {
            System.out.println("Un-Married Female");
        }
        else
        {
            System.out.println("Cannot-determine");
        }
    }
}
