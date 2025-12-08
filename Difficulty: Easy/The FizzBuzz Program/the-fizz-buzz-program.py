#User function Template for python3
def num(a):
    if (a % 3 == 0 and a % 5 ==0):
        print("FizzBuzz")
    elif(a % 3 == 0):
        print("Fizz")
    elif(a % 5 == 0):
        print("Buzz")
    else:
        print(a)
        
        
a = int(input())
num(a)