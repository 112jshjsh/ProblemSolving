import java.io.*;
import java.util.*;

class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[N+1];
		st = new StringTokenizer(br.readLine(), " ");
		for(int i = 1; i <= N; i++)
			arr[i] = arr[i-1] + Integer.parseInt(st.nextToken());
		
		for(int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			System.out.println(-arr[Integer.parseInt(st.nextToken())-1] + arr[Integer.parseInt(st.nextToken())]);
		}
	}
}
