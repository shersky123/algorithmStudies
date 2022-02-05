package algorithm;

import java.util.*;
public class Stack_10828_firstTry {

	public static void main(String[] args) {
		
		/*
		 
		문제
			정수를 저장하는 스택을 구현한 다음, 입력으로 주어지는 명령을 처리하는 프로그램을 작성하시오.
			
			명령은 총 다섯 가지이다.
			
			push X: 정수 X를 스택에 넣는 연산이다.
			pop: 스택에서 가장 위에 있는 정수를 빼고, 그 수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
			size: 스택에 들어있는 정수의 개수를 출력한다.
			empty: 스택이 비어있으면 1, 아니면 0을 출력한다.
			top: 스택의 가장 위에 있는 정수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
		
		입력
			첫째 줄에 주어지는 명령의 수 N (1 ≤ N ≤ 10,000)이 주어진다. 둘째 줄부터 N개의 줄에는 명령이 하나씩 주어진다. 
			주어지는 정수는 1보다 크거나 같고, 100,000보다 작거나 같다. 문제에 나와있지 않은 명령이 주어지는 경우는 없다.
		
		출력
			출력해야하는 명령이 주어질 때마다, 한 줄에 하나씩 출력한다.
		
		*/
		Scanner sc = new Scanner(System.in);		
		int repeatNum = sc.nextInt();
		int stack[] = new int[repeatNum]; //int[10000]로 하기보단 push 최댓값 == repeatNum으로 size 초기화
		int size = 0; // switch-case문에서 size값을 직접 조정. stack.length 사용 x
		// stack.length는 처음 초기화한 stack 전체 길이를 가져온다.
		//repeatNum==5 이후 push 1, 2, 3 ==> size는 3, stack.length는 5
		for(int i=0; i<repeatNum; i++) {
			String command = sc.next();
			switch(command) {			
			case "pop":	
				if(size==0) {
					System.out.println(-1);
				}else {
					System.out.println(stack[size-1]);
					stack[size-1] = 0;
					size -=1;
				}				
				break;
			case "size":
				System.out.println(size);
				break;
			case "empty":
				System.out.println(size==0?1:0);
				break;
			case "top":
				System.out.println(size==0?-1:stack[size-1]);
				break;
			default:
				int data = sc.nextInt(); //Integer.parseInt(command.replaceAll("[^0-9]", "")); <== command가 "push x"인줄
				// sc.next() ==> 다음 토큰을 문자열로 입력. push x 에서 "push"만 가져옴.
				// 정수 x를 가져오고 싶으면 sc.nextInt()를 사용한다.
				stack[size] = data;
				size += 1;
				break;
			}
		}
		// 결과 : 시간초과
	}
}
