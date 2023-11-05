'''
TASK:
  FUNCTION DESCRIPTION:
    Complete the print_full_name function in the editor below.
    print_full_name has the following parameters:
      string first: the first name
      string last: the last name
  PRINTS:
    string: 'Hello firstname lastname ! You just delved into python' where firstname and lastname are replaced with first and last.
INPUT FORMAT:
  The first line contains the first name, and the second line contains the last name.
CONSTRAINTS:
  The length of the first and last names are each ≤ 10.
'''
#
# Complete the 'print_full_name' function below.
#
# The function is expected to return a STRING.
# The function accepts following parameters:
#  1. STRING first
#  2. STRING last
#

def print_full_name(first, last):
    # Write your code here
    print("Hello {first} {last}! You just delved into python.".format(first = first, last = last))
