package patterns.command;

import patterns.command.receivers.Receivers;
import patterns.command.receivers.ReceiversAgent;
import patterns.command.receivers.ReceiversAgentPart2;

class RunMe{
  public static void main(String[] args) {
      Receivers receiversAgent = new ReceiversAgent();
      Receivers receiversAgentPart2 = new ReceiversAgentPart2();
      ServiceRun serviceRun = new ServiceRunImpl(receiversAgentPart2);
      Invoker invoker = new Invoker();
      invoker.runReceiver(serviceRun);
  }
}
