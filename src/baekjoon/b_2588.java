package baekjoon;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class b_2588 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num1 = Integer.parseInt(br.readLine());
		int num2 = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		sb.append(num1 * (num2%10)).append('\n');
		sb.append(num1 * (num2/10%10)).append('\n');
		sb.append(num1 * (num2/100)).append('\n');
		sb.append(num1 * (num2%10)+(num1 * (num2/10%10))*10+(num1 * (num2/100))*100);
		System.out.println(sb);
	}
}
