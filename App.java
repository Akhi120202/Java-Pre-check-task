import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        // Create an array of participants
        List<Participant> participants = new ArrayList<>();

        List<Award> awards = new ArrayList<>();
        awards.add(new Award("Gold Medal", "National"));
        awards.add(new Award("silver Medal", "International"));
        participants.add(new Participant("Johny", "Depp", 25, "Swimming", awards));

        awards = new ArrayList<>();
        awards.add(new Award("Bronze Medal", "National"));
        participants.add(new Participant("Janey", "Peterson", 30, "Swimming", awards));
        
        awards = new ArrayList<>();
        awards.add(new Award("Silver Medal", "International"));
        participants.add(new Participant("Bob", "Johnson", 22, "Basketball", awards));
        
        awards = new ArrayList<>();
        awards.add(new Award("Gold Medal", "National"));
        participants.add(new Participant("Alice", "Williams", 28, "Soccer", awards));
        
        awards = new ArrayList<>();
        awards.add(new Award("Bronze Medal", "National"));
        participants.add(new Participant("Charlie", "Brown", 32, "Soccer", awards));
    
        // Select participants based on criteria
        List<Participant> selectedParticipants = new ArrayList<>();
        for (Participant participant : participants) {
            if ("Swimming".equals(participant.getSport()) && participant.internationalAwards().size() >= 1) {
                selectedParticipants.add(participant);
            }

            else if ("Basketball".equals(participant.getSport()) && participant.getAwards().size() >= 1) {
                selectedParticipants.add(participant);
            }

           else if ("Soccer".equals(participant.getSport())) {
                selectedParticipants.add(participant);
            } 

            if ("Swimming".equals(participant.getSport()) && participant.internationalAwards().size() >= 1) {
                selectedParticipants.add(participant);
            }
        }

        // Print selected participants
        System.out.println("Selected Participants:");
        for (Participant participant : selectedParticipants) {
        
            System.out.println(participant);
        }
  }
}



