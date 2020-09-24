class Solution {
    List<List<Integer>> ans = new LinkedList<>();
    List<Integer> an = new LinkedList<>();
    public List<List<Integer>> permuteUnique(int[] nums) {
        boolean[] visited = new boolean[nums.length];
        Arrays.sort(nums);
        backstacks(an, visited, nums);

        return ans;

    }


    public void backstacks(List<Integer> path, boolean[] visited, int[] nums) {
        int length = nums.length;
        if(path.size() == length) {
            ans.add(new LinkedList(path));
            return;
        }

        for(int i =0; i< nums.length; i++) {
            if(visited[i] || ((i>0 && nums[i-1] == nums[i]) && !visited [i-1] )) {
                continue;
            }

            path.add(nums[i]);
            visited[i] = true;

            backstacks(path, visited, nums);

            visited[i] = false;
            path.remove(path.size()-1);
        }
        
    }
}