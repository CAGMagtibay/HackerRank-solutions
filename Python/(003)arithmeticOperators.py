'''
TASK:
  The provided code stub reads two integers from STDIN, a and b. Add code to print three lines where:
    The first line contains the sum of the two numbers.
    The second line contains the difference of the two numbers (first - second).
    The third line contains the product of the two numbers.
INPUT FORMAT:
  The first line contains the first integer, a.
  The second line contains the second integer, b.
CONSTRAINTS:
  1 <= a <= 10^10
  1 <= b <= 10^10
'''
if __name__ == '__main__':
    a = int(input())
    b = int(input())
    
    print(a + b)
    print(a - b)
    print(a * b)
