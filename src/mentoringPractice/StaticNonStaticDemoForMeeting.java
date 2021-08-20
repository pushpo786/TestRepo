package mentoringPractice;

public class StaticNonStatic {
    static String purpose="official meeting";
     int member=5;
    public static void main(String[] args) {
        StaticNonStatic meet=new StaticNonStatic();
        meet.meeting();
        meet.zoomMeeting();
        System.out.println(purpose);
        System.out.println(meet.member);

    }
    public static void meeting(){
        System.out.println("pushpo make me static method");
    }

    public void zoomMeeting(){
        System.out.println("pushpo make me nonstatic method");
    }

}
