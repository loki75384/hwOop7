package JobSeekers;

import Company.*;

import java.util.ArrayList;

public class Worker extends Employee implements Observer{

    private int minSalary;
    private final ArrayList<Skill> skills;

    public Worker(String name) {
        super(name);
        this.minSalary = 10000;
        this.skills = new ArrayList<>();
        skills.add(new Skill("butler"));
        skills.add(new Skill("driving"));
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public boolean receiveOffer(Vacancy vacancy){
        if (this.minSalary <= vacancy.getSalary()){
            Skill sk = vacancy.getSkill();
            for (Skill elem: this.skills){
                if (elem.compareSkill(sk)){
                    System.out.printf("Рабочий %s, %s: Мне нужна эта работа! \n",
                            getName(), vacancy );
                    this.minSalary = vacancy.getSalary();
                    return true;
                }
                System.out.printf("Рабочий %s, %s: Не моя специальность! \n",
                        getName(), vacancy);
            }
        } else {
            System.out.printf("Рабочий %s, %s: Я найду работу получше! \n",
                    getName(), vacancy);
        }
        return false;
    }
}


