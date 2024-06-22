class Solution {
    public int romanToInt(String s) {
        Map <Character , Integer> roman = new HashMap<>();
        roman.put('I' , 1);
        roman.put('V' , 5);
        roman.put('X' , 10);
        roman.put('L' , 50);
        roman.put('C' , 100);
        roman.put('D' , 500);
        roman.put('M' , 1000);
        
        int cur = 0;
        int prev = 0;
        int tot = 0;
        
        for(int i=s.length()-1 ; i>=0 ; i--){
            cur = roman.get(s.charAt(i));
            if(prev > cur)
                tot -= cur;
            else
                tot += cur;
            prev = cur;
        }
        return tot;
    }
}