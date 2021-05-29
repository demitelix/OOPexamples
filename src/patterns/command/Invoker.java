package patterns.command;

public class Invoker {
    private ServiceRun serviceRun;

    public Invoker(ServiceRun serviceRun) {
        this.serviceRun = serviceRun;
    }

    public void runReceiver(){
        serviceRun.start();
    }
}
