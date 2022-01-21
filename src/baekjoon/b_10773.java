package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class b_10773 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int size = Integer.parseInt(br.readLine());
		int stack[] = new int[size];
		int top = -1;
		for(int i=0;i<size;i++)
		{
			int num = Integer.parseInt(br.readLine());
			if(num==0)
			{
				top--;
				continue;
			}
			top++;
			stack[top] = num;
		}
		
		int sum =0;
		for(int i=0;i<=top;i++) {
			sum+= stack[i];
		}
		System.out.println(sum);
	}
}
