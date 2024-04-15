package practice06;
/*
1, 2, 3 더하기
 */
// 	14324	120
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class java11_9095 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        int[] arr = new int[11];    // 11보다 작은 양수
        // dp 활용을 위한 1,2,3 초기화
        arr[1] = 1;
        arr[2] = 2;
        arr[3] = 4;
        // 4부터 추론
        // dp [n] = dp [n-1] + dp [n-2] + dp [n-3]
        for (int i = 4; i < 11; i++) {
            arr[i] = arr[i-1] + arr[i-2] + arr[i-3];
        }

        for (int i = 0; i < T; i++) {
            int n = Integer.parseInt(br.readLine());
            sb.append(arr[n]).append("\n");
        }
        System.out.println(sb);
        br.close();
    }
}
