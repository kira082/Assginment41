import java.util.Scanner;  
class acad3{  
 public static void main(String args[]){  
   Scanner sc=new Scanner(System.in);  
     
   System.out.println("Enter the first number");  
   int a=sc.nextInt();  
   System.out.println("Enter the second number");  
   int b =sc.nextInt();  
  for(int c = a;c<=b;c++)
  {
	  if(c%2 == 0)
		{
		System.out.println("Even number is:" + c);	
		}		  
		
		else
		{
			System.out.println("odd number is:" +c);
		}
		
	  
  } 
   sc.close();  
 }  
}   
