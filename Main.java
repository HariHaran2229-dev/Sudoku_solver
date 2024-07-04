public static void main(String[] args) {
    char[][] sudoku_board=new char[9][9];
    Scanner scanner = new Scanner(System.in);
  //Provide the sudoku-board need to be solved.
    for(int i=0;i<9;i++){
        for(int j=0;j<9;j++){
          //Enter the number or if place needs to be filled please type '.' . 
            sudoku_board[i][j] = scanner.next().charAt(0);      
        }
    }
    scanner.close();
    Solution.solveSudoku(board);
  //Output board.                                                                                                                            
    for (int i = 0; i < 9; i++) {
      for (int j = 0; j < 9; j++)
        System.out.print(board[i][j] + " ");
      System.out.println();
    }
}
