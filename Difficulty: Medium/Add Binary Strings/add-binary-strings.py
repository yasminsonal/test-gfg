#User function Template for python3
class Solution:
	def addBinary(self, s1, s2):
		# code here
		def adder(res, _sum):
	        carry = 0
            if _sum == 0:   # Half Sum + Carry = 0
                res.append('0')
            elif _sum == 1: # Half Sum + Carry = 1
                res.append('1')
            elif _sum == 2: # Half Sum + Carry = 2
                res.append('0')
                carry = 1
            else:           # Half Sum + Carry = 3
                res.append('1')
                carry = 1
            return carry
            
	    # Base case
	    if s1 == '0' and s2 == '0':
	        return '0'
        # Remove Leading Zeros
        s1 = s1.lstrip('0')
        s2 = s2.lstrip('0')
        carry = 0
        n = len(s1)
        m = len(s2)
        res = []
        i = 1
        j = 1
        while i <= n and j <= m:
            _sum = int(s1[-i]) + int(s2[-j]) + carry
            carry = adder(res, _sum)
            i += 1
            j += 1
        # Add the remaining digits
        while i <= n:
            _sum = int(s1[-i]) + carry
            carry = adder(res, _sum)
            i += 1
        while j <= m:
            _sum = int(s2[-j]) + carry
            carry = adder(res, _sum)
            j += 1
        if carry == 1:
            res.append('1')
        # Reverse the string and convert to string, then return
        return "".join(res[::-1])
		


#{ 
 # Driver Code Starts
#Initial Template for Python 3

if __name__ == '__main__':
    T = int(input())
    for i in range(T):
        a = input().strip()
        b = input().strip()
        ob = Solution()
        answer = ob.addBinary(a, b)

        print(answer)
        print("~")

# } Driver Code Ends