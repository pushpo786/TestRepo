package mentoringPractice;

public class StaticNonStaticDemoForMeeting {
    static String purpose="official meeting";
     int member=5;
    public static void main(String[] args) {
        StaticNonStaticDemoForMeeting meet=new StaticNonStaticDemoForMeeting();
        meet.meetingInPerson();
        meet.zoomMeeting();
        System.out.println(purpose);
        System.out.println(meet.member);

    }
    public static void meetingInPerson(){
        System.out.println("pushpo make me static method");
    }

    public void zoomMeeting(){
        System.out.println("pushpo make me nonstatic method");
    }

}
