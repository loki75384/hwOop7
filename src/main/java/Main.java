import JobAgency.Publisher;
import JobSeekers.Master;
import JobSeekers.Student;
import JobSeekers.Worker;
import Company.Company;
import JobAgency.JobAgency;

/**
 *  TODO: Доработать приложение, которое разрабатывалось на семинаре,
 *  поработать с шаблоном проектирования Observer,
 *  добавить новый тип соискателя.
 *  Добавить новую сущность "Вакансия", компания должна рассылать вакансии.
 *  Только после этого вы можете усложнить ваше приложение (при желании), например,
 *  добавить тип вакансии (enum),
 *  учитывать тип вакансии при отправке предложения соискателю.
 */

public class Main {
    public static void main(String[] args) {

        Publisher publisher = new JobAgency();
        Company google = new Company("Google", publisher, 120000);
        Company yandex = new Company("Yandex", publisher, 95000);
        Company geekBrains = new Company("GeekBrains", publisher, 98000);

        Student student1 = new Student("Студент #1");
        Master master1 = new Master("Мастер #1");
        Master master2 = new Master("Мастер #2");
        Worker worker1 = new Worker("Worker#1");

        publisher.registerObserver(student1);
        publisher.registerObserver(master1);
        publisher.registerObserver(master2);
        publisher.registerObserver(worker1);

        google.needEmployee();
        yandex.needEmployee();
        geekBrains.needEmployee();

    }
}