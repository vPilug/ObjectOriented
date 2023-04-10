package OOP.phone;

public class Message {
    private String phoneNumber;
    private String messageContent;

    public Message(String phoneNumber, String messageContent) {
        this.phoneNumber = phoneNumber;
        this.messageContent = messageContent;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String toString() {
        return "Message{" +
                "phoneNumber='" + phoneNumber + '\'' +
                ", messageContent='" + messageContent + '\'' +
                '}';
    }
}