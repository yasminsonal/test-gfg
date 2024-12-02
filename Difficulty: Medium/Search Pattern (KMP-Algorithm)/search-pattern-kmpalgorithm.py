#User function Template for python3

class Solution:
    def search(self, pat, txt):
        # code here
        lp=len(pat)
        lps=[0]*lp
        sta=0
        for sto in range(1,lp):
            if pat[sta]==pat[sto]:
                lps[sto]=lps[sto-1]+1
                sta+=1
                continue
            sta=0
        ret=[]
        lt=len(txt)
        pt=pp=0
        while pt<lt:
            if pat[pp]==txt[pt]:
                pp+=1
                pt+=1
                if pp==lp:
                    ret.append(pt-lp)
                    pp=lps[pp-1]
                continue
            if pp>0:
                pp=lps[pp-1] if pp-1>=0 else 0
                continue
            pt+=1
        return ret
            


#{ 
 # Driver Code Starts
#Initial Template for Python 3

if __name__ == '__main__':
    t = int(input())
    for _ in range(t):
        s = input().strip()
        patt = input().strip()
        ob = Solution()
        ans = ob.search(patt, s)
        if len(ans) == 0:
            print("[]", end="")
        for value in ans:
            print(value, end=' ')
        print()

# } Driver Code Ends