
import java.util.*;
import java.io.*;
public class Main
{
	
public static int lastdigit(int n){				//Function that finds the last digit of the number
    return n%10;
}
	
public static void function1(int n){				// Function to check if the number is divisible by 3, 5 or both
	for(int i=1;i<=n;i++){
		boolean divby3 = (i%3==0);
		boolean divby5 = (i%5==0);
		if(divby3 && divby5){
			System.out.println("FizzBuzz");
		}
		else if(divby3 || lastdigit(i)==3){		//Add one more condition in if
			System.out.println("Fizz");
		}
		else if(divby5 || lastdigit(i)==5){
			System.out.println("Buzz");
		}
		else{
			System.out.println(i);
		}
	}
}

public static void main(String[] args){				//driver function
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	function1(n);
}	
}
  
