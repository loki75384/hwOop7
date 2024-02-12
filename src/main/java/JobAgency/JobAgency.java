package JobAgency;


import Company.Vacancy;
import JobSeekers.Observer;

import java.util.ArrayList;
import java.util.Collection;


public class JobAgency implements Publisher {

    private final Collection<Observer> observers = new ArrayList<>();

    @Override
    public String toString() {
        for (Observer observer : observers) {
            return observer.toString();
        }
        return "";
    }

    @Override
    public void registerObserver(JobSeekers.Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(JobSeekers.Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void sendOffer(Vacancy vacancy) {
        ArrayList<Observer> observersOff = new ArrayList<>();
        for (Observer observer : observers){
            if (observer.receiveOffer(vacancy)) observersOff.add(observer);
        }
        /*for (Observer observer: observersOff){
            observers(removeObserver(observer));
        }*/
        System.out.println("Список трудоустроенных: ");
        System.out.println(observersOff);
    }
}