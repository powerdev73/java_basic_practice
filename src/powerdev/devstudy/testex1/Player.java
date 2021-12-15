package powerdev.devstudy.testex1;

public class Player {
    private PlayerLevel level;

    public void upgradeLevel(PlayerLevel playerlevel){
        this.level = playerlevel;
    }

    public void play(){
        if(level instanceof BeginnerLevel){
            level.go(1);
        } else if (level instanceof AdvancedLevel){
            level.go(2);
        } else if(level instanceof SuperLevel){
            level.go(3);
        } else {
            System.out.println("ERROR");
        }
    }

    public PlayerLevel getLevel() {
        return level;
    }

    public void setLevel(PlayerLevel level) {
        this.level = level;
    }
}
