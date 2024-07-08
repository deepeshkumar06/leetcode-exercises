public class CircularGame {
    public int findTheWinner(int n, int k) {
        int winner = 0; // Initially, let's assume 0-indexed position
        for (int i = 1; i <= n; i++) {
            winner = (winner + k) % i;
        }
        return winner + 1; // Converting to 1-indexed position
    }

    public static void main(String[] args) {
        CircularGame game = new CircularGame();
        int n = 5; // number of friends
        int k = 2; // steps to count
        System.out.println("The winner is: " + game.findTheWinner(n, k));
    }
}
