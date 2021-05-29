package patterns.command;

import patterns.command.receivers.ReceiversAgent;
import patterns.command.receivers.ReceiversAgentPart2;

public class ClientCode {
    ReceiversAgent receiversAgent = new ReceiversAgent();
    ReceiversAgentPart2 receiversAgentPart2 = new ReceiversAgentPart2();
    ServiceRun serviceRun = new ServiceRunImpl(receiversAgent);
    Invoker invoker = new Invoker(serviceRun);
}

class RunMe{
  public static void main(String[] args) {
      ClientCode clientCode = new ClientCode();
      clientCode.invoker.runReceiver();
  }
}
