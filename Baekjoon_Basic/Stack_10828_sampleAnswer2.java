package algorithm;

import java.util.*;
import java.io.*;
public class Stack_10828_sampleAnswer2 {
	public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = sc.nextInt();
        Stack<Integer> stack = new Stack<Integer>();
        for (int k=0; k<n; k++) {
            String cmd = sc.next();
            if (cmd.equals("push")) {
                int num = Integer.parseInt(sc.next());
                stack.push(num);
            } else if (cmd.equals("top")) {
                if (stack.empty()) {
                    bw.write("-1\n");
                } else {
                    bw.write(stack.peek()+"\n");
                }
            } else if (cmd.equals("size")) {
                bw.write(stack.size()+"\n");
            } else if (cmd.equals("empty")) {
                if (stack.empty()) {
                    bw.write("1\n");
                } else {
                    bw.write("0\n");
                }
            } else if (cmd.equals("pop")) {
                if (stack.empty()) {
                    bw.write("-1\n");
                } else {
                    bw.write(stack.pop()+"\n");
                }
            }
        }
        bw.flush();
    }
}
