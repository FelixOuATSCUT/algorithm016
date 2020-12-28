class Solution {
    public boolean validPalindrome(String s) {
        int length = s.length();
        int low = 0;
        int high = length - 1;

        while(low < high) {
            char c1 = s.charAt(low);
            char c2 = s.charAt(high);

            if(c1 == c2 ) {
                low++;
                high--;
            } else {
                boolean flag1 = true;
                boolean flag2 = true;

                for(int i = low, j = high -1 ; i <j; i++,j--){
                    char c3 = s.charAt(i), c4 = s.charAt(j);
                    if(c3 != c4) {
                        flag1 = false;
                        break;
                    }
                }

                for(int i = low + 1, j = high; i < j ; i++, j--) {
                    char c3 = s.charAt(i), c4 = s.charAt(j);
                    if(c3 != c4) {
                        flag2 = false;
                        break;
                    }
                }
                return flag1 || flag2;
            }
        }
    return true;
    }
}