package templatePattern;

/**
 * Created by 59177 on 2017/12/19.
 */
public class TestTemplate {

    public static void main(String[] args) {

        Work iTWork = new ITWork("百万");
        iTWork.workOneDay();

        Work wYWork = new WYWork("文员");
        wYWork.workOneDay();


    }
}
