#User function Template for python3

class Solution:
    #Function to return the position of the first repeating element.
    def firstRepeated(self,arr):
        
        #arr : given array
        #n : size of the array
        seen={}
        min_index=float('inf')
        for i in range(len(arr)):
            if arr[i] in seen:
                min_index=min(min_index,seen[arr[i]])
            else:
                seen[arr[i]]=i
        if min_index == float('inf'):
            return -1
        return min_index +1


#{ 
 # Driver Code Starts
#Initial Template for Python 3

#contributed by RavinderSinghPB
if __name__ == '__main__':
    t = int(input())
    for _ in range(t):

        arr = [int(x) for x in input().strip().split()]
        ob = Solution()
        print(ob.firstRepeated(arr))
        print("~")

# } Driver Code Ends