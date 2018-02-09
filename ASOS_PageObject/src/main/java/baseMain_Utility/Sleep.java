package baseMain_Utility;


public class Sleep {
    public static void sleepTimer(long sleepTime){
        try {
            Thread.sleep(sleepTime);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
