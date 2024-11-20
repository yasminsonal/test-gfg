
class Solution:
    def nthFibonacci(self, n: int) -> int:
        # code here
        i1=0
        i2=1
        i3=0
        if n==0:
            return i1
        if n==1:
            return i2
        for i in range(n-1):
            i3=i1+i2
            i1=i2
            i2=i3
        return i3
        



#{ 
 # Driver Code Starts
if __name__ == "__main__":
    t = int(input())
    for _ in range(t):

        n = int(input())

        obj = Solution()
        res = obj.nthFibonacci(n)

        print(res)

        print("~")

# } Driver Code Ends