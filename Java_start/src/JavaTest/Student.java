package JavaTest;

public class Student extends Human{	
	
//	[문항4]  4. 첨부된 코드를 참고하여 오류나는 부분 및 주석을 참고하여 정상 동작하도록 수정하시오. (15점)
//	-- 첨부파일 카페 참고
//	-- Human 클래스는 수정하지 말 것
	
	int stuNo ;
	
	public Student(String name, int age, String gender, double height, int stuNo) {
		super(name, age, height, gender);
		this.stuNo = stuNo;
	}
	
	public Student(String name, int age, double height, int stuNo) {
		super(name, age, height);
		this.stuNo = stuNo;
	}

	@Override
	public void introduce() {
		// TODO Auto-generated method stub		
	}
}
