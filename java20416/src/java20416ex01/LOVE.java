package java20416ex01;

import java.util.Scanner;

public class LOVE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		 System.out.print(">> ");	 
		 String str1 = new String(sc.nextLine());
		 String string1[] = str1.split(" ");
		 
		 while(true)
		{	
			 
			 
			 System.out.print("명령 : ");
			 String str2 = new String(sc.next());
			 
			 if(str2.equals("그만"))
			 {
				 System.out.println("종료합니다.");
				 break;
			 }
			 
			 String arr[] = str2.split("!");
			 
			
				 for(int i = 0; i<string1.length; i++){
					 if(arr[0].equals(string1[i]))
					 {
						 string1[i] = arr[1];
						 
						 for(i = 0; i<string1.length; i++){
							 System.out.print(string1[i] + " ");
						 }
						 System.out.println("");
						 
					 }
					 else{
						 System.out.println("찾을 수 없습니다!");
						 break;
					 }
				 }
			 
			// StringBuffer str2;
		
			
		}
	}

}
