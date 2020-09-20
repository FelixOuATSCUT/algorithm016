class Solution {
    int[] uglyNum = new int[]{2,3,5};

    public int nthUglyNumber(int n) {
         PriorityQueue<Long> heap = new PriorityQueue<Long>();

        heap.add(1L);
       int counts = 0;
        while(!heap.isEmpty()) {
           long heaptop = heap.poll();
     
           if(++counts >= n) {
               return (int) heaptop;
           }

            for(int num: uglyNum) {
                if(!heap.contains(num * heaptop)) {
                    heap.add(num * heaptop);
                }
            }

        }
        return -1;
    }
}