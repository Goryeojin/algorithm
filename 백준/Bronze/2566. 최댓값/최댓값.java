import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int max = 0;
        int x = 1;
        int y = 1;

        for (int i=1; i<=9; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            for (int j=1; j<=9; j++) {
                int tmp = Integer.parseInt(st.nextToken());
                if (tmp > max) {
                    max = tmp;
                    x = i;
                    y = j;
                }
            }
        }
        System.out.println(max);
        System.out.println(x + " " + y);
    }
}

