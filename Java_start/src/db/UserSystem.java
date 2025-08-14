package db;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class UserSystem {

	public static void main(String[] args) throws SQLException {
		
		// 사용자 관리 시스템
		// 메뉴 1. 회원가입
		// 		  -> 아이디, 비밀번호, 이름 입력 받은 후 저장
		//		  -> 가입일자는 현재 시간으로 넣기
		//		  -> 아이디는 중복체크. 중복된 아이디 입력 시 다시 입력하도록
		// 메뉴 2. 로그인
		//		  -> 아이디, 비밀번호 입력 받은 후 
		//		  -> 아이디는 있는데 비밀번호가 다를 경우 -> '비밀번호를 확인해주세요'
		//		  -> 아이디가 없는경우 '아이디를 확인해주세요'
		//		  -> 둘다 일치하는 경우 '로그인 성공!'
		// 메뉴 3. 비밀번호수정
		//		  -> 2번 과정을 그대로 진행한 후 로그인 성공 시 진행
		//		  -> 로그인 성공 후 새롭게 수정할 비밀번호 입력받은 후 업데이트
		// 메뉴 4. 정보확인
		//		  -> 2번 과정을 그대로 진행한 후 로그인 성공 시 진행
		//		  -> 사용자 아이디, 이름, 가입날짜(YYYY-MM-DD HH24:MI:SS) 출력
		// 메뉴 5. 탈퇴
		//		  -> 2번 과정을 그대로 진행한 후 로그인 성공 시 진행
		//		  -> '정말 탈퇴하시겠습니까?' 출력 후 'Y' 입력 시 해당 아이디 삭제
		//		  -> 그 외 값 누르면 다시 메뉴로 이동
		// 그외. 종료
		
		Scanner s = new Scanner(System.in);
		DBClass db = new DBClass();
		String sql = "SELECT * FROM TBL_USER";
		ResultSet rs = db.stmt.executeQuery(sql);
		boolean userCheck = rs.next();
		
		System.out.println("======= 사용자 관리 시스템 =======");
		
		while(true) {
			System.out.println("메뉴를 선택하세요");
			System.out.print("[1] 회원가입 [2] 로그인 [3]비밀번호 수정 [4] 정보확인 [5] 탈퇴 : ");
			int menu = s.nextInt();		
			
			if(menu == 1) {
				String id;
				while(userCheck) {
					System.out.print("아이디 : ");
					id = s.next();
					if(rs.getString("USERID").equals(id)) {
						System.out.println("중복된 아이디가 있습니다. 다시 입력해주세요.");
						userCheck = true;
					} else {
						System.out.print("비밀번호 : ");
						String pwd = s.next();
						System.out.print("이름 : ");
						String name = s.next();
						String query = "INSERT INTO TBL_USER (USERID, PASSWORD, NAME, CDATETIME) VALUES("
								+ "'" + id + "', "
								+ "'" + pwd + "', "
								+ "'" + name + "', "
								+ "SYSDATE)";
						int num = db.stmt.executeUpdate(query);
						if(num > 0) {
							System.out.println("가입되었습니다!");
						} else {
							System.out.println("오류가 발생했습니다. 다시 시도해주세요.");
						}
						break;
					}
				}
				
			} else if(menu == 2) {
				System.out.print("아이디 : ");
				String id = s.next();
				System.out.print("비밀번호 : ");
				String pwd = s.next();
				if(rs.getString("USERID").equals(id) && rs.getString("PASSWORD").equals(pwd)) {
					System.out.println("로그인 성공!");
				}
				
			} else if(menu == 3) {
				
			} else if(menu == 4) {
				
			} else if(menu == 5) {
				
			}
			
		}
		
		
		

	}

}
