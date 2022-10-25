// 13/10/2021 - 06.00 P.M. - ShiAsh -Praveena Murugesan - 1
// Introduction of Java and Application Installation Links

// 15/10/2021 - 06.00 P.M. - ShiAsh -Praveena Murugesan - 2

//  Java - James Gosling in 1995
//         Oak

/* 1
Hello.java

class Hello
{
    public static void main(String args[])
    {
        System.out.println("Welcome");
    }
}

o/p:
Welcome
*/

/* 2
Add.java

class Add
{
    public static void main(String args[])
    {
        int a = 5, b = 10;
        int c = a+b;
        System.out.println("Addition = " + c);
    }
}

o/p:
Addition = 15
*/

/* 2.1

import java.util.Scanner;
class Add
{
    public static void main(String args[])
    {
        int a,b,c;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Value of a: ");
        a = s.nextInt();
        System.out.println("Enter the Value of b: ");
        b = s.nextInt();
        c = a+b;
        System.out.println("Addition = " + c);
    }
}

o/p:
Enter the Value of a: 20
Enter the Value of b: 30
Addition = 50
*/

// 18/10/2021 - 06.00 P.M. - ShiAsh -Praveena Murugesan

/*  
DataTypes - (I)  Primitive
            (II) Non-Primitive

                                DataTypes
                                    |
                   Primitive ---------------- Non-Primitive
                       |
            Numeric ------- Non-Numeric
               |               -boolean
               |               -char
               |
   Integral ------- Floating-Point
     -byte            -float
     -short           -double
     -int
     -long
*/

/* 3
Mob.java

import java.util.Scanner;
class Mob
{
    public static void main(String args[])
    {
        int mobno;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Your Mobile Number: ");
        mobno = s.nextInt();
        System.out.println("Your Mobile Number is: " + mobno);
    }
}
*/

/* 3.1

class Mob
{
    public static void main(String args[])
    {
        long mobno = 637434519;
        System.out.println("Your Mobile Number is: " + mobno);
    }
}
*/

/* 4
flt.java

import java.util.Scanner;
class flt
{
    public static void main(String args[])
    {
        float wgt;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Weight: ");
        wgt = sc.nextFloat();
        System.out.println("The Weight is : " + wgt);
    }
}
*/

/* 4.1

class flt
{
    public static void main(String args[])
    {
        float wgt =  (float) 32.5;
        System.out.println("The Weight is : " + wgt);
    }
}
*/


// 20/10/2021 - 06.00 P.M. - ShiAsh -Praveena Murugesan

/*
boolean status = True;
if(status)
{
    ...
}
else
{
    ...
}
*/

//String

/* 5
import java.util.Scanner;
class str
{
    public static void main(String args[])
    {
        String name;
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the Name: ");
        name = s.next();
        System.out.println("Your Name is: " + name);
    }
}
*/

/* 5.1
 
import java.util.Scanner;
class str
{
    public static void main(String args[])
    {
        String name = "Shiffana";
        System.out.println("Your Name is: " + name);
    }
}
*/

//Char

/* 6 


import java.util.Scanner;
class str
{
    public static void main(String args[])
    {
        char gender;
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the Gender: ");
        gender = s.next().charAt(0);
        System.out.println("Your Name is: " + gender);
    }
}
*/

/* 6.1

import java.util.Scanner;
class str
{
    public static void main(String args[])
    {
        char gender = 'f';
        System.out.println("Your Gender is: " + gender);
    }
}
*/


/*  
                  Control Statements
                          |
           --------------------------------              
          |               |                |
      Selective       Iterative         Transfer
       - if else       - for()           - break
       - switch()      - while()         - continue
                       - do while()
                       - foreach

*/

// 22/10/2021 - 06.00 P.M. - ShiAsh -Praveena Murugesan

/* 7 - If Else

import java.util.Scanner;
class sts
{
    public static void main(String args[])
    {
        int age;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the age: ");
        age = s.nextInt();
        if ( age > 23)
        System.out.println("Eligible for marriage");
        else
        {
            System.out.println("Not Eligible...");
        }
    }
}

*/

