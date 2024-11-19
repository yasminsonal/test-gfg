#User function Template for python3

class Solution:
    def findTwoElement( self,arr): 
        # code here
        n=len(arr)
        s1=n*(n+1)//2
        s2=n*(n+1)*(2*n+1)//6
        s_1=0
        s_2=0
        for i in range(n):
            s_1+=arr[i]
            s_2+=arr[i]**2
        A=s1-s_1
        B=(s2-s_2)//A
        return [(B-A)// 2,(A+B)//2]




#{ 
 # Driver Code Starts
#Initial Template for Python 3

if __name__ == '__main__':

    tc = int(input())
    while tc > 0:
        arr = list(map(int, input().strip().split()))
        ob = Solution()
        ans = ob.findTwoElement(arr)
        print(str(ans[0]) + " " + str(ans[1]))
        tc = tc - 1
        print("~")

# } Driver Code Ends