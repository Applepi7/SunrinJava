
public class Exam1 {

	public static int add (int... n){
		int sum = 0;
		for(int i : n)
			sum += i;
		
		return sum;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(add(1));
		System.out.println(add(1, 2));
		System.out.println(add(1, 2, 3));
		
	}
}
