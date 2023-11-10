import java.util.ArrayList;
import java.lang.String;

public class MessagingService {
    private ArrayList<Message> list;

    public MessagingService() {
        this.list = new ArrayList<>();
    }

    public void add(Message message) {
        if (message.getContent().length()  <= 280) {
            this.list.add(message);
        }

    }
    public ArrayList<Message> getMessages() {
        return this.list;
    }
}
