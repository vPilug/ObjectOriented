package OOP.phone;

public interface Phone {
    void addContact(String index, String phoneNumber, String firstName, String lastName);
    void seeContacts();
    void sendMessage(String phoneNumber, String messageContent);
    void seeMessages();
    void seeMessagesFromPhoneNumber(String phoneNumber);
    void call(String phoneNumber);
    void viewHistory();
    Contact getFirstContact();
    Contact getLastContact();
    Message getFirstMessage(String phoneNumber);
    Message getSecondMessage(String phoneNumber);
    void getAvailableBatteryLife();
}