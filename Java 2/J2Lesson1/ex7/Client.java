import javax.security.auth.callback.Callback;

public class Client implements Callback {
    public void callback(int param) { // метод интерфейса
        System.out.println("param: " + param);
    }
    public void info() {              // метод самого класса
        System.out.println("Client Info");
    }
}
