package DesginPattern.COR;

public enum ServeLevel {
    STAFF(1),LEADER(2), DIRECTOR(3);
    private int level;
    private ServeLevel(int level){
        this.level= level;
    }
    public int getLevel(){
        return level;
    }
}