/* 8 - If Else

import java.util.Scanner;
class days
{
    public static void main(String args[])
    {
        int day;
        Scanner in = new Scanner (System.in);
        System.out.println("Enter the day: ");
        day = in.nextInt();
        if(day == 1 )
        System.out.println("Monday");
        else if(day == 2)
        System.out.println("Tuesday");
        else if(day == 3)
        System.out.println("Wednesday");
        else if(day == 4)
        System.out.println("Thursday");
        else if(day == 5)
        System.out.println("Friday");
        else if(day == 6)
        System.out.println("Saturday");
        else if(day == 7)
        System.out.println("Sunday");
        else
        System.out.println("Invalid input...");
    }
}

*/

/* 9 - Switch

import java.util.Scanner;
class days
{
    public static void main(String args[])
    {
        int day;
        Scanner in = new Scanner (System.in);
        System.out.println("Enter the day: ");
        day = in.nextInt();
        switch(day)
        {
        case 1: System.out.println("Monday");
        break;
        case 2:System.out.println("Tuesday");
        break;
        case 3:System.out.println("Wednesday");
        break;
        case 4:System.out.println("Thursday");
        break;
        case 5:System.out.println("Friday");
        break;
        case 6:System.out.println("Saturday");
        break;
        case 7:System.out.println("Sunday");
        break;
        default: System.out.println("Invalid input...");
        break;(optional)
        }
    }
}
*/

/* 10 - For Loop

class floop
{
    public static void main(String[] args) 
    {
        for(int i=1; i<=10; i++)
        {
            System.out.println(i);
        }        
    }
}

*/

/* 11 - while(cond) - Entry controlled loop
{
    ...
}

class wloop
{
    public static void main(String[] args) 
    {
        int i=1;
        while(i<=10)
        {
            System.out.println(i);
            i++;
        }        
    }
}

*/

/* 12 - do while - Exit control Loop

do
{
    ...
    ...
}
while(cond);

class dloop
{
    public static void main(String[] args) 
    {
        int i=11;
        do
        {
            System.out.println(i);
            i++;
        } 
        while(i <= 10);       
    }
}

*/

/* 13 - break / continue

class floop
{
    public static void main(String[] args) 
    {
        for(int i=1; i<=10; i++)
        {
            if(i == 3)
            continue;/break;
            System.out.println(i);
        }
    }

}

*/

// 25/10/2021 - 06.00 P.M. - ShiAsh -Praveena Murugesan

/*
Array

int[] a = new int[5];
int []a = new int[5];
int a[] = new int[5];
-------------------------------
*/

/* 14 - Array
class Arr
{
    public static void main(String[] args)
    {
        int[] a = new int[5];
        a[0] = 3;
        a[1] = 6;
        a[2] = 4;
        a[3] = 8;
        a[4] = 2; //int[] a = {3,6,4,8,2};
        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(a[2]); //for(int i=0; i<5; i++) {s.o.p(a[i]);}
                                    
        
    }
}
*/

/* 14.1 - Array
class Arr
{
    public static void main(String[] args)
    {
        int[] a = {3,6,4,8,2};
        for(int i=0; i<5; i++) 
        {
            System.out.println(a[i]);
        }    
    }
}
*/

/* 14.2
import java.util.Scanner;
class Arr
{
    public static void main(String[] args)
    {
        int[] a = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Array Elements: ");
        for (int i=0;i<5;i++)
        {
            a[i] = sc.nextInt();
        }
        System.out.println("The Array Elements are: ");
        for(int i=0; i<5; i++) 
        {
            System.out.println(a[i]);
        }    
    }
}
*/

/* 15
class Arr2
{
    public static void main(String[] args)
    {
        int[][] a = new int[2][2];
        a[0][0] = 5;
        a[0][1] = 4;
        a[1][0] = 3;
        a[1][1] = 7; // int[][] a = {{5,4},{3,7}};
        for(int i=0; i<2; i++)
        {
            for(int j=0; j<2;j++)
            {
                System.out.print(a[i][j] + "");
            }
            System.out.println();
        }
    }
}

*/

/* 15.1
import java.util.Scanner;
class Arr2
{
    public static void main(String[] args)
    {
        int[][] a = new int[2][2];
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Array Elements: ");
        for(int i=0; i<2; i++)
        {
            for(int j=0; j<2;j++)
            {
                a[i][j] = s.nextInt();
            }
        }
        for(int i=0; i<2; i++)
        {
            for(int j=0; j<2;j++)
            {
                System.out.print(a[i][j] + "");
            }
            System.out.println();
        }
    }
}
*/

//27/10/2021 - 06.00 P.M. - ShiAsh -Praveena Murugesan

/* OOPs

 - 16
class Stud
{
    int sid;
    String sname;
}

class TestStud
{
    public static void main(String[] args)
    {
        Stud s = new Stud();
        s.sid = 101;
        s.sname = "Anita";
        System.out.println(s.sid);
        System.out.println(s.sname);
    }
}
O/P:
101
Anitha

*/

//sid -> 0; sname -> null

/*16.1

class Stud
{
    int sid;
    String sname;

    void insert (int id, String name)
    {
        sid = id;
        sname = name;
    }

    void display()
    {
        System.out.println(sid);
        System.out.println(sname);
    }
}

public class ShiAsh
{
    public static void main(String[] args)
    {
        Stud s = new Stud();
        s.insert(101,"Anitha");
        s.display();
    }
}
*/

//27/10/2021 - 06.00 P.M. - ShiAsh -Praveena Murugesan

//same 16.1

/*
 
Inheritance
  
  A - Parent/super/base
  B - Child/sub/derived

 class Emp
 {
     float salary = 40000f;
 }

 class Prog extends Emp
 {
     float bonus = 4000f;
     public static void main(String[] args)
     {
         Prog p = new Prog();
         System.out.println("Salary = " + p.salary);
         System.out.println("Bonus = " + p.bonus);
     }
 }

 Java doesn't support multiple inheritance

*/

// 01/11/2021 - 06.30 P.M. - ShiAsh -Praveena Murugesan

//Abstraction

/* 17

abstract class mydemo
{
    public void display1()
    {
        System.out.println("Concrete meth");
    }
    public abstract void display1();
}
class demo extends mydemo
{
    public void display2()
    {
        System.out.println("Abst meth");
    }
    public static void main()
    {
        demo d = new demo();
        d.display1();
        d.display2();
    }
}

*/

// 05/11/2021 - 06.30 P.M. - ShiAsh -Praveena Murugesan

/* Interface

interface int1
{
    public void display1();  ----Error 1
}
class demo implements int1
{
    public void display1()   ----Error 2
    {
        s.o.p("Abst meth");
    }
    psmv()
    {
        demo d = new demo();   ----Error 3
        d.display1();
    }
}

           msg()            msg()
            A--------C-------B
            
interface A
{
    void msg()
    {
        s.o.p("msg() in Int A");
    }
}        
interface B
{
    void msg()
    {
        s.o.p("msg() in Int B");
    }
}
class C implements A,B
{
    public void msg()
    {
        A.super().msg();
        B.super().msg();
    }
    psvm()
    {
        C obj = new C();
        obj.msg();
    }
}
*/

// 08/11/2021 - 06.00 P.M. - ShiAsh -Praveena Murugesan
/*
|                      Polymorphism
      (static) compile-time        run-time(dynamic)
       method overloading           method overriding

class Addition
{
    int add(int x, int y)
    {
        return x+y;
    }
    int add (int s,int y, int z)
    {
        return x+y+z;
    }
}

class TestAdd
{
    psvm()
    {
        Addition A = new Addition();
        s.o.p(A.add(10,20,30));
        s.o.p(A.add(10,20));
    }
}

----------------------
class Addition
{
    int add(int x, int y)
    {
        return x+y;
    }
    int add (float x, float y)
    {
        return x+y;
    }
}

class TestAdd
{
    psvm()
    {
        Addition A = new Addition();
        s.o.p(A.add(10.5f, 15.5f));
        s.o.p(A.add(10,20));
    }
}

*/

/* Overriding

class Bank
{
    int interest()
    {
        return 0;
    }
}
class SBI extends Bank
{
    int interest()
    {
        return 5;
    }
}
class AXIS extends Bank
{
    int interest()
    {
        return 7;
    }
}
class TestBank
{
    psvm()
    {
        Bank b = new Bank();
        s.o.p(b.interest());
        Bank s = new SBI();
        s.o.p(s.interest());
        Bank a = new AXIS();
        s.o.p(a.interest());
    }
}

*/

// 10/11/2021 - 06.00 P.M. - ShiAsh -Praveena Murugesan

/*  Encapsulation 

Access specifiers..
1. private - (whithin the class)
2. default - (outside the class, within the same pkg)
3. protected - (outside the pkg, -> inheritance)
4. public - (Everywhere)

class Access
{
    void msg()
    {
        s.o.p("Hello");
    }
}
public class TestAccess
{
    psvm()
    {
        Access A = new Access();
        A.msg();  //Error
    }
}

/
package pack;

class Access
{
    protected void msg()
    {
        s.o.p("Hello");
    }
}

package mypack;
import pack.*;

public class TestAccess extends Access
{
    psvm()
    {
        TestAccess A = new TestAccess();
        A.msg();  
    }
}

Programs:
`````````
 - src --> rgt-clk -> new -> package -> pack
  * pack --> rgt-clk -> new -> class -> Access
    - Access.java
  * mypack
    - TestAccess.java 
*/

// 12/11/2021 - 06.00 P.M. - ShiAsh -Praveena Murugesan

/*  Encapsulation 

class stud1
{
    private void setsid(int id)
    {
        sid = id;
    }
    public void getsid()
    {
        return sid;
    }
}
public class Teststud1
{
    psvm()
    {
        stud1 s = new stud1();
        s.setsid(10);
        s.o.p(s.getsid());
    }
}
------fever-------

// 15/11/2021 - 06.00 P.M. - ShiAsh -Praveena Murugesan

   String (immutable) -> java.lang   StringBuffer,StringBuilder - mutable

   1. String name = "Kanitha"; -> 1 obj

                 SCP (String Constant Pool)   -> JVM
                 --------------------------
       name -> Kanitha                         name - V00l

    2. String name = new String("Kanitha");  ->2 obj
       String name1 = new String("Kanitha");

       Heap                            SCP
       ````                           `````
    name -> Kanitha             name1 -> name-> Kanitha
    name1 -> Kanitha


class str
{
    psvm()
    {
        String s = new String("Java");
        s.concat("Prog");
        s.o.p(s);
    }
}

# Java

Heap                    SCP
````                    ```
s -> Java            s -> Java
     JavaProg


class strbuf
{
    psvm()
    {
        StringBuffer s = new StringB("Java");
        s.concat("Prog");
        s.o.p(s);
    }
}

# Java

Heap                    SCP
````                    ```
s -> Java            s -> Java
     JavaProg

// 19/11/2021 - 06.00 P.M. - ShiAsh -Praveena Murugesan


// 24/11/2021 - 06.00 P.M. - ShiAsh -Praveena Murugesan
 
|                           SQL
|                            |
     ---------------------------------------------------
     |              |                |                 |
    DDL            DML              DCL               TCL
   - create       - insert         - grant           - commit
   - alter        - update         - revoke          - rollback
   - rename       - delete                           - savepoint
   - truncate     - select
   - drop 
    

stud -> sid, sname
         1    AA
         2    BB
         3    AA

select * from stud where sid = 3;

mysql> create database Sonoo;
       use Sonoo;

       create table stud(sid int(5) primary key auto_increment, sname varchar(20));

mysql> show tables;
       stud

mysql> show databases;
       Sonoo
      
mysql> desc stud; // describe stud;       
*/