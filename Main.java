
public class Main {
    public static void main(String[] args) throws InterruptedException {
        ChatManager myChat = new ChatManager();
        Chatroom chatRoom = myChat.createChat("*Названиее чата*");

        User user1 = new User("Маша");
        User user2 = new User("Паша");
        User user3 = new User("Даша");
        User user4 = new User("Коля");
        User user5 = new User("Иван");

        myChat.enterInChat(chatRoom, user1);
        myChat.enterInChat(chatRoom, user2);
        myChat.enterInChat(chatRoom, user3);
        myChat.enterInChat(chatRoom, user4);
        myChat.enterInChat(chatRoom, user5);
        System.out.println();

        chatRoom.printUsers();
        System.out.println();

        myChat.getMassage(chatRoom, user1, "Пока))");
        
        myChat.getMassage(chatRoom, user2, "Всем чмоки в этом чате");
        myChat.getMassage(chatRoom, user3, "Цой жив!!!");
        myChat.getMassage(chatRoom, user5, "8-P");

        myChat.exitFromChat(chatRoom, user4);
        myChat.exitFromChat(chatRoom, user5);
        System.out.println();
        chatRoom.printUsers();
        System.out.println();

        chatRoom.getHistory();
    }
}