package JobAgency;


import Company.Vacancy;
import JobSeekers.Observer;

/**
 * Активности агентства:
 * регистрация соискателей
 * удаление соискателей
 * публикация офера
 */

public interface Publisher {

    void registerObserver(Observer observer);
    void removeObserver(Observer observer);

    void sendOffer(Vacancy vacancy);

}