package day13;

import java.util.ArrayList;
import java.util.List;

public class MessageDatabase {
    static List<Message> messages = new ArrayList<>();

    public static void sendMessage(User user1, User user2, String text) {
        messages.add(new Message(user1, user2, text));
    }

    public static List<Message> getMessage() {
        return messages;
    }

    public static void showDialog(User user1, User user2) {
        for (Message message : messages) {
            if (message.getSender().equals(user1) && message.getReceiver().equals(user2)) {
                System.out.println(message.getSender().getUserName() + ": " + message.getText());
            } else if (message.getSender().equals(user2) && message.getReceiver().equals(user1)) {
                System.out.println(message.getSender().getUserName() + ": " + message.getText());
            }
        }
    }
}
