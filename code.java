/** This program reads in three integers and prints “in order” if they are sorted in
ascending or descending order, or “not in order” otherwise.
 * @author (Fikri Şan Köktaş) * @version (28 November 2020)*/
import java.util.Scanner;
public class KFS_InOrder_Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int num1, num2, num3;
        System.out.println("Enter three numbers: ");
        num1=input.nextInt(); //takes user input
        num2=input.nextInt(); //takes user input
        num3=input.nextInt(); //takes user input
        if (num1<num2 && num2<num3) //condition for increase
        {
            System.out.println("in order"); 
        }
        else if (num1>num2 && num2>num3)//condition for decrease
        { 
            System.out.println("in order");
        } 
        else 
        {
            System.out.println("not in order");
        }
    }
}
