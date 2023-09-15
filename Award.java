public class Award {
    public String award;
    public String type;

    public Award(String award, String type){
        this.award = award;
        this.type = type;
    }

    public String toString(){
        return "AwardName: "+this.award + " Award Type: " + this.type;
    }
}
