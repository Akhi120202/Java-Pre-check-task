# Java-pre-check-task
# Matriculation number: 7213389
# Enviroment: Visual Studio code

## Participant class
1. Initiliaze the attributes for a participant.
 private String name;
    private String surname;
    private int age;
    private String sport;
    private List<Award> awards;
2. Then, addressed a constructor where, it is used to create and initialize a Participant object with the specified values for its attributes.
public Participant(String name, String surname, int age, String sport, List<Award> awards) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.sport = sport;
        this.awards = awards;
3. Set methods: Set method  is used to set or update the value of an object’s attribute to a new value provided as an argument.
4. Get methods: this is used to access the values of the attributes of a Participant object. It will allow to retrieve information about a participant after the object has been created.
5. As i have taken two type of awards, so here it will check which kind of award participant gets and in the output award will match accordingly.
public List<Award> nationalAwards(){
        List<Award> awards = new ArrayList<Award>(null);
        for(Award award : this.awards){
            if(award.type.equals(“National”)){
                awards.add(award);
            }
        }
        return awards;
    }
    public List<Award> internationalAwards(){
        List<Award> awards = new ArrayList<>();
        for(Award award : this.awards){
            if(award.type.equals(“International”)){
                awards.add(award);
            }
        }
        return awards;
    }
6. This output shows the participant’s name, age, sport, and a list of awards.
 public String toString() {
        return name + ” ” + surname + “, Age: ” + age + “, Sport: ” + sport + “, Awards: ” + awards.toString();
    }
}
## Award class
1. The Award class has two public attributes: award and type. These attributes store the name of the award and its type.
2. The class has a constructor that takes two parameters (award and type) to initialize the attributes when creating an Award object.
3. The toString() method generates a string representation of an Award object. It combines the award name and its type into a formatted string, making it easy to display the award details in a human-readable format.
   
## Main class
1. Here, i took an arraylist of the participants.
2. Then made some combinations of sport type, nationals and international awards for the participants to get the output.
3. Then, print the participants with the attributes.









