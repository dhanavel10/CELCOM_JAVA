package saturday_assignment08feb2025;


class Circle{
	int radius;
	
	
	void area() {
		System.out.println((3.14)*radius*radius);
	}
	void circumference() {
		System.out.println(2*(3.14)*radius);
	}
	void setRadius(int radius) {
		this.radius=radius;
	}
}
public class CircleDema {

	public static void main(String[] args) {
		
		Circle circle= new Circle();
		circle.setRadius(10);
		circle.area();
		circle.circumference();

	}

}
