package ConditionalStatements;

public class IfElse {
    public static void main(String[] args) {
        int time = 19;

        if (time == 12){
            System.out.println("Noon or Midnight");
        }
        else if (time < 12){
            System.out.println("Good Morning");
        } else if (time > 12){
            System.out.println("Good Night");
        }
    }
}
