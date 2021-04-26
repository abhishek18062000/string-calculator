import java.util.*;
import java.io.*;

class calculator
{
	public static void main(String[] args){
		Scanner scn= new Scanner(System.in);
		String str=scn.next();
		int sum=Add(str);
		System.out.println(sum);
	}
	public static int Add(String numbers){
		String[] res = numbers.split("[,]", 0);
		int sum=0;
		for(String num: res) {
			if(num.equals("")){
				sum=0;
			}
			else{
				sum+=Integer.parseInt(num);
			}
       }
	   return sum;
	}
}