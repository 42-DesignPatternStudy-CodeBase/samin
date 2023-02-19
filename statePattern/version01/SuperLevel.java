package samin.statePattern.version01;


public class SuperLevel implements PlayerLevel{
    Player player;

    SuperLevel(Player player)
    {
        this.player = player;
    }
    
    @Override
    public void jump() {
        System.out.println("아주 높이 jump 합니다.");
        player.exp += 1;
        levelUp();
    }

    @Override
    public void run() {
        System.out.println("엄청 빨리 달립니다.");
        player.exp += 1;
        levelUp();
    }

    @Override
    public void turn() {
        System.out.println("한 바퀴 돕니다.");
        player.exp += 1;
        levelUp();
    }

    @Override
    public void showLevelMessage() {
        System.out.println("SuperLevel 입니다.");
    }

    @Override
    public void levelUp() {
        if (player.exp >= 9){
            System.out.println("beginnerLevel부터 다시 시작 합니다");
            player.upgradeLevel(player.beginLevel);
            player.exp = 0;
        }
    }
}
