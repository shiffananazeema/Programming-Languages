# 1 - Star/Pyramid Program

# for i in range(1,10):
#     print("* " * i)


# 2 - Random Password Generate
'''
import random
lower="abcdefghijklmnopqrstuvwxyz"pyt
upper="ABCDEFGHIJKLMNOPQRSTUVWXYZ"
number="0123456789"
symbol="!@#$%^&*(){}[];:<>.,/?"

all=lower+upper+number+symbol
length=10
password= "".join(random.sample(all,length))
print("Password: "+password)
'''

#3 - Reverse
'''
a = 'Shiffana Nazeema A'
rev = "".join(reversed(a))
print(rev)

//

a = input("Enter the Sentence: ")
rev = "".join(reversed(a))
print(rev)
'''

#4 - Palindrome
'''
a = 'madam'
rev = "".join(reversed(a))
if (a == rev):
  print("It is a Palindrome")
else:
    print("It is not a Palindrome")

//

a = input("Enter the Word: ")
rev = "".join(reversed(a))
if (a == rev):
  print("{0} is a Palindrome".format(a))
else:
    print("{0} is not a Palindrome".format(a))
'''

# 5 - Swap the Values
'''
a = input('Please enter value for A:')
b = input('Please enter value for B:')
temp = a
a = b
b = temp
print("The Value of A after Swapping: ",a)
print("The Value of B after Swapping: ",b)
'''

# 6 - Display Calender
'''
import calendar
yy = int(input('Enter Year: '))
mm = int(input('Enter Month: '))
print(calendar.month(yy, mm))
'''

#7 - Odd or Even
'''
num = int(input("Enter a number: "))  
if (num % 2) == 0:  
   print("{0} is Even number".format(num))  
else:  
   print("{0} is Odd number".format(num))  
'''

# - Fizz Buzz
'''
import math
import os
import random
import re
import sys
def fizzBuzz(n):
    for i in range(1, n+1):
        if i % 3 == 0 and i % 5 == 0:
            print("FizzBuzz")
        elif i % 3 == 0:
            print("Fizz")
        elif i % 5 == 0:
            print("Buzz")
        else:
            print(i)


if __name__ == '__main__':
    print("Enter the Number")
    n = int(input().strip())

    fizzBuzz(n)
'''

# -
'''

'''

# -
'''

'''
