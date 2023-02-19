package samin.statePattern.version01;

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

    public void upgradeLevel(PlayerLevel level) {
        this.curLevel = level;
    }

    public void jump()
    {
        curLevel.jump();
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