'''
INPUT FORMAT:
  The first line contains an integer, N, the number of students.
  The 2N subsequent lines describe each student over 2 lines.
    - The first line contains a student's name.
    - The second line contains their grade.
CONSTRAINTS:
  2 <= N <= 5
  There will always be one or more students having the second lowest grade.
OUTPUT FORMAT:
  Print the name(s) of any student(s) having the second lowest grade in. 
  If there are multiple students, order their names alphabetically and print each one on a new line.
'''
if __name__ == '__main__':
    students = []
    for _ in range(int(input())):
        name = input()
        score = float(input())
        students.append([name, score])
        #print(students)
        
    secondLowestScore = sorted(set(score[1] for score in students))[1]
    secondLowestNames = sorted([name[0] for name in students if name[1] == secondLowestScore])
    print(*secondLowestNames, sep="\n")
