package JobSeekers;

import Company.Vacancy;

public abstract class Employee implements Observer{

    private final String name;

    public Employee(String name ) {
        this.name = name;
    }

    @Override
    public abstract boolean receiveOffer(Vacancy vacancy) ;

    @Override
    public String toString() {
        return "Сотрудник" +
                "'" + name + '\'';
    }

    @Override
    public boolean compareObserver(Employee employee) {
        return false;
    }

    public String getName() {
        return name;
    }
}
