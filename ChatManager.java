
public class ChatManager {
    public Chatroom createChat(String chatName) {
        return new Chatroom(chatName);
    }

    public void enterInChat(Chatroom chatroom, User user) {
        chatroom.addUser(user);
    }

    public void exitFromChat(Chatroom chatroom, User user) {
        chatroom.removeUser(user);
    }

    public void getMassage(Chatroom chatroom, User user, String msg) {
        chatroom.printMessage(user, msg);
    }
}