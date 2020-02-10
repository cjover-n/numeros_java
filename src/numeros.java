import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

class MyClass {
  public static void main(String[] args) {
	  
	Scanner myObj = new Scanner(System.in);
    Integer num[] = {0 ,0 ,0};
    
    System.out.println("Dame número 1"); 
    num[0] = Integer.parseInt(myObj.nextLine());
    
    System.out.println("Dame número 2"); 
    num[1] = Integer.parseInt(myObj.nextLine());
    
    System.out.println("Dame número 3"); 
    num[2] = Integer.parseInt(myObj.nextLine());
    
    Arrays.sort(num, Collections.reverseOrder()); 
    
    for (int numero:num)
    	  System.out.println(numero);
    
    myObj.close();
  }
}