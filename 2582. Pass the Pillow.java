public class PassThePillow {
    public static int findPersonHoldingPillow(int n, int time) {
        int position = 1; // Start with the first person
        int direction = 1; // 1 means moving forward, -1 means moving backward
        
        for (int t = 0; t < time; t++) {
            position += direction;
            
            // Change direction if at the beginning or end of the line
            if (position == n) {
                direction = -1;
            } else if (position == 1) {
                direction = 1;
            }
        }
        
        return position;
    }

    public static void main(String[] args) {
        int n = 4;
        int time = 5;
        System.out.println(findPersonHoldingPillow(n, time)); // Output: 2
    }
}
