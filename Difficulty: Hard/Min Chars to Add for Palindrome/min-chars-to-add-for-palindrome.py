class Solution:
    def minChar(self, s):
        #Write your code here
        s_rev=s[::-1]
        temp=s+'#'+s_rev
        lps=[0]*len(temp)
        j=0
        for i in range(1,len(temp)):
            while j>0 and temp[i] !=temp[j]:
                j=lps[j-1]
            if temp[i]==temp[j]:
                j+=1
            lps[i]=j
        return len(s)-lps[-1]
            


#{ 
 # Driver Code Starts
#Initial Template for Python 3

if __name__ == "__main__":
    for _ in range(int(input())):
        s = input()
        obj = Solution()
        ans = obj.minChar(s)
        print(ans)
        print("~")

# } Driver Code Ends