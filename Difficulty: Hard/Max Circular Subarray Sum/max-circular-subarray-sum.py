#User function Template for python3

#Complete this function
#Function to find maximum circular subarray su
def circularSubarraySum(arr):
    def kadane(arr):
        max_ending_here = max_so_far = arr[0]
        for x in arr[1:]:
            max_ending_here = max(x, max_ending_here + x)
            max_so_far = max(max_so_far, max_ending_here)
        return max_so_far
    max_kadane = kadane(arr)
    total_sum = sum(arr)
    min_kadane = kadane([-x for x in arr])
    max_circular = total_sum + min_kadane  
    if max_circular == 0:
        return max_kadane
    
    return max(max_kadane, max_circular)


#{ 
 # Driver Code Starts
#Initial Template for Python 3

import math
import sys

if __name__ == "__main__":
    T = int(input())
    while (T > 0):

        arr = [int(x) for x in input().strip().split()]

        print(circularSubarraySum(arr))

        T -= 1

# } Driver Code Ends