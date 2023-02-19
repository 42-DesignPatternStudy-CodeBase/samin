package samin.statePattern.version02;

public class Player {
    PlayerLevel beginLevel = new BeginnerLevel(this);
    PlayerLevel advencedLevel = new AdvencedLevel(this);
    PlayerLevel superLevel = new SuperLevel(this);
    PlayerLevel curLevel;

    int exp;
    
    public Player() {
        curLevel = beginLevel;
        exp = 0;
    }

    public PlayerLevel getLevel()
    {
        return (curLevel);
    }

    public void upgradeLevel() {
        if (exp >= 3){
            System.out.println("advencedLevel로 레벨업 하였습니다");
            curLevel = beginLevel;
        }
        else if (exp >= 6){
            System.out.println("superLevel로 레벨업 하였습니다");
            curLevel = beginLevel;
            exp = 0;
        }
        else if (exp >= 9){
            System.out.println("beginnerLevel부터 다시 시작 합니다");
            curLevel = beginLevel;
            exp = 0;
        }
    }

    public void jump()
    {
        curLevel.jump();
        upgradeLevel();
    }

    public void turn()
    {
        curLevel.turn();
    }
    
    public void run()
    {
        curLevel.run();
    }
    
    public void showLevel()
    {
        curLevel.showLevelMessage();
    }

    public void play() {
        jump();
        turn();
        run();
    }
}