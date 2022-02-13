package algorithm;

public class LackPrice {
	/*
	 문제 설명
		새로 생긴 놀이기구는 인기가 매우 많아 줄이 끊이질 않습니다. 
		이 놀이기구의 원래 이용료는 price원 인데, 놀이기구를 N 번 째 이용한다면 원래 이용료의 N배를 받기로 하였습니다. 
		즉, 처음 이용료가 100이었다면 2번째에는 200, 3번째에는 300으로 요금이 인상됩니다.		
		놀이기구를 count번 타게 되면 현재 자신이 가지고 있는 금액에서 얼마가 모자라는지를 
		return 하도록 solution 함수를 완성하세요.		
		단, 금액이 부족하지 않으면 0을 return 하세요.
		
	제한사항		
		놀이기구의 이용료 price : 1 ≤ price ≤ 2,500, price는 자연수		
		처음 가지고 있던 금액 money : 1 ≤ money ≤ 1,000,000,000, money는 자연수		
		놀이기구의 이용 횟수 count : 1 ≤ count ≤ 2,500, count는 자연수
		
	입출력 예
		
		price	money	count	result		
		  3		 20		  4		  10
		
		입출력 예 설명
		- 이용금액이 3인 놀이기구를 4번 타고 싶은 고객이 현재 가진 금액이 20이라면, 
		총 필요한 놀이기구의 이용 금액은 30 (= 3+6+9+12) 이 되어 10만큼 부족하므로 10을 return 합니다.
	 */
	
	class Solution {
	    public long solution(int price, int money, int count) {
	        long answer = -1;
	        answer = price*(long)count*(count+1)/2-money;
	        return answer<0?0:answer;
	    }
	}
	
	/*
	 * int형을 long으로 변환시켜주지 않으면 오버플로우가 발생하여 제대로 된 답을 얻기 어려움! 
	   계산과정 중 하나(count)를 long형으로 명시적 변환을 해주면 계산 결과는 자동형변환으로 long형이 된다.​	

		1) 가격*1 + 가격 * 2 + ....  가격 * 횟수 = 가격(1+2+....횟수)		
		2) 1부터 n까지의 자연수의 합은 n*(n+1)/2 를 통해 구할 수 있음		
		3) 총 필요 금액에 가지고 있는 금액을 빼서 answer에 저장		
		4) answer가 음수면 돈이 충분(= 금액이 부족하지 않음)하다는 것이므로 0을 return하고, 
		양수면 그대로 answer를 return하게 함.(삼항연산자)
	 */
	
	class Solution2 {
	    public long solution(long price, long money, long count) {
	        return Math.max(price * (count * (count + 1) / 2) - money, 0);
	    }
	}
	// * 매개변수를 long형으로 바꿔준다 ▶ 명시적 형변환을 안해줘도 됨
	// * Math.max 활용하여 음수면 자동으로 0이 반환됨
}
