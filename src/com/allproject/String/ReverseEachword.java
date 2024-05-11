package com.allproject.String;

public class ReverseEachword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Raaj is good boy";
//		for(int i=s.length()-1;i>=0;i--) {
//			System.out.print(s.charAt(i));
//		}
		String[]po=s.split(" ");
//		for(int i=po.length-1;i>=0;i--) {
//			System.out.println(po[i]);
//		}
		
	
		
		for(int i=0;i<po.length;i++) {
			String st=po[i];
			for(int j=st.length()-1;j>=0;j--){
				System.out.print(st.charAt(j));

			}
			System.out.print(" ");
		}

	}

}
