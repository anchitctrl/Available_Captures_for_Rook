class Solution {
    public int numRookCaptures(char[][] board) {
        int row=0;
        int column=0;
        for(int i=0;i<8;i++){
            for(int j=0;j<8;j++){
                if(board[i][j]=='R'){
                    row=i;
                    column=j;
                    break;
                }
            }
        }
        //row wise
        int count=0;
        for(int i=0;i<column;i++){
            if(board[row][i]=='p'){
                count++;
            }
            else if(board[row][i]=='B'){
                count=0;
            }
            else{
                continue;
            }
        }
        if(count>1){
            count=1;
        }
        for(int i=column+1;i<8;i++){
            if(board[row][i]=='B'){
                break;
            }
            else if(board[row][i]=='p'){
                count++;
                break;
            }
        }
        
        //column wise
        int count1=0;
        for(int i=0;i<row;i++){
            if(board[i][column]=='p'){
                count1++;
            }
            else if(board[i][column]=='B'){
                count1=0;
            }
            else{
                continue;
            }
        }
        if(count1>1){
            count1=1;
        }
        for(int i=row+1;i<8;i++){
            if(board[i][column]=='B'){
                break;
            }
            else if(board[i][column]=='p'){
                count1++;
                break;
            }
        }
        int result=count+count1;
        return result;
    }
}
