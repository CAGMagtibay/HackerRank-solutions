  '''
TASK:
  Given an integer, n, perform the following conditional actions:
    If n is odd, print Weird
    If n is even and in the inclusive range of 2 to 5, print Not Weird
    If n is even and in the inclusive range of 6 to 20, print Weird
    If n is even and greater than 20, print Not Weird
INPUT FORMAT:
  A single line containing a positive integer, n.
CONSTRAINTS:
  1 <= n <= 100
OUTPUT FORMAT:
  Print "Weird" if the number is weird. Otherwise, print "Not Weird".
'''
#!/bin/python

import math
import os
import random
import re
import sys



if __name__ == '__main__':
    n = int(raw_input().strip())
    if n % 2 != 0:
        print("Weird")
    elif n > 20:
        print("Not Weird")
    elif n >= 6:
        print("Weird")
    elif n >= 2:
        print("Not Weird")
