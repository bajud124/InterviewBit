package LeetCode;
import java.util.*;

public class Triangle {
    public int minimumTotal(List<List<Integer>> triangle) {
        int row = triangle.size();
        int col = triangle.get(triangle.size() - 1).size();
        // dp with size of row and max col size 
        int[][] dp = new int[row][col];
        // default value of first row 
        dp[0][0] = triangle.get(0).get(0);
        // default value of first column 
        for ( int i =1;i<row;i++) {
            dp[i][0] = triangle.get(i).get(0) + dp[i-1][0];
        }
        // fill all value in dp which is remain 
        for (int i = 1; i< row;i++) {
            for (int j =1;j<=i;j++) {
                // if row and col both are equal then we have to take always previous value 
                if (j == i)
                    dp[i][j] = triangle.get(i).get(j) + dp[i-1][j-1];
                // else we have to check previous both value and take min value and put on dp cell 
                else 
                    dp[i][j] = triangle.get(i).get(j) + Math.min(dp[i-1][j], dp[i-1][j-1]);
            }
        }
        // take default value of dp
        int res = dp[row-1][0];
        // check in last row which is min value
        for ( int i =0;i<col;i++) {
            res = Math.min(res, dp[row-1][i]);
        }
        return res;
    }
}
