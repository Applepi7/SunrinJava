
public class ExceptionExam3 {

	public static void method(){
		int n = Integer.parseInt("number");
		System.out.println(n);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
		method();
		} catch(NumberFormatException n){
			System.out.println("NumberFormat예외가 발생함");
		}
		
	}
	

}
