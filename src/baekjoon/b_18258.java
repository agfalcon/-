package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class b_18258 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int queue[] = new int[2000000];
		int start = 0;
		int end = -1;
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<N;i++) {
			String o = br.readLine();
			if(o.length()>5) {
				o = o.substring(5);
				queue[++end] = Integer.parseInt(o);
			}
			switch(o) {
			case "pop":
				if(start>end) {
					sb.append(-1).append('\n');
				}
				else {
					sb.append(queue[start++]).append('\n');
				}
				break;
			case "size":
				sb.append(end-start+1).append('\n');
				break;
			case "empty":
				if(start>end) {
					sb.append(1).append('\n');
				}
				else {
					sb.append(0).append('\n');
				}
				break;
			case "front":
				if(start>end) {
					sb.append(-1).append('\n');
				}
				else {
					sb.append(queue[start]).append('\n');
				}
				break;
			case "back":
				if(start>end) {
					sb.append(-1).append('\n');
				}
				else {
					sb.append(queue[end]).append('\n');
				}
				break;
			}
		}
		System.out.print(sb);
	}
}
