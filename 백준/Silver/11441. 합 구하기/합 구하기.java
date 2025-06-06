import java.io.*;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int arr[] = new int[n+1];
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		for(int i = 1; i <= n; i++)
			arr[i] = arr[i-1] + Integer.parseInt(st.nextToken());
		
		int m = Integer.parseInt(br.readLine());
		while(m-- > 0) {
			st = new StringTokenizer(br.readLine(), " ");
			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());
			System.out.println(arr[end] - arr[start-1]);
		}
	} 
}
