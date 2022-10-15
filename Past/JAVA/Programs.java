//1. Star/Pyramid Program
/*
public class Programs
{
  public static void main(String[] args) 
  {
    for(int i=1;i<=5;i++){  
        for(int j=1;j<=i;j++){  
                System.out.print("* ");  
        }  
        System.out.println();//new line  
        }
  }
}
*/

//2. Alphabetical Order
/*
public class Programs
{
  public static void main(String[] args)
  {
   int n = 4;
   String names[] = {"Rahul","Ajay","Gourav","Riya"};
   String temp;
   for (int i = 0;i < n; i++)
   {
     for (int j = i + 1; j < n ; j++)
     {
       if(names[i].compareTo(names[j]) > 0)
       {
         temp = names[i];
         names[i] = names[j];
         names[j] = temp;
       }
     }
   } 
   System.out.println("The names in alphabetical order are: ");
   for(int i = 0; i < n; i++)
   {
     System.out.println(names[i]);
   }
  }
}
*/
/*
import java.util.*;
  
class Programs {
    public static void main(String[] args)
    {
        int n = 4;
        String names[] = { "Rahul", "Ajay", "Gourav", "Riya" };
        Arrays.sort(names);
        System.out.println("The names in alphabetical order are: ");
        for (int i = 0; i < n; i++) {
            System.out.println(names[i]);
        }
    }
}
*/
import java.util.Scanner;
public class Programs
{
    public static void main(String[] args) 
    {
        int count;
        String temp;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of strings: ");
        count = scan.nextInt();
        
        String str[] = new String[count];
        Scanner scan2 = new Scanner(System.in);
        System.out.println("Enter the Strings one by one:");
        for(int i = 0; i < count; i++)
        {
            str[i] = scan2.nextLine();
        }
        scan.close();
        scan2.close();
        
        for (int i = 0; i < count; i++) 
        {
            for (int j = i + 1; j < count; j++) { 
                if (str[i].compareTo(str[j])>0) 
                {
                    temp = str[i];
                    str[i] = str[j];
                    str[j] = temp;
                }
            }
        }
        
        //Displaying the strings after sorting them based on alphabetical order
        System.out.print("Strings in Sorted Order:");
        for (int i = 0; i <= count - 1; i++) 
        {
            System.out.print(str[i] + ", ");
        }
    }
}