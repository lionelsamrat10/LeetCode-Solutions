'''
Determine if a 9 x 9 Sudoku board is valid. Only the filled cells need to be validated according to the following rules:

Each row must contain the digits 1-9 without repetition.
Each column must contain the digits 1-9 without repetition.
Each of the nine 3 x 3 sub-boxes of the grid must contain the digits 1-9 without repetition.
Note:

A Sudoku board (partially filled) could be valid but is not necessarily solvable.
Only the filled cells need to be validated according to the mentioned rules.
'''

class Solution:
    def isValidSudoku(self, board: List[List[str]]) -> bool:
        
        def validateSquare(i,j):
            s = set()
            for x in range(i,i+3):
                for y in range(j,j+3):
                    if board[x][y] != '.':
                        if board[x][y] in s: return False
                        s.add(board[x][y])
            return True
    
        rows = [{'set',},{'set',},{'set',},{'set',},{'set',},{'set',},{'set',},{'set',},{'set',}]
        cols = [{'set',},{'set',},{'set',},{'set',},{'set',},{'set',},{'set',},{'set',},{'set',}]
        for i in range(9):
            for j in range(9):
                if board[i][j] != '.':
                    if board[i][j] in rows[i] or board[i][j] in cols[j]: return False
                    rows[i].add(board[i][j]) , cols[j].add(board[i][j])
                    
        for i in range(0,9,3):
            for j in range(0,9,3):
                if not validateSquare(i,j):return False
        return True
                

                        
            
