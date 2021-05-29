package patterns.command;

public class Invoker {
    private ServiceRun serviceRun;
    public void runReceiver(ServiceRun serviceRun){
        serviceRun.start();
    }
}
