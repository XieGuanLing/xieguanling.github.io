package templatePattern;

/**
 * Created by 59177 on 2017/12/19.
 */
public class ITWork extends Work {

    public ITWork(String name) {
        super(name);
    }

    public void work() {
        System.out.println("写bug，改bug");
    }

    //程序员需要记录打卡时间
    @Override
    public boolean isNeedPrintDate() {
        return true;
    }
}
