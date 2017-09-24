import java.util.Scanner;  
class acad2{  
 public static void main(String args[]){  
 Scanner sc=new Scanner(System.in);  
     
   System.out.println("First number is : ");  
   int a=sc.nextInt();  
   System.out.println("Second number is :");  
   int b =sc.nextInt(); 
    sum(a,b)
   sc.close();
 } 
 
 public void sum(int a,int b)
 {
     int c =a+b;
   System.out.println("Sum is :" +c);  
}   