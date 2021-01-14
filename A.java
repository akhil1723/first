import java.io.*;
import java.util.Scanner;
class A
{
public static void main(String arg[])
{
String name;
String address;
int age;
int dob;
Long phonenumber;
Scanner sc=new Scanner(System.in);
System.out.println("Enter your name");
name=sc.nextLine();
System.out.println("Enter your address");
address=sc.nextLine();
System.out.println("Enter your age");
age=sc.nextInt();
System.out.println("Enter your dob");
dob=sc.nextInt();
System.out.println("Enter your phonenumber");
phonenumber=sc.nextLong();
System.out.println("Name:"+name);
System.out.println("Address:"+address);
System.out.println("Age:"+age);
System.out.println("Dob:"+dob);
System.out.println("Phonenumber:"+phonenumber);
}
}