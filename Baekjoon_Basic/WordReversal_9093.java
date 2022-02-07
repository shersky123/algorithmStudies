package algorithm;

import java.util.*;
import java.io.*;
public class WordReversal_9093 {

	public static void main(String[] args) throws IOException {

		/*
		 
		문제
			문장이 주어졌을 때, 단어를 모두 뒤집어서 출력하는 프로그램을 작성하시오. 
			단, 단어의 순서는 바꿀 수 없다. 단어는 영어 알파벳으로만 이루어져 있다.
					
		입력
			첫째 줄에 테스트 케이스의 개수 T가 주어진다. 
			각 테스트 케이스는 한 줄로 이루어져 있으며, 문장이 하나 주어진다. 
			단어의 길이는 최대 20, 문장의 길이는 최대 1000이다. 단어와 단어 사이에는 공백이 하나 있다.
		
		출력
			각 테스트 케이스에 대해서, 입력으로 주어진 문장의 단어를 모두 뒤집어 출력한다.
		
		*/
		//Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int testCase = Integer.parseInt(br.readLine());
		for(int i=0; i<testCase; i++) {
			String sentence = br.readLine()+"\n"; // 문장이 끝날 때 있는 마지막 단어를 출력하기 위해 "\n"추가.
			//System.out.println(sentence);
			char stack[] = new char[sentence.length()]; 
			int size = 0;
			for(int j=0; j<sentence.length(); j++) {
				//System.out.println(j+"인덱스: "+sentence.charAt(j));				
				if(sentence.charAt(j) == ' ' || sentence.charAt(j) == '\n') {
					while(size !=0) { // for문에 size를 넣으면 안됨. pop하면서 size를 줄이는 과정이 있기 때문.
						bw.write(stack[size-1]); //뒤집은 단어 출력처리
						size--;
					}
					bw.write(sentence.charAt(j)); //공백 또는 개행문자 출력처리
					// while문 안에서는 단어의 문자만 출력하기 때문에 공백 또는 개행문자 부분은 따로 추가해줌.
					//size = 0;
				}else {
					// stack에 공백이나 개행이 안들어가도록 else문에서 push.
					stack[size] = sentence.charAt(j);
					size++;
				}
			}
			bw.flush();
		}
		// 결과 : 성공
	}
}
