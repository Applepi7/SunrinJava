
import java.io.IOException;

public class IOExam3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int bt = 0;
		try {
			while(true){
			bt = System.in.read();
			if(bt == -1)
				break;
			
			System.out.println((char)bt);
			}
		} catch (IOException e){
			e.printStackTrace();
			System.err.println(e);
		}
	}

}
