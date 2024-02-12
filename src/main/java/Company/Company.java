package Company;



import JobAgency.Publisher;

import java.util.ArrayList;
import java.util.Random;

/**
 * Компания, которая нуждается в сотрудниках
 */
public class Company {

    private final Random random = new Random();
    private final Publisher jobAgency;

    private final String name;

    private final int maxSalary;

    public Company(String name, Publisher jobAgency, int maxSalary){
        this.jobAgency = jobAgency;
        this.name = name;
        this.maxSalary = maxSalary;
    }

    /**
     * Рассылка вакансий
     * Размер зарплаты и требуемые скили определяются случайным образом из того, что есть.
     */
    public void needEmployee(){
        int salary = random.nextInt(maxSalary);
        int sk = random.nextInt(4);
        ArrayList<Skill> skills = new ArrayList<>();
        skills.add(new Skill("programming"));
        skills.add(new Skill("butler"));
        skills.add(new Skill("driving"));
        skills.add(new Skill("management"));
        Vacancy vacancy = new Vacancy(this.name,skills.get(sk),salary);
        jobAgency.sendOffer(vacancy);
    }

}