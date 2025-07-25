package day8;

public class ColorPoint extends Point {
	
	
	private String color;
	
	public ColorPoint() {
		this(0, 0, "BLACK");
//		super(0, 0);
//		this.color = "BLACK";
	}
	
	public ColorPoint(int x, int y) {
		this(x, y, "BLACK");
	}
	
	public ColorPoint(int x, int y, String color) {
		super(x, y);
		this.color = color;
	}
	
	void setXY(int x, int y) {
		super.move(x, y);
	}

	void setColor(String color) {
		this.color = color;
	}
	
	@Override
	public String toString() {
		return color + "색의 (" + getX() + ", " + getY() + ")" + "의 점";
	}
	
}
