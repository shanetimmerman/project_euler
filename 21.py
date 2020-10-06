import math
def get_proper_divisors(num):
    s = 0
    for i in range(1, math.trunc(num / 2) + 1):
        if (num % i == 0):
            s += i
    return s

def get_amicable_numbers(num):
    store = {}
    s = 0
    for i in range(1, num):
        pd = get_proper_divisors(i)
        store[i] = pd 
        print(i, pd, store.get(pd, 0))
        if (store.get(pd, 0) == i and i != pd):
            s += pd + i
    print(s)

get_amicable_numbers(10000)

