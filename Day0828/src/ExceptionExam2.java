
public class ExceptionExam2 {

	public static void method(){
		String[] irum = new String[3];
		
		try{
			irum[3] = "홍길동";
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("배열 예외 발생!");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		method();
	}

}
