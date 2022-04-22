class Solution {
    public List<List<Integer>> queensAttacktheKing(int[][] queens, int[] king) {
        List<List<Integer>> l = new ArrayList<>();
        int flagR = -1, flagL = -1, flagU = -1, flagD = -1, flagRU = -1, flagRD = -1, flagLU = -1, flagLD = -1;
        int minR = 20, minL = 20, minU = 20, minD = 20, minRU = 20, minRD = 20, minLU = 20, minLD = 20;
        for(int i=0;i<queens.length;i++){
            if(queens[i][1] == king[1] && queens[i][0] > king[0] && Math.abs(king[0] - queens[i][0]) < minR){
                minR = Math.abs(king[0] - queens[i][0]);
                flagR = i;
            }else if(queens[i][1] == king[1] && queens[i][0] < king[0] && Math.abs(king[0] - queens[i][0]) < minL){
                minL = Math.abs(king[0] - queens[i][0]);
                flagL = i;
            }else if(queens[i][0] == king[0] && queens[i][1] < king[1] && Math.abs(king[1] - queens[i][1]) < minU){
                minU = Math.abs(king[1] - queens[i][1]);
                flagU = i;
            }else if(queens[i][0] == king[0] && queens[i][1] > king[1] && Math.abs(king[1] - queens[i][1]) < minD){
                minD = Math.abs(king[1] - queens[i][1]);
                flagD = i;
            }else if(queens[i][0]+queens[i][1] == king[0]+king[1]){
                if(queens[i][0] < king[0] &&   Math.abs(king[0] - queens[i][0]) < minRU){
                    minRU =  Math.abs(king[0] - queens[i][0]);
                    flagRU = i;
                }
                if(queens[i][0] > king[0] &&   Math.abs(king[0] - queens[i][0]) < minLD){
                    minLD =  Math.abs(king[0] - queens[i][0]);
                    flagLD = i;
                }
            }else if(Math.abs(queens[i][1] - king[1]) == Math.abs(queens[i][0] - king[0])){
                if(queens[i][0] > king[0] && Math.abs(queens[i][0] - king[0]) < minRD){
                    minRD = Math.abs(queens[i][0] - king[0]);
                    flagRD = i;
                }
                if(queens[i][0] < king[0] && Math.abs(king[0] - queens[i][0]) < minLU){
                    minLU = Math.abs(king[0] - queens[i][0]);
                    flagLU = i;
                }
            }
        }
        
        for(int i=0;i<queens.length;i++){
            if(i == flagR || i == flagL || i == flagU || i == flagD || i == flagRU || i == flagRD || i == flagLU || i == flagLD){
                List<Integer> temp = new ArrayList<>();
                temp.add(queens[i][0]);
                temp.add(queens[i][1]);
                l.add(temp);
            }
        }
        
        return l;
    }
}