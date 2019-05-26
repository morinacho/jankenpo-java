package jan.ken.po.game;

/**
 *
 * @author nacho
 */
public class Logic {
    private int player1, player2, round, score1, score2;
    
    public Logic(){
        round  = 1; 
        score1 = 0;
        score2 = 0;
    }
    //Getters
    public int getRound(){
        return this.round;
    }
    
    public int getPlayer(int i){
        if(i == 1){return this.player1; }
        else{return this.player2; }
    }
    
    public int getScore(int i){
        if(i == 1){return this.score1; }
        else{ return this.score2; }
    }
    
    //Setters
    public void setScore(int i){
        if(i == 1){this.score1++; }
        else{this.score2++; }
    }
    
    public void setPlayer(int i, int value){
        if(i == 1){this.player1 = value; }
        else{this.player2 = value; }
    }
    
    public void setRound(){
        this.round++;
    }
    
    public void start(int player1, int value1, int player2, int value2){    
        this.setPlayer(player1, value1);
        this.setPlayer(player2, value2);
        switch(this.getPlayer(1)){
            case 1:
                if(this.getPlayer(2) == 3){
                   this.setScore(1);
                }
                else if(this.getPlayer(2) == 2){
                    this.setScore(2);
                }
                break;
            case 2:
                if(this.getPlayer(2) == 1){
                    this.setScore(1);
                }
                else if(this.getPlayer(2) == 3){
                    this.setScore(2);
                }
                break;
            case 3:
                if(this.getPlayer(2) == 2){
                   this.setScore(1);
                }
                else if(this.getPlayer(2) == 1){
                    this.setScore(2);
                }
                break;
        }
        this.setRound();
    }
} 