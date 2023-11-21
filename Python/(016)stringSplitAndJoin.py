'''
TASK:
  Given a string, split the string on a " " delimiter and join using a hyphen.
FUNCTION DESCRIPTION:
  split_and_join has the following parameters:
    string line: a string of space-separated words
  RETURNS:
    string: the resulting string
INPUT FORMAT:
  The one line contains a string consisting of space-separated words.
'''
def split_and_join(line):
    # write your code here
    split = line.split()
    return "-".join(split)

if __name__ == '__main__':
    line = input()
    result = split_and_join(line)
    print(result)
