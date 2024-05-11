package com.allproject.String;

public class AdvAsciiTable {

	public static void main(String[] args) {
		int a=5;
		int b=3;
		int sum=0;
		for(int i=1;i<=a;i++)  
		{  
		//calculates the sum  
		sum=sum+b;  
		}  
		System.out.println(sum);
		
		System.out.println("Sl.No"+"\t"+"DEC"+"\t"+"BIN"+"\t"+"OCT"+"\t"+"HEXA");
        for (int i = 0; i < 128; i++) {
            String binary = Integer.toBinaryString(i);
            String octal = Integer.toOctalString(i);
            String hex = Integer.toHexString(i).toUpperCase();
            System.out.println( i+"\t"+ i+"\t"+ binary+"\t"+octal+"\t"+ hex);
        }
    }


}


