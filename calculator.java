import java.util.*;
import java.io.*;

class calculator
{
	public static void main(String[] args){
		
		Scanner scn= new Scanner(System.in);
		String str = new String(scn.next());
		String s=handelN(str);
		//System.out.println(s);
		char[] ch = s.toCharArray();
		boolean isNegative=false;
		String neg= "negatives not allowed ";
		for(int i=0;i<ch.length;i++)
		 {
			if(ch[i]=='-')
			{
			  isNegative=true;
			  neg=neg+"-"+ch[i+1]+" ";
			} 
		 }
			if(isNegative)
		  {
			System.out.println(neg);
		  }
		 else
		   {
			   int sum=Add(s);
				System.out.println(sum);
		   }
			}
	
	public static String handelN(String strWithN){
		//String r=strWithN.replace("\\", ";");
		String numberOnly= strWithN.replaceAll("[^0-9]", ";");
		return numberOnly;
	}

	public static int Add(String numbers){
		String[] res = numbers.split("[;]", 0);
		int sum=0;
		for(String num: res) {
			if(num.equals("")){
				sum+=0;
			}
			else if(Integer.parseInt(num)>1000){
				sum+=(Integer.parseInt(num)-1000);
			}
			else{
				sum+=Integer.parseInt(num);
			}
       }
	   return sum;
	}
}