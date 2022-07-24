package SWEA.D1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SWEA_2071 {
    public static void main(String[] args) throws Exception {
        BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));

        int tc = Integer.parseInt(br.readLine());

        for(int i=1; i<=tc; i++){
            String[] nums = br.readLine().split(" ");
            double sum = 0;
            for(int j=0; j< nums.length; j++){
                sum += Integer.parseInt(nums[j]);
            }
            double avg = sum/nums.length;

            System.out.print("#"+i+" ");
            System.out.println(Math.round((avg)));
        }
    }
}
