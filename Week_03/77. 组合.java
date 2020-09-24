class Solution {
     List<List<Integer>> ans = new LinkedList<>();
    List<Integer> an = new LinkedList<>();

    public List<List<Integer>> combine(int n, int k) {
        backtracks(1, n,k);
        return ans;
    }

        public void backtracks(int start, int n, int k) {
            int size = an.size();
            // 结束条件
            if(k - size > n - start + 1) {
                return;
            }

            // 约束条件
            if(size == k) {
                ans.add(new LinkedList(an));
                return;
            }

            // 路径选择
            for(int i = start; i <= n; i++) {
                an.add(i);
                backtracks(i+1, n, k);
                an.remove(an.size() - 1);
            }
    }
}