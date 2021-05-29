package patterns.command;

import patterns.command.receivers.Receivers;

public class ServiceRunImpl implements ServiceRun {
  private Receivers receiversAgent;

  public ServiceRunImpl(Receivers receiversAgent) {
    this.receiversAgent = receiversAgent;
  }

  @Override
  public void start() {
      this.receiversAgent.runAgent();
  }
}
