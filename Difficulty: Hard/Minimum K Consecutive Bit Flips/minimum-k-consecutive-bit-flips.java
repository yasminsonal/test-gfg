class Solution {
    public int kBitFlips(int[] arr, int k) {
        // code here
        int result = 0;
        int n = arr.length, i = 0, startIndex = 0;
        // Approach 1 start - fail due to time constraint for large input
        /*i = k-1;
        while (i<n) {
        	if (arr[startIndex] == 0) {
    			for (int j=startIndex; j<=i; j++) {
    				if (arr[j] == 0) {
    					arr[j] = 1;
    				} else {
    					arr[j] = 0;
    				}
    			}
    			result++;
    			i++;
    			startIndex++;
        	} else {
        		i++;
    			startIndex++;
        	}
        }
        for (int j=(n-k); j<n; j++) {
        	if (arr[j] == 0) {
        		result = -1;
        		break;
        	}
        }*/
        // Approach 1 end
        // Approach 2 start
        Queue<Integer> q = new LinkedList<Integer>();
        for (i=0; i<n; i++) {
        	while (!q.isEmpty() && q.peek() < (i-k+1)) {
        		q.remove();
        	}
        	if (arr[i] == 0 && q.size()%2 == 0) {
        		if (i>(n-k)) {
        			result = -1;
        			break;
        		}
        		result++;
        		q.add(i);
        	} else if (arr[i] == 1 && q.size()%2 == 1) {
        		if (i>(n-k)) {
        			result = -1;
        			break;
        		}
        		result++;
        		q.add(i);
        	}
        }
        // Approach 2 end
        return result;
    }
}
