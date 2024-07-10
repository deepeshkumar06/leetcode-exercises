public class Solution {
    public int minOperations(String[] logs) {
        int depth = 0;
        for (String log : logs) {
            if (log.equals("../")) {
                if (depth > 0) {
                    depth--;
                }
            } else if (!log.equals("./")) {
                depth++;
            }
        }
        return depth;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] logs1 = {"d1/", "d2/", "../", "d21/", "./"};
        String[] logs2 = {"d1/", "d2/", "../", "../", "../"};
        
        System.out.println(solution.minOperations(logs1)); // Output: 2
        System.out.println(solution.minOperations(logs2)); // Output: 0
    }
}
