package algorithm.class12_Greedy;

import java.util.Scanner;

public class Prob05_Superviser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int b = sc.nextInt();
        int c = sc.nextInt();

        int count = n;

        for (int i = 0; i < n; i++) {
            if(arr[i] - b >= 0){
                count += Math.ceil((float)(arr[i] - b) / c);
            }
        }
        System.out.println(count);
    }
}
