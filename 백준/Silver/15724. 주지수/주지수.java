import java.io.*;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		int arr[][] = new int[n+1][m+1];
		for(int i = 1; i <= n; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for(int j = 1; j <= m; j++)
				arr[i][j] += arr[i-1][j] + arr[i][j-1] - arr[i-1][j-1] + Integer.parseInt(st.nextToken());
		}
		
		int k = Integer.parseInt(br.readLine());
		while(k-- > 0) {
			st = new StringTokenizer(br.readLine(), " ");
			int x1 = Integer.parseInt(st.nextToken());
			int y1 = Integer.parseInt(st.nextToken());
			int x2 = Integer.parseInt(st.nextToken());
			int y2 = Integer.parseInt(st.nextToken());
			
			System.out.println(arr[x2][y2] - arr[x1-1][y2] - arr[x2][y1-1] + arr[x1-1][y1-1]);
		}
	} 
	
}
