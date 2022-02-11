package algorithm;

import java.math.BigInteger;
import java.util.*;
public class BigIntegerBasic {

	public static void main(String[] args) {

		/*
		 
		문제
			갑부 최백준 조교는 동전을 최소로 바꾸는데 성공했으나 김재홍 조교가 그 돈을 발견해서 최백준 조교에게 그 돈을 나누자고 따진다.
			그 사실이 전 우주로 알려지자 우주에 있던 많은 생명체들이 자신들에게 돈을 분배해 달라고 당장 달려오기 시작했다.
			프로토스 중앙 우주 정부의 정책인, ‘모든 지적 생명체는 동등하다’라는 규칙에 입각해서 돈을 똑같이 분배하고자 한다.
			한 생명체에게 얼마씩 돈을 줄 수 있는가?
			또, 생명체들에게 동일하게 분배한 후 남는 돈은 얼마인가?
					
		입력
			첫째 줄에는 최백준 조교가 가진 돈 n과 돈을 받으러 온 생명체의 수 m이 주어진다. 
			(1 ≤ m ≤ n ≤ 10^1000, m과 n은 10진수 정수)
		
		출력
			첫째 줄에 생명체 하나에게 돌아가는 돈의 양을 출력한다. 
			그리고 두 번째 줄에는 1원씩 분배할 수 없는 남는 돈을 출력한다.
		
		*/
		
		//1차 시도
		Scanner sc = new Scanner(System.in);
		int money = sc.nextInt();
		int people = sc.nextInt();
		System.out.println(money/people);
		System.out.println(money%people);
		// => 런타임 에러
		
		//2차 시도
		Scanner sc2 = new Scanner(System.in);
		BigInteger money2 = sc2.nextBigInteger();
		BigInteger people2 = sc2.nextBigInteger();
		System.out.println(money2.divide(people2));
		System.out.println(money2.remainder(people2));
		// => 성공
		
		
		/*
		 * 최댓값이 10^1000이므로 int의 범위로 커버하지 못함!​

			<java.math.BigInteger클래스>			​
			
			정수형으로 표현할 수 있는 값의 한계가 있다. 가장 큰 정수형 타입인 long으로 표현할 수 있는 값은 10진수로 19자리 정도이다. 
			이보다 더 큰 값을 다뤄야 할 때 사용하면 좋은 것이 BigInteger이다.			​
			
			- BigInteger의 생성			
				BigInteger를 생성하는 방법은 여러 가지가 있는데, 문자열로 숫자를 표현하는 것이 일반적이다. 
				정수형 리터럴로는 표현할 수 있는 값의 한계가 있기 때문이다.
		 */
		BigInteger val;
		val = new BigInteger("12345678901234567890"); // 문자열로 생성
		val = new BigInteger("FFFF", 16); // n진수(radix)의 문자열로 생성
		val = BigInteger.valueOf(1234567890L); // 숫자로 생성
		/*
		 	- 다른 타입으로의 변환
				BigInteger를 문자열, 또는 byte배열로 변환하는 메서드는 다음과 같다.
				
				String toString() // 문자열로 변환
				String toString(int radix) // 지정된 진법(radix)의 문자열로 변환
				byte[] toByteArray() // byte배열로 변환
				Number로부터 상속받은 기본형으로 변환하는 메서드
				
				int intValue()
				long longValue()
				float floatValue()
				double doubleValue()
				정수형으로 변환하는 메서드 중에서 이름 끝에 'Exact'가 붙은 것들은 변환한 결과가 변환한 타입의 범위에 속하지 않으면 
				ArithmeticException을 발생시킨다.
				
				byte byteValueExact()
				int intValueExact()
				long longValueExact()
				
			- BigInteger의 연산
				
				BigInteger add(BigInteger val) // 덧셈(this+val)
				BigInteger subtract(BigInteger val) // 뺄셈(this-val)
				BigInteger multiply(BigInteger val) // 곱셈(this*val)
				BigInteger divide(BigInteger val) // 나눗셈(this/val)
				BigInteger remainder(BigInteger val) // 나머지(this%val)
				cf) remainder와 mode는 둘 다 나머지를 구하는 메서드지만, 
				mode는 나누는 값이 음수면 ArithmeticException을 발생시킨다는 점이 다르다.
		 */	
		
	}
}
