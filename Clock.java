public class Clock {
    String time;
   
    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
    public static void main(String[] args) {
        Clock c = new Clock();
        c.setTime("12:45");
        String tod;
        tod = c.getTime();
        System.out.println("time is "   + tod);
    }






}
