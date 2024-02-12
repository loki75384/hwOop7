package JobSeekers;


import Company.Skill;
import Company.Vacancy;

import java.util.ArrayList;

public class Master extends Employee implements Observer {

    private int minSalary;
    private final ArrayList<Skill> skills;

    public Master (String name) {
        super(name);
        this.minSalary = 80000;
        this.skills = new ArrayList<>();
        skills.add(new Skill("programming"));
        skills.add(new Skill("management"));
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
                    System.out.printf("Мастер %s, %s: Мне нужна эта работа! \n",
                            getName(), vacancy );
                    this.minSalary = vacancy.getSalary();
                    return true;
                }
                System.out.printf("Мастер %s, %s: Не моя специальность! \n",
                        getName(), vacancy);
            }
        } else {
            System.out.printf("Мастер %s, %s: Я найду работу получше! \n",
                    getName(), vacancy);
        }
        return false;
    }
}
