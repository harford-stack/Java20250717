package day8;

public class PositivePoint extends Point{
	
	PositivePoint() {
		super(0, 0);
	}
	
	PositivePoint(int x, int y) { 
//		if(x >= 0 && y >= 0) {
//			super(x,y); // super는 무조건 첫줄이어야 함
//		}
		super(x,y);
		if(x < 0 || y < 0) {
			super.move(0, 0);
		}
	}
	
	@Override
	public String toString() {
		return "(" + getX() + "," + getY() + ") 의 점";
	}
	
	@Override
	protected void move(int x, int y) {
		if(x >= 0 && y >= 0) {
			super.move(x, y);
		}
	}

}
