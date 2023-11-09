'''
TASK: 
  Given n scores, store them in a list and find the score of the runner-up.
INPUT FORMAT:
  The first line contains n. The second line contains an array A[] of n integers each separated by a space.
CONSTRAINTS:
  2 <= n <= 10
  -100 <= A[i] <= 100
OUTPUT FORMAT:
  Print the runner-up score.
'''
if __name__ == '__main__':
    n = int(input())
    arr = map(int, input().split())
    
    print(sorted(set(arr))[-2])
