package algorithm;

import java.util.Scanner;
public class AddTwoNumbers {

	public static void main(String[] args) {
		int a, b, result;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        result = a+b;
        System.out.println(result);
        
        /*
         	import java.util.*;    // Scanner 클래스를 사용하기 위해 추가
			Scanner sc = new Scanner(System.in); // Scanner 클래스의 객체를 생성			
			String input = sc.nextLine(); // 입력받은 내용을 input에 저장			
			int num = Integer.parseInt(input); // 입력받은 내용을 int타입 값으로 변환
									
			nextLine() : 한 줄 단위로 입력받음(Enter를 치기 전까지 쓴 모든 문자열 리턴)			
			nextInt() : 공백 이전까지의 입력. 변환없이 숫자로 바로 입력받을 수 있는 메서드			
			(문자열을 숫자로 변환하는 수고를 하지 않아도 된다)				​
			
			* 한 줄에 공백으로 구분되는 두 숫자를 받기 위해 sc.nextInt()를 사용 
			
         */

	}

}
