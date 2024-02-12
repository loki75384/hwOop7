package Company;

import java.util.Locale;

/**
 * Вакансии
 */

public class Vacancy {

    private String companyName;
    private Skill skill;
    private int salary;

    public Vacancy(String companyName, Skill skill, int salary) {
        this.companyName = companyName;
        this.skill = skill;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return String.format(Locale.getDefault(),
                "Компания: %s, %s, зарплата %s ", companyName, skill, salary);
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Skill getSkill() {
        return skill;
    }

    public void setSkill(Skill skill) {
        this.skill = skill;
    }

    public int getSalary() {
        return salary;
    }


    public void setSalary(int maxSalary) {
        this.salary = maxSalary;
    }
}
