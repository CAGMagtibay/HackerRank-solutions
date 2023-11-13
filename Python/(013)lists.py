'''
TASK:
  Consider a list (list = []). You can perform the following commands:
    insert i e: Insert integer e at position i.
    print: Print the list.
    remove e: Delete the first occurrence of integer e.
    append e: Insert integer e at the end of the list.
    sort: Sort the list.
    pop: Pop the last element from the list.
    reverse: Reverse the list.
  Initialize your list and read in the value of n followed by n lines of commands where each command will be of the 7 types listed above. 
  Iterate through each command in order and perform the corresponding operation on your list.
INPUT FORMAT:
  The first line contains an integer, n, denoting the number of commands.
  Each line i of the n subsequent lines contains one of the commands described above.
CONSTRAINTS:
  The elements added to the list must be integers.
OUTPUT FORMAT:
  For each command of type print, print the list on a new line.
'''
if __name__ == '__main__':
    N = int(input())
    commList = list()
    
    for i in range(N):
        command = input().strip()
        command, *vals = command.split()
        
        match command:
            case "insert":
                commList.insert(int(vals[0]), int(vals[1]))
            case "print":
                print(commList)
            case "remove":
                commList.remove(int(vals[0]))
            case "append":
                commList.append(int(vals[0]))
            case "sort":
                commList.sort()
            case "pop":
                commList.pop(-1)
            case "reverse":
                commList = commList[::-1]
