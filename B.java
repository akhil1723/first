import java.io.*;
import java.util.Scanner;
class B
{
public static void main(String arg[])
{
String nameofthestudent;
String course;
int rollno;
Scanner sc=new Scanner(System.in);
System.out.println("Enter your name");
nameofthestudent=sc.next();
System.out.println("Enter your course");
course=sc.next();
System.out.println("Enter your roll no");
rollno=sc.nextInt();
System.out.println("Nameofthestudent:"+nameofthestudent);
System.out.println("Course:"+course);
System.out.println("Roll no:"+rollno);
}
}