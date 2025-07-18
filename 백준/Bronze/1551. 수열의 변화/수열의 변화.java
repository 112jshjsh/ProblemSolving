import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine(), ",");
        for(int i = 0; i < N; i++)
            arr[i] = Integer.parseInt(st.nextToken());

        int newArr[];
        while(K-- > 0) {
            newArr = new int[arr.length - 1];
            for(int i = 0; i < arr.length - 1; i++)
                newArr[i] = arr[i+1] - arr[i];
            arr = newArr;
        }

        for(int i = 0; i < arr.length; i++)
            System.out.printf(i == arr.length - 1 ? "%d" : "%d,", arr[i]);
    }

}
