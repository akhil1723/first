import java.io.*;
import java.util.Scanner;
class ar
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the limits");
int n=sc.nextInt();
int a[]=new int[n];
System.out.println("Enter the array elements");
for(int i=0;i<n;i++)
a[i]=sc.nextInt();
System.out.println("Array elements");
{
for (int i=0;i<n;i++)
System.out.print(a[i]);
}
}
}