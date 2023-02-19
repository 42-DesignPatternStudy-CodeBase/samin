package samin.statePattern.version02;

public class AdvencedLevel implements PlayerLevel{
    Player player;

    AdvencedLevel(Player player)
    {
        this.player = player;
    }
    
    @Override
    public void jump() {
        System.out.println("높이 jump 합니다.");
        player.exp += 1;
    }

    @Override
    public void run() {
        System.out.println("빨리 달립니다.");
        player.exp += 1;
    }

    @Override
    public void turn() {
        System.out.println("Turn 할 줄 모르지롱.");
    }

    @Override
    public void showLevelMessage() {
        System.out.println("AdvencedLevel 입니다.");
    }

    @Override
    public void levelUp() {
        if (player.exp >= 6){
            System.out.println("superLevel로 레벨업 하였습니다");
        }
    }
}
