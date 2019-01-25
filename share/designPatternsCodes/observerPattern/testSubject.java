package observerPattern;

/**
 * Created by JunYa on 2017/12/14.
 */
public class testSubject {
    public static void main(String[] args) {
        //两个主题
        SubjectForThreeD subjectForThreeD = new SubjectForThreeD();
        SubjectForParty subjectForParty = new SubjectForParty();

        //观察者
        Observer2 observer2 = new Observer2();
        observer2.registerSub(subjectForThreeD);
        observer2.registerSub(subjectForParty);

        //主题发生变化
        subjectForThreeD.setMessage("3D打印暂时升级");
        subjectForParty.setMessage("party地点与时间发生了改变，请留意新的通知已地点");

    }
}
