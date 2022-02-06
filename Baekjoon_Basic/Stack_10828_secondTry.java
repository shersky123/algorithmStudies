package algorithm;


import java.io.*;
import java.util.*;
public class Stack_10828_secondTry {
	// 시간 초과가 뜨는 문제를 BufferedWriter를 사용하여 해소
	public static void main(String[] args) throws IOException {		
		Scanner sc = new Scanner(System.in);
		//BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		/*
		 BufferedReader / BufferedWriter 
		 버퍼를 이용해서 입출력을 하는 메소드.
		 입력 : 사용자가 키보드에 누를 때마다 전달을 하는 것이 아니라 버퍼에 용량만큼 모았다가 전달
		 출력 : 버퍼를 거쳐서 간접적으로 출력장치로 전달되기에 시스템의 데이터처리 효율성을 높여줌
		 버퍼스트림을 InputStreamReader / OutputStreamWriter를 같이 사용하여 버퍼링을 하게 되면
		 입출력 스트림으로부터 미리 버퍼에 데이터를 갖다 놓기 때문에 보다 효율적인 입출력이 가능.
		 
		 BufferedReader
		 	Scanner를 통해 입력을 받을 경우 Space Enter를 모두 경계로 인식하기에 입력받은 데이터를
		 	가공하기 매우 편리하다. 그에 비해 BufferedReader는 Enter만 경계로 인식하고 받은 데이터가 
		 	String으로 고정되기 때문에 입력받은 데이터를 가공하는 작업이 필요한 경우가 많다.
		 	하지만 많은 양의 데이터를 입력받을 경우 BufferedREader를 통해 입력받느 것이 효율면에서 훨씬 낫다.
		 	- BufferedReader의 readLine()을 사용하면 데이터를 라인 단위로 읽을 수 있다.(Scanner의 nextLine()과 같음)
		 	- readLine 함수 리턴 값은 String으로 고정되기 때문에 다른 타입으로 입력 받으려면 형변환 필수
		 	- 예외처리를 꼭 해주어야 함(readLine 할때마다 try&catch / throws IOException(주로 사용됨))
		 	
		 BufferedWriter 
		 	System.out.print("");와 동일한 기능인 출력을 하는 메소드.
		 	버퍼를 이용하기 때문에 성능이 print 메소드보다 좋다. 많은 양의 출력이 필요하면 BufferedWriter 사용.
		 	버퍼를 잡아 놓았기 때문에 반드시 flush() / close()를 호출해 주어 뒤처리를 해주어야 함.
		 	bw.write에는 System.out.println();과 같이 자동개행 기능이 없기 때문에 개행이 필요하면 \n 따로 처리 필요.
		 	** write한다고 바로바로 출력되지 않음. 직접 출력 stream에 반영되는 것이 아니라 buffer에 저장해두었다가
		 		BufferedWriter가 flush되거나 close되었을 때 한번에 출력 stream에 반영하기 때문.
		 	close는 stream을 닫아버리기 때문에 계속 출력하고자 한다면 flush를 사용한다.
		 */
		int repeatNum = sc.nextInt();
		int stack[] = new int[repeatNum]; 
		int size = 0; 
		for(int i=0; i<repeatNum; i++) {
			String command = sc.next();
			//String command = bf.readLine();
			// Exception in thread "main" java.util.InputMismatchException (default에 있는 sc.nextInt() 수정 안할 시)
			// bf.readLine()으로 command를 받아오면 push만 들어오는게 아니라 'push x' 전체가 들어간다.
			// push 3 이후 pop을 하면 default에 있는 sc.nextInt();로 받아오는 값이 'pop'이기 때문에 자료형이 달라서 에러 발생
			switch(command) {			
			case "pop":	
				if(size==0) {
					bw.write(-1+"\n"); //bw.write에는 자동개행이 없기 때문에 개행이 필요하면 \n 따로 처리해줘야 함.
					//System.out.println(-1);
				}else {
					bw.write(stack[size-1]+"\n");
					stack[size-1] = 0;
					size -=1;
				}				
				break;
			case "size":
				bw.write(size+"\n");
				break;
			case "empty":
				bw.write((size==0?1:0)+"\n");
				break;
			case "top":
				bw.write((size==0?-1:stack[size-1])+"\n");
				break;
			default:
				//System.out.println(command);
				int data = sc.nextInt();
				//int data = Integer.parseInt(bf.readLine());
				/*
				 Exception in thread "main" java.lang.NumberFormatException: For input string: "pop"
					at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
					at java.base/java.lang.Integer.parseInt(Integer.java:652)
					at java.base/java.lang.Integer.parseInt(Integer.java:770)
					at algorithm.Stack_10828_secondTry.main(Stack_10828_secondTry.java:40)
				 */
				// bf.readLine()으로 받은 command가 'push'가 아니라 'push x'전체이기 때문에 에러 발생
				stack[size] = data;
				size += 1;
				break;
			}
		}
		bw.flush();
		// BufferedWriter의 경우 버퍼를 잡아 놓았기 때문에 반드시 flush()/close()를 호출하여 뒤처리를 해주어야 한다.
		// 결과 : 성공
	}
}
