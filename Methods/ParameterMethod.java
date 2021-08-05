package Methods;

import java.lang.reflect.ParameterizedType;

public class ParameterMethod {
    public static void main(String[] args) {
        ParameterMethod obj = new ParameterMethod();
            obj.ReceivedMessage("Danish", "b", 12);
            obj.SendMessage();
    }
    public void SendMessage(){
        System.out.println("Sending a text message......");
    }
    public void ReceivedMessage(String FirstName, String LastName, int Number){
        System.out.println(FirstName + " " + LastName + " " + Number);
    }
}

