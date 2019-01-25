package observerPattern;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by JunYa on 2017/12/14.
 */
public class Observer2 implements Observer {

    public void registerSub(Observable observable) {
        observable.addObserver(this);
    }


    public void update(Observable o, Object arg) {
        if (o instanceof SubjectForThreeD) {
            SubjectForThreeD subjectForThreeD = (SubjectForThreeD) o;
            System.out.printf("message is " + subjectForThreeD.getMessage());
        }
        //SubjectForParty
        if (o instanceof SubjectForParty) {
            SubjectForParty subjectForParty = (SubjectForParty) o;
            System.out.printf("message is " + subjectForParty.getMessage());
        }


    }

}
