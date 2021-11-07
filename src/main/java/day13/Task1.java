package day13;
//В методе main() этого класса необходимо создать трех пользователей.
//Затем необходимо:
//Отправить 2 сообщения от пользователя 1 пользователю 2
//Отправить 3 сообщения от пользователя 2 пользователю 1
//Отправить 3 сообщения от пользователя 3 пользователю 1
//Отправить 3 сообщения от пользователя 1 пользователю 3
//Отправить 1 сообщение от пользователя 3 пользователю 1
//
//Сообщения могут быть любыми.
//После этого, необходимо вывести диалог пользователя 1 и пользователя 3 с помощью метода showDialog().
public class Task1 {
    public static void main(String[] args) {
        User user1 = new User("user1");
        User user2 = new User("user2");
        User user3 = new User("user3");
        user1.sendMessage(user2, "Good mornind");
        user1.sendMessage(user2, "How are you");
        user2.sendMessage(user1, "Hello");
        user2.sendMessage(user1, "It's OK");

        MessageDatabase.showDialog(user1, user2);

        MessageDatabase.showDialog(user2, user1);
    }
}
