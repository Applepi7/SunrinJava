package java20416ex01;

public class StringBufferSpeedCheck {
	
	public static void main(String[] args){
		StringBuffer s1 = new StringBuffer("Sunrin");
		StringBuffer s2 = new StringBuffer("Web");
		
		long start = System.currentTimeMillis();
		
		for(int i = 0; i<100_100; i++)
			s1.append(s2);
		
	}
	
}
