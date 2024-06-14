class Solution {
    public int lengthOfLastWord(String s) {
        int sum = 0;
        int n = s.length();
        for(int i=n-1 ; i>=0 ; i--){
            if(s.charAt(i) == ' ' && sum == 0)
                continue;
            else if(s.charAt(i) != ' ')
                sum++;
            else
                break;
        }
        return sum;
    }
}