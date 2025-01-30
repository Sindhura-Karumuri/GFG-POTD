N-Queen Problem
Difficulty: HardAccuracy: 35.43%Submissions: 99K+Points: 8
The n-queens puzzle is the problem of placing n queens on a (n × n) chessboard such that no two queens can attack each other. Note that two queens attack each other if they are placed on the same row, the same column, or the same diagonal.

Given an integer n, find all distinct solutions to the n-queens puzzle.
You can return your answer in any order but each solution should represent a distinct board configuration of the queen placements, where the solutions are represented as permutations of [1, 2, 3, ..., n]. In this representation, the number in the ith position denotes the row in which the queen is placed in the ith column.

class Solution {
    ArrayList<ArrayList<Integer>>list;
    int[][] board;
    public ArrayList<ArrayList<Integer>> nQueen(int n) {
        // code here
        list=new ArrayList<>();
        board=new int[n][n];
        solveNQueen(0,n);
        return list;
        
    }
    private boolean isSafe(int row,int col,int N){
        for(int i=0;i<col;i++){
            if(board[row][i]==1){
                return false;
            }
        }
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 1) {
                return false;
            }
        }

        for (int i = row, j = col; i < N && j >= 0; i++, j--) {
            if (board[i][j] == 1) {
                return false;
            }
        }
        return true;
    }
    private void solveNQueen(int col,int N){
        if(col>=N){
            printSolution(N);
            return;
        }
        for(int i=0;i<N;i++){
            if(isSafe(i,col,N)){
                board[i][col]=1;
                solveNQueen(col+1,N);
                board[i][col]=0;
            }
        }
    }
    private void printSolution(int N) {
        ArrayList<Integer>ll=new ArrayList<>();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if(board[i][j]==1){
                    ll.add(j+1);
                }
            }
        }
        list.add(ll);
    }
}  
