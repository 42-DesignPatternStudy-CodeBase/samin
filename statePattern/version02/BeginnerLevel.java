package samin.statePattern.version02;

public class BeginnerLevel implements PlayerLevel{
    Player player;

    BeginnerLevel(Player player)
    {
        this.player = player;
    }

    @Override
    public void jump() {
        System.out.println("Jump 할 줄 모르지롱.");
    }

    @Override
    public void run() {
        System.out.println("천천히 달립니다.");
        player.exp += 1;
    }

    @Override
    public void turn() {
        System.out.println("Turn 할 줄 모르지롱.");
    }

    @Override
    public void showLevelMessage() {
        System.out.println("BeginnerLevel 입니다.");
    }

    @Override
    public void levelUp() {
        if (player.exp >= 3){
            System.out.println("advencedLevel로 레벨업 하였습니다");
        }
    }
}
