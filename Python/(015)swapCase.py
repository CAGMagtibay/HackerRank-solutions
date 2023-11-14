'''
TASK:
  You are given a string and your task is to swap cases. In other words, convert all lowercase letters to uppercase letters and vice versa.
FUNCTION DESCRIPTION: 
  Complete the swap_case function in the editor below.
  swap_case has the following parameters:
    string s: the string to modify
  RETURNS:
    string: the modified string
INPUT FORMAT:
  A single line containining a string s.
CONSTRAINTS:
  0 <= len(s) <= 1000
'''
def swap_case(s):
    return s.swapcase()

if __name__ == '__main__':
    s = input()
    result = swap_case(s)
    print(result)
