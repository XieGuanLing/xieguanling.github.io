package StatePattern;

import StatePattern.state.*;

/**
 * Created by 59177 on 2017/12/20.
 */
public class VendingMachine {

    private State noMoneyState;
    private State hasMoneyState;
    private State soldState;
    private State soldOutState;
    private State winnerState ;

    private int count = 0;
    private State currentState = noMoneyState;

    public VendingMachine(int count)
    {
        noMoneyState = new NoMoneyState(this);
        hasMoneyState = new HasMoneyState(this);
        soldState = new SoldState(this);
        soldOutState = new SoldOutState(this);
        winnerState = new WinnerState(this);

        if (count > 0)
        {
            this.count = count;
            currentState = noMoneyState;
        }
    }

    public void insertMoney()
    {
        currentState.insertMoney();
    }

    public void backMoney()
    {
        currentState.backMoney();
    }

    public void turnCrank()
    {
        currentState.turnCrank();
        if (currentState == soldState || currentState == winnerState)
            currentState.dispense();
    }

    public void dispense()
    {
        System.out.println("发出一件商品...");
        if (count != 0)
        {
            count -= 1;
        }
    }

    public void setState(State state)
    {
        this.currentState = state;
    }


    public State getNoMoneyState() {
        return noMoneyState;
    }

    public void setNoMoneyState(State noMoneyState) {
        this.noMoneyState = noMoneyState;
    }

    public State getHasMoneyState() {
        return hasMoneyState;
    }

    public void setHasMoneyState(State hasMoneyState) {
        this.hasMoneyState = hasMoneyState;
    }

    public State getSoldState() {
        return soldState;
    }

    public void setSoldState(State soldState) {
        this.soldState = soldState;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public void setSoldOutState(State soldOutState) {
        this.soldOutState = soldOutState;
    }

    public State getWinnerState() {
        return winnerState;
    }

    public void setWinnerState(State winnerState) {
        this.winnerState = winnerState;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public State getCurrentState() {
        return currentState;
    }

    public void setCurrentState(State currentState) {
        this.currentState = currentState;
    }
}

//
//可以看到，我们现在把每个状态对应于动作的行为局部化到了状态自己的类中实现，
//        不仅增加了扩展性而且使代码的阅读性大幅度的提高。以后再添加状态，
//        只需要针对新添加的状态的实现类，并在自动售货机中添加此状态即可