#User function Template for python3

class Solution:
    def getPairs(self, arr):
        # code here
        flag=False
        if arr.count(0)>1:
            flag=True
        arr=list(set(arr))
        if flag:
            arr.append(0)
            
            
        arr.sort()
        i=0
        n=len(arr)
        j=n-1
        pairs=[]
        while i<j:
            sum=arr[i]+arr[j]
            if sum==0:
                pairs.append([arr[i],arr[j]])
                i+=1
                j-=1
            else:
                if sum>0:
                    j-=1
                else:
                    i+=1
        return pairs
#{ 
 # Driver Code Starts
class IntArray:

    def __init__(self) -> None:
        pass

    def Input(self, n):
        arr = [int(i) for i in input().strip().split()]  # array input
        return arr

    def Print(self, arr):
        for i in arr:
            print(i, end=" ")
        print()


class IntMatrix:

    def __init__(self) -> None:
        pass

    def Input(self, n, m):
        matrix = []
        # matrix input
        for _ in range(n):
            matrix.append([int(i) for i in input().strip().split()])
        return matrix

    def Print(self, arr):
        for i in arr:
            for j in i:
                print(j, end=" ")
            print()


if __name__ == "__main__":
    t = int(input())
    for _ in range(t):
        arr = list(map(int, input().strip().split()))

        obj = Solution()
        res = obj.getPairs(arr)
        if len(res) == 0:
            print()
        else:
            IntMatrix().Print(res)
        print("~")
# } Driver Code Ends