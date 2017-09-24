import java.util.Scanner;  
class acad4{  
 public static void main(String args[]){  
   Scanner sc=new Scanner(System.in);  
     
   System.out.println("Enter the  number");  
   int a=sc.nextInt();  
   
  for(int c = 1;c <= 10;c++)
  {
	  
	  int d = c*a;
	   System.out.println(d);
	  
  } 
   sc.close();  
 }  
}   
