package patterns.observer;

public interface ObservableSubject {
   void addObserver(Observer observer);
   void removeObserver(Observer observer);
   void notifyObservers();
}
