package JobSeekers;


import Company.Vacancy;

public interface Observer {

    boolean receiveOffer(Vacancy vacancy);

    boolean compareObserver(Employee employee);


}
