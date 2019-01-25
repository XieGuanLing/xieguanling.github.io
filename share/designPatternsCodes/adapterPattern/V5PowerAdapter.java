package adapterPattern;

/**
 * Created by 59177 on 2017/12/19.
 */
public class V5PowerAdapter implements V5Power {
   private V220Power v220Power;

    public V5PowerAdapter(V220Power v220Power) {
        this.v220Power = v220Power;
    }


    public int provideV5Power() {
        int power = v220Power.provideV220Power();
        System.out.printf("经过调整");
        return 5;

    }
}
