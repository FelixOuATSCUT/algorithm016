// class Solution {
//     public boolean isAnagram(String s, String t) {
//         char[] s1 = s.toCharArray();
//         char[] s2 = t.toCharArray();
//         Arrays.sort(s1);
//         Arrays.sort(s2);

//         return Arrays.equals(s1, s2);
//     }
// }

class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }

        int[] counts = new int[26];

        for(int i = 0; i< s.length(); i++) {
            counts[s.charAt(i) -'a']++;
            counts[t.charAt(i)- 'a']--;
        }

        for(int i = 0;i < counts.length; i++) {
            if(counts[i] != 0) {
                return false;
            }
        }
        return true;
    }
}