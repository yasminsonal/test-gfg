# User function Template for python3

class Solution:
    #Function to find equilibrium point in the array.
    def equilibriumPoint(self,arr):
        # code here
        total_sum=0
        left_sum=0
        if len(arr)==1:
            return 1
        else:
            for i in range(len(arr)):
                total_sum+=arr[i]
            for i in range(len(arr)):
                right_sum=total_sum-left_sum-arr[i]
                if left_sum == right_sum:
                    return i+1
                left_sum+=arr[i]
            return -1
                



#{ 
 # Driver Code Starts
#Initial Template for Python 3
import math


def main():
    T = int(input())
    while (T > 0):

        arr = [int(x) for x in input().strip().split()]

        ob = Solution()

        print(ob.equilibriumPoint(arr))
        print("~")
        T -= 1


if __name__ == "__main__":
    main()

# } Driver Code Ends