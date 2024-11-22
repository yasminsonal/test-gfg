#User function Template for python3

class Solution:
	def pushZerosToEnd(self,arr):
    	# code here
    	n=len(arr)
    	non_zero_index=0
    	for current_index in range(n):
    	    if arr[current_index] !=0:
    	        arr[non_zero_index], arr[current_index] = arr[current_index], arr[non_zero_index]
    	        non_zero_index+=1
    	    
    	    
    	return arr


#{ 
 # Driver Code Starts
#Initial Template for Python 3

if __name__ == '__main__':
    tc = int(input())
    while tc > 0:
        arr = list(map(int, input().strip().split()))
        ob = Solution()
        ob.pushZerosToEnd(arr)
        for x in arr:
            print(x, end=" ")
        print()
        tc -= 1
# } Driver Code Ends