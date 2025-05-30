import java.io.*;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		int[] coins = new int[N];
		for(int i = 0; i < N; i++)
			coins[i] = Integer.parseInt(br.readLine());
		
		int answer = 0;
		for(int i = N-1; i >= 0; i--) {
			answer += K / coins[i];
			K %= coins[i];
			if(K == 0) break;
		}
		
		System.out.print(answer);
	}
}
