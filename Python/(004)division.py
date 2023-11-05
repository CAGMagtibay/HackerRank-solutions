'''
TASK:
  The provided code stub reads two integers, a and b, from STDIN.
  Add logic to print two lines. The first line should contain the result of integer division, a // b. The second line should contain the result of float division, a / b.
  No rounding or formatting is necessary.
INPUT FORMAT:
  The first line contains the first integer, a.
  The second line contains the second integer, b.
'''
from __future__ import division

if __name__ == '__main__':
    a = int(input())
    b = int(input())
    
    print(a // b)
    print(a / b)
