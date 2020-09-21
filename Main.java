
import java.util.*;
import java.io.*;
public class Main
{
public static void function1(int n){
	for(int i=1;i<=n;i++){
		boolean divby3 = (i%3==0);
		boolean divby5 = (i%5==0);
		if(divby3 && divby5){
			System.out.println("FizzBuzz");
		}
		else if(divby3){
			System.out.println("Fizz");
		}
		else if(divby5){
			System.out.println("Buzz");
		}
		else{
			System.out.println(i);
		}
	}
}

public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	function1(n);
}	
}
  
