class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] ans = new int[k];
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i],0) +1 );
        }

        PriorityQueue<int[]> heap = new PriorityQueue<int[]>(new Comparator<int[]>() {
                public int compare(int[] m, int[] n) {
                    return m[1] - n[1];
                }
            });

        for(int key : map.keySet()) {
            if(heap.size() < k) {
                heap.add(new int[] {key, map.get(key)});
            } else {
                if(heap.peek()[1] < map.get(key)) {
                    heap.poll();
                    heap.add(new int[] {key, map.get(key)});
                }
            }
        }

        for(int i = 0; i < k; i++) {
            ans[i] = heap.poll()[0];
        }

        return ans;

    }
}