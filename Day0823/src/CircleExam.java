
public class CircleExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle obj = new Circle(2, 3, 30);
		System.out.println("�� obj : " + obj);
	}

}

class Circle{
	
	private int x, y, radius;
	
	Circle(int x, int y, int radius){
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	
	@Override
	public String toString(){
		return "Circle(" + x + ", " + y + ", " + radius + ")";
	}
}