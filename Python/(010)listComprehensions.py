'''
TASK:
  Given three integers x, y, and z, representing the dimensions of a cuboid along with an integer n, 
  print a list of all possible coordinates given by (i, j, k) on a 3D grid where the sum of i + j + k is not equal to n.
INPUT FORMAT:
  Four integers x,y,z and n, each on a separate line.
CONSTRAINTS:
  Print the list in lexicographic increasing order.
'''
if __name__ == '__main__':
    x = int(input())
    y = int(input())
    z = int(input())
    n = int(input())
    
    newlist = [[i, j, k] for i in range(x + 1) for j in range(y + 1) for k in range(z + 1) if i + j + k != n]
    print(newlist)
