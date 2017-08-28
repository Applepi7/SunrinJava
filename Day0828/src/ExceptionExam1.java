
public class ExceptionExam1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[10];
		for(int i = 0; i<arr.length; i++)
			arr[i] = i + 1;
		
		try{
			arr[12] = 13;
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 인덱스 참조 범위를 넘었습니다.");
		}
		
		System.out.println("저는 실행이 될까요?");
	}

}
