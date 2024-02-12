package Company;

public class Skill {
    private final String skillTitle;

    public String getSkillTitle() {
        return skillTitle;
    }

    public Skill(String skillTitle) {
        this.skillTitle = skillTitle;
    }

    public boolean compareSkill(Skill skill2){
        if (skillTitle.equalsIgnoreCase(skill2.getSkillTitle())) return true;
        return false;
    }

    @Override
    public String toString() {
        return skillTitle;
    }
}
