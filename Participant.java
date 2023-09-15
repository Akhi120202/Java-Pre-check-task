import java.util.ArrayList;
import java.util.List;
// import java.util.Map;
// import java.util.ArrayList;

public class Participant {
    private String name;
    private String surname;
    private int age;
    private String sport;
    private List<Award> awards;

    public Participant(String name, String surname, int age, String sport, List<Award> awards) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.sport = sport;
        this.awards = awards;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSport() {
        return sport;
    }

    public void setSport(String sport) {
        this.sport = sport;
    }

    public List<Award> getAwards() {
        return awards;
    }

    public void setAwards(List<Award> awards) {
        this.awards = awards;
    }

    public List<Award> nationalAwards(){
        List<Award> awards = new ArrayList<Award>(null);
        for(Award award : this.awards){
            if(award.type.equals("National")){
                awards.add(award);
            }
        }

        return awards;
    }

    public List<Award> internationalAwards(){
        List<Award> awards = new ArrayList<>();
        for(Award award : this.awards){
            if(award.type.equals("International")){
                awards.add(award);
            }
        }

        return awards;
    }

    @Override
    public String toString() {
        return name + " " + surname + ", Age: " + age + ", Sport: " + sport + ", Awards: " + awards.toString();
    }
}
