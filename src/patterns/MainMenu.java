package patterns;

import java.util.Scanner;

import static patterns.abstract_factory.Client.runAbstractPattern;
import static patterns.builder.Client.runBuilderPattern;
import static patterns.factory.Client.runFactoryPattern;
import static patterns.observer.Client.runObserverPattern;
import static patterns.singleton.Singleton.runSingletonPattern;
import static patterns.strategy.Client.runStrategyPattern;

public class MainMenu {
    public static void main(String[] args) {
       showMenu();
    }

    static void showMenu(){
        int i=0;
        for(Patterns p: Patterns.values()){
            System.out.println(++i+" "+p.toString());
        }
        switch (readInput()){
            case 1: runAbstractPattern(); break;
            case 2: runFactoryPattern(); break;
            case 3: runBuilderPattern(); break;
            case 4: runObserverPattern(); break;
            case 5: runSingletonPattern(); break;
            case 6: runStrategyPattern(); break;
            default: break;
        }
    }
    static int readInput(){
        return new Scanner(System.in).nextInt();
    }


}
