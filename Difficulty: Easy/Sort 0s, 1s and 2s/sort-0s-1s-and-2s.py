#{ 
 # Driver Code Starts

# } Driver Code Ends
class Solution:
    # Function to sort an array of 0s, 1s, and 2s
    def sort012(self, arr):
        # code here
        d={}
        l=[]
        for i in range(len(arr)):
            if arr[i] not in d.keys():
                d[arr[i]]=1
            else:
                d[arr[i]]+=1
              
        for i in range(d.get(0,0)):
            l.append(0)
        for i in range(d.get(1,0)):
            l.append(1)    
        for i in range(d.get(2,0)):
            l.append(2)
        arr[:]=l[:]
        
        

#{ 
 # Driver Code Starts.
def main():
    t = int(input().strip())  # Read the number of test cases
    ob = Solution()

    while t > 0:
        t -= 1
        arr = list(map(int,
                       input().strip().split())
                   )  # Read the array as space-separated integers
        ob.sort012(arr)  # Sort the array

        print(' '.join(map(str, arr)))  # Print the sorted array
        print("~")
        
if __name__ == "__main__":
    main()

# } Driver Code Ends