package day8;

public class PointMain {

	public static void main(String[] args) {
		
		ColorPoint cp1 = new ColorPoint(5, 5, "YELLOW");
		   cp1.setXY(10, 20); // Point 클래스에 없기 때문에 ColorPoint 에서 새로 만들어야함
		   cp1.setColor("RED");
		   String str = cp1.toString(); // toString() 은 object 클래스가 가지고 있음 // 오버라이딩하는게 더 깔끔
		   System.out.println(str+"입니다. ");
		   // 결과 : RED색의 (10,20)의 점입니다.
		   
	    ColorPoint zeroPoint = new ColorPoint(); // (0,0) 위치의 BLACK 색 점
   		System.out.println(zeroPoint.toString() + "입니다.");
	    ColorPoint cp2 = new ColorPoint(10, 10); // (10,10) 위치의 BLACK 색 점
	    cp2.setXY(5,5);
	    cp2.setColor("RED");
	    System.out.println(cp2.toString()+"입니다.");
	    // 결과 : BLACK색의 (0,0) 점입니다.
		// RED색의 (5,5) 점입니다.
	    
	    Point3D pp = new Point3D(1,2,3); // 1,2,3은 각각 x, y, z축의 값.
	    System.out.println(pp.toString()+"입니다.");
	    pp.moveUp(); // z 축으로 위쪽 이동
	    System.out.println(pp.toString()+"입니다.");
	    pp.moveDown(); // z 축으로 아래쪽 이동
	    pp.move(10, 10); // x, y 축으로 이동
	    System.out.println(pp.toString()+"입니다.");
	    pp.move(100,  200, 300); // x, y, z축으로 이동
	    System.out.println(pp.toString()+"입니다.");	    
	    
//	    (1,2,3) 의 점입니다.
//	    (1,2,4) 의 점입니다.
//	    (10,10,3) 의 점입니다.
//	    (100,200,300) 의 점입니다.
	    
	    PositivePoint p = new PositivePoint();
	    p.move(10, 10);
	    System.out.println(p.toString()+"입니다.");
	    p.move(-5,5); // 객체 p는 음수 공간으로 이동되지 않음
	    System.out.println(p.toString()+"입니다.");
	    PositivePoint p2 = new PositivePoint(-10, -10);
	    System.out.println(p2.toString()+"입니다.");
	    
//	    (10,10)의 점입니다.
//	    (10,10)의 점입니다.
//	    (0,0)의 점입니다.

	}

}
