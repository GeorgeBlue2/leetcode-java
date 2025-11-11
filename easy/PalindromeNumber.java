class Solution {
    public boolean isPalindrome(int x) {
        
        boolean p = false;

        if (x >= 0) {
            int temp = x;
            int count = 0;

            if (temp == 0) {
                return true;
            }

            while (temp != 0) {
                temp /= 10;
                count++;
            }
            
            int[] number = new int[count];

            temp = x;
            int index = 0;
            while (temp != 0) {
                number[index] = temp % 10;
                temp /= 10;
                index++;
            }
            p = true;
            for(int i = 0; i < count / 2; i++) {
                int last = count - 1 - i;
                if (number[i] != number[last]) {
                    p = false;
                    break;
                }
            }
            
        }
        return p;

    }
}
