import java.util.*;
  
class sample {
      public static void main(String[] args)
    {
        int n;
       //String names;
        Scanner items = new Scanner(System.in);
        System.out.println("Number of Strings: ");
        n = items.nextInt();

        String str[] = new String[n];
        Scanner list = new Scanner(System.in);
        System.out.println("Names: ");
        for(int i=0; i < n; i++)
        {
            str[i] = list.nextLine();
        }
        items.close();
        list.close();

        Arrays.sort(str);
        System.out.println("The names in alphabetical order are: ");
        for (int i = 0; i < n; i++) {
            System.out.println(str[i]);
        }
    }
}