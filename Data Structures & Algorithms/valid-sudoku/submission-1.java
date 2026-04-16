class Solution {
    public boolean isValidSudoku(char[][] board) {
        boolean res = true;

        Set<Character> set = new HashSet<>();

        //check rows
        for(int i=0; i<board.length; i++){
            set.clear();  
            for(int j=0; j<board[0].length; j++){
                if(board[i][j] != '.'){
                    if(!set.contains(board[i][j])){
                        set.add(board[i][j]);
                    }
                    else{
                        return false;
                    }
                }
            }
        }

        //check columns
        for(int i=0; i<board[0].length; i++){
            set.clear();  
            for(int j=0; j<board.length; j++){
                if(board[j][i] != '.'){
                    if(!set.contains(board[j][i])){
                        set.add(board[j][i]);
                    }
                    else{
                        return false;
                    }
                }
            }
        }


        //inside a block
        // check 3x3 blocks
for(int i = 0; i < 9; i += 3){
    for(int j = 0; j < 9; j += 3){
        set.clear();
        
        for(int r = i; r < i + 3; r++){
            for(int c = j; c < j + 3; c++){
                if(board[r][c] != '.'){
                    if(!set.contains(board[r][c])){
                        set.add(board[r][c]);
                    } else {
                        return false;
                    }
                }
            }
        }
    }
}

return res;


    }
}
