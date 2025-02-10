package com.celcom.saturday_assignment_08_feb_2025;
class NewRectangle{
	int height;
	int width;
	
	
	void area() {
		System.out.println(height*width);
	}
	void circumference() {
		System.out.println(2*(height*width));
	}
	void setDimension(int height,int width) {
		this.height=height;
		this.width=width;
	}
}

public class RectangleDemo {

	public static void main(String[] args) {
		
		NewRectangle rectangle = new NewRectangle();
		rectangle.setDimension(10,20);
		rectangle.area();
		rectangle.circumference();

	}

}
