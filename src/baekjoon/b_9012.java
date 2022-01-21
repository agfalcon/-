package baekjoon;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class b_9012 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String [] arr = new String[50];
		String [] stack = new String[50];
		int top = -1;
		int size = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		boolean e = false;
		for(int i=0;i<size;i++)
		{
			arr = br.readLine().split("");
			for(int j=0;j<arr.length;j++) {
				if(arr[j].equals("(")) {
					stack[++top] = arr[j];
				}
				else {
					if(top==-1) {
						sb.append("NO").append('\n');
						e = true;
						break;
					}
					top--;
				}
			}
			if(!e) {
				if(top!=-1) {
					sb.append("NO").append('\n');
				}
				else {
					sb.append("YES").append('\n');
				}
			}
			e = false;
			top=-1;
		}
		System.out.print(sb);
		
	}
}
