class Solution {
    private boolean isvalid(int i,int j,char[][] c,char cur){
        for(int a=0;a<9;a++){
            if(c[a][j]==cur || c[i][a]==cur) return false;
            int subrow=3*(i/3)+a/3;
            int subcol=3*(j/3)+a%3;
            if(c[subrow][subcol]==cur) return false;
        }
        return true;
        

    }
    private boolean sudokuhelper(char[][] c,int i,int j){
        
        for(int a=0;a<9;a++){
            for(int b=0;b<9;b++){
                if(c[a][b]=='.'){
                    for(char k='1';k<='9';k++){
                        if(isvalid(a,b,c,k)){
                            c[a][b]=k;
                            if(sudokuhelper(c,a,b)) return true;
                            c[a][b]='.';
                            
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }
    public void solveSudoku(char[][] board) {
        sudokuhelper(board,0,0);        
    }
}
