package SWEA.D2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SWEA_1970 {
    public static void main(String[] args) throws Exception {
        BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));

        int tc = Integer.parseInt(br.readLine());
        for (int i=1; i<=tc; i++){
            System.out.println("#"+i);
            int money = Integer.parseInt(br.readLine());
            int rest = 0;

            int Won_50000 = 0;
            int Won_10000 = 0;
            int Won_5000 = 0;
            int Won_1000 = 0;
            int Won_500 = 0;
            int Won_100 = 0;
            int Won_50 = 0;
            int Won_10 = 0;

            for(int j=0; j<money; j++){
                Won_50000=(money/50000);
                rest = (money%50000);
                Won_10000=(rest/10000);
                rest=(rest%10000);
                Won_5000=(rest/5000);
                rest=(rest%5000);
                Won_1000=(rest/1000);
                rest=(rest%1000);
                Won_500=(rest/500);
                rest=(rest%500);
                Won_100=(rest/100);
                rest=(rest%100);
                Won_50=(rest/50);
                rest=(rest%50);
                Won_10=(rest/10);

            }
            System.out.printf("%d %d %d %d %d %d %d %d\n", Won_50000, Won_10000, Won_5000, Won_1000, Won_500, Won_100, Won_50, Won_10);
        }
    }
}
