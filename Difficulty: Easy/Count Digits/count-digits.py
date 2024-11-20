#User function Template for python3

class Solution:
    def evenlyDivides(self, n):
        # code here
        c=0
        for digit in str(n):
            a=int(digit)
            if a!=0 and n%a==0:
                c+=1
        return c
                    


#{ 
 # Driver Code Starts
#Initial Template for Python 3

if __name__ == '__main__':
    t = int(input())
    for _ in range(t):
        N = int(input())

        ob = Solution()
        print(ob.evenlyDivides(N))
        print("~")

# } Driver Code Ends