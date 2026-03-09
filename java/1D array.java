import java.util.*;

public class Solution {

    public static boolean canWin(int leap, int[] game) {
        return canWinFrom(0, leap, game);
    }

    private static boolean canWinFrom(int position, int leap, int[] game) {
        
        // Win condition
        if (position >= game.length) {
            return true;
        }
        
        // Invalid move conditions
        if (position < 0 || game[position] == 1) {
            return false;
        }
        
        // Mark as visited
        game[position] = 1;
        
        // Try all possible moves
        return canWinFrom(position + leap, leap, game)
            || canWinFrom(position + 1, leap, game)
            || canWinFrom(position - 1, leap, game);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();
            
            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println(canWin(leap, game) ? "YES" : "NO");
        }
        
        scan.close();
    }
}
