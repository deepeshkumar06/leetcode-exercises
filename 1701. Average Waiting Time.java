public class AverageWaitingTime {
    public double averageWaitingTime(int[][] customers) {
        int n = customers.length;
        long totalWaitingTime = 0;
        long currentTime = 0;

        for (int[] customer : customers) {
            int arrivalTime = customer[0];
            int preparationTime = customer[1];
            
            if (currentTime < arrivalTime) {
                currentTime = arrivalTime;
            }
            currentTime += preparationTime;
            totalWaitingTime += (currentTime - arrivalTime);
        }

        return (double) totalWaitingTime / n;
    }

    public static void main(String[] args) {
        AverageWaitingTime avgWaitTime = new AverageWaitingTime();
        int[][] customers = {{1, 2}, {2, 5}, {4, 3}};
        System.out.println("Average waiting time: " + avgWaitTime.averageWaitingTime(customers));
    }
}
