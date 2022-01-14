import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class algorithm11052 {
    public static int[] dp = new int[1001];
    public static int [] p;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        p = new int[n + 1];
        for (int i = 1; i<=n; i++){
            p[i] = Integer.parseInt(br.readLine());
        }
        System.out.print(DP(n));
    }

    public static int DP(int n){
        int max = 0;
        for (int i =1; i<=n; i++){
            for (int j=1; j<=i; j++){
                if (max<dp[i-j]+p[j]){
                    max = dp[i-j] + p[j];
                    dp[i] = max;
                }
            }
        }
        return dp[n];
    }
}
