class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<String>();
        generate(ans, new StringBuilder(), 0, 0, n);
        return ans;
    }

    public void generate(List<String> ans,StringBuilder s,  int left, int right, int count) {
        if(s.length() == count *2) {
            ans.add(s.toString());
            return;
        }

        if(count > left) {
            s.append('(');
            generate(ans, s, left+1, right,count);
            s.deleteCharAt(s.length() - 1);
        }

        if(right < left) {
            s.append(')');
            generate(ans, s, left, right+1,count);
            s.deleteCharAt(s.length() - 1);
        }
    }
}