
class Point {
	private int x, y;
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}


}

public class ToStringExam3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point p = new Point(10, 20);
		System.out.println(p.toString());
	}

}
