class Solution {
    public int romanToInt(String s) {

        HashMap<Character, Integer> values = new HashMap<Character, Integer>();

        values.put('I', 1);
        values.put('V', 5);
        values.put('X', 10);
        values.put('L', 50);
        values.put('C', 100);
        values.put('D', 500);
        values.put('M', 1000);
        
        char[] symbols = s.toCharArray();
        int sum = 0;

        for (int i = 0; i < s.length() - 1; i++) {

            int current = values.get(symbols[i]);
            int n = i+1;
            int next = values.get(symbols[n]);

            if (current < next) {
                sum -= current;
            }
            else {
                sum += current;
            }
        }
        sum += values.get(symbols[symbols.length - 1]);
        return sum;
    } 
}
