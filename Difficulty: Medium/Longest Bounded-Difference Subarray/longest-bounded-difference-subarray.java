class Solution {
    public ArrayList<Integer> longestSubarray(int[] arr, int x) {
        // code here
        int n = arr.length;
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>((a, b) -> b[0] - a[0]);
        PriorityQueue<int[]> minHeap = new PriorityQueue<>((a, b) -> a[0] - b[0]);

        int l = 0, bestLen = 0, bestStart = 0;

        for (int r = 0; r < n; r++) {
            maxHeap.offer(new int[]{arr[r], r});
            minHeap.offer(new int[]{arr[r], r});
            while (!maxHeap.isEmpty() && !minHeap.isEmpty() && 
                   maxHeap.peek()[0] - minHeap.peek()[0] > x) {
                l++;
                while (!maxHeap.isEmpty() && maxHeap.peek()[1] < l) maxHeap.poll();
                while (!minHeap.isEmpty() && minHeap.peek()[1] < l) minHeap.poll();
            }
            int len = r - l + 1;
            if (len > bestLen) {
                bestLen = len;
                bestStart = l;
            }
        }
        ArrayList<Integer>result = new ArrayList<>();
        for (int i = 0; i < bestLen; i++) {
            result.add(arr[bestStart + i]);
        }
        return result;
        
    }
}