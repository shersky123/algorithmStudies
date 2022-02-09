package algorithm;

import java.util.*;
public class Parenthesis_9012_sampleAnswer {
	public static String isValid(String s) {
        int n = s.length();
        int cnt = 0;
        for (int i=0; i<n; i++) {
            if (s.charAt(i) == '(') {
                cnt += 1;
            } else {
                cnt -= 1;
            }
            if (cnt < 0) {
                return "NO";
            }
        }
        if (cnt == 0) {
            return "YES";
        } else {
            return "NO";
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n-- > 0) {
            System.out.println(isValid(sc.next()));
        }
    }
    /*
     1) 닫는 괄호 앞에는 여는 괄호
     2) 다른 여는 괄호와 짝 X
     3) 가장 가까운 여는 괄호
     
     모든 과정이 끝났을 때 스택이 비어 있지 않음 => 닫은 괄호 부족
     닫는 괄호 & 스택 비어 있음 => 여는 괄호 부족
     
     스택이 비어있는데 )가 나타났으면 올바른 괄호 문자열이 아니다
     모든 과정이 끝나고 스택이 비어있으면 올바른 괄호 문자열
     끝났는데 스택이 비어 있지 않으면 올바른 괄호 문자열이 아니다
     
     과정을 살펴보면 스택에 들어가는 것이 여는 괄호 '(' 밖에 없다.
     스택을 구현하지 않고, 스택의 크기만 이용해서, 몇 개의 여는 괄호가 스택에 들어가있는지를
     판단하는 구현 방식도 가능하다.
     */
}
