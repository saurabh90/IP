/**
 * Created by Himanshi on 10-06-2017.
 */
public class sss {
    private static sss ourInstance = new sss();

    public static sss getInstance() {
        return ourInstance;
    }

    private sss() {
    }
}
