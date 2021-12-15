package powerdev.devstudy.testex1;

import java.util.ArrayList;

public class PlayerTest {
    public static void main(String[] args) {

        Player player = new Player();

        PlayerLevel bLevel = new BeginnerLevel();
        PlayerLevel aLevel = new AdvancedLevel();
        PlayerLevel sLevel = new SuperLevel();

        ArrayList<PlayerLevel> levelList = new ArrayList<>();
        levelList.add(bLevel);
        levelList.add(aLevel);
        levelList.add(sLevel);

        for(PlayerLevel level: levelList){
            player.upgradeLevel(level);
            player.play();
            System.out.println("=============================");
        }
    }
}
