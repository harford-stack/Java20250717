package day8;

public class Point3D extends Point{ // 선생님 git 확인하기
	
	private int z;
	
	public Point3D(int x, int y, int z) {
		super(x, y);
		this.z = z;
	}
	
	// 오버라이딩
	@Override
		public String toString() {
			return "(" + getX() + "," + getY() + "," + z + ") 의 점";
		}
	
	void moveUp() {
		this.z++;
		// z = z + 1;
		// z += 1;
	}
	
	void moveDown() {
		z--;
	}
	
	// 오버로딩
	void move(int x, int y, int z) {
		super.move(x, y);
		this.z = z;
	}
	


}
