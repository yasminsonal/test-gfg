
class Solution:
    def countTriplets(self, arr, target):
        # code here
        def count(k, target):
            nonlocal arr
            cnt = 0
            i, j = k, len(arr)-1
            while i < j:
                t = arr[i] + arr[j]
                if t == target:
                    sc, ec = 0, 0
                    s, e = arr[i], arr[j]
                    if s == e:
                        cnt += (j-i+1)*(j-i)//2
                        break
                    while i < len(arr) and arr[i] == s:
                        sc += 1
                        i += 1
                    while j >= 0 and arr[j] == e:
                        ec += 1
                        j -= 1
                    cnt += sc*ec
                elif t < target:
                    i += 1
                else:
                    j -= 1
            return cnt
            
        cnt = 0
        for i, e in enumerate(arr):
            cnt += count(i+1, target-e)
        return cnt


#{ 
 # Driver Code Starts
if __name__ == "__main__":
    t = int(input())
    for _ in range(t):
        arr = list(map(int, input().split()))
        target = int(input())
        ob = Solution()
        ans = ob.countTriplets(arr, target)
        print(ans)
        print("~")
# } Driver Code Ends