'''
TASK:
  The provided code stub reads an integer, n, from STDIN. For all non-negative integers i < n, print i^2.
INPUT FORMAT:
  The first and only line contains the integer, n.
CONSTRAINTS:
  1 <= n <= 20
OUTPUT FORMAT:
  Print n lines, one corresponding to each i.
'''
if __name__ == '__main__':
    n = int(input())
    
    for num in range(n):
        print(num * num)
