import math

# def sum_digits(num):
#    s = 0
#    while(num):
#        s += num % 10
#        print(num) 
#        num = math.trunc(num / 10)
#    return s

# print(str(sum_digits(math.factorial(10))))


def init(num):
    arr =  [0] * (num * 3)
    arr[-1] = 1
    return arr

def multiply(arr, num):
    carry = 0
    i = len(arr) - 1
    while i >= 0:
        val = arr[i] * num + carry
        carry = math.trunc(val / 10)
        arr[i] = val % 10
        i -= 1
    return arr

def factorial(num):
    arr = init(num)
    for i in range(1, num + 1):
        multiply(arr, i)
    return arr


print(sum(factorial(100)))

