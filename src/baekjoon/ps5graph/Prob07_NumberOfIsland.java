package baekjoon.ps5graph;

import java.io.*;

public class Prob07_NumberOfIsland {

    static int n;
    static int m;
    static int[][] graph;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while(true) {
            String[] nm = br.readLine().split(" ");
            n = Integer.parseInt(nm[1]);
            m = Integer.parseInt(nm[0]);

            if(n == 0 && m == 0) break;
            graph = new int[n][m];
            for (int i = 0; i < n; i++) {
                String[] map = br.readLine().split(" ");
                for (int j = 0; j < map.length; j++) {
                    graph[i][j] = Integer.parseInt(map[j]);
                }
            }

            int count = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if(dfs(i, j)) count++;
                }
            }
            bw.write(count + "\n");
        }
        bw.flush();
        bw.close();
    }

    static boolean dfs(int x, int y) {
        if(x == -1 || y == -1 || x == n || y == m) return false;
        if(graph[x][y] == 0) return false;

        graph[x][y] = 0;

        dfs(x, y + 1);
        dfs(x, y - 1);

        dfs(x - 1, y);
        dfs(x - 1, y - 1);
        dfs(x - 1, y + 1);

        dfs(x + 1, y);
        dfs(x + 1, y - 1);
        dfs(x + 1, y + 1);

        return true;
    }
}
