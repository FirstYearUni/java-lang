package Week21;

public class Main {

    public static void main(String[] args) {
        Diary dairy = new Diary();
        Job cooking = new Job("Cooking pasta", false, 10);
        Job callingMom = new Job("Calling mom", false, 3);
        Job meetingElla = new Job("Meeting with ella", false, 8);
        dairy.add(cooking);
        dairy.add(callingMom);
        dairy.add(meetingElla);
        System.out.println(dairy.printDiary());
    }
}
