package OOP.phone;

public class Main {
    public static void main(String[] args) {
//       Phone phone= new Samsung();
        Phone phone = new SamsungGalaxy6();
        phone.addContact("1","phone number", "first name", "last name" );
        phone.addContact("2", "second phone number", "second first name", "second last name");
        phone.getFirstContact();
        phone.getLastContact();

        phone.seeContacts();
        Contact contact1 = phone.getFirstContact();
        phone.sendMessage(contact1.getPhoneNumber(), "message content");
        phone.sendMessage(contact1.getPhoneNumber(), "This is the second message");

        Contact contact2 = phone.getLastContact();
        phone.sendMessage(contact2.getPhoneNumber(), "Hello");
        phone.sendMessage(contact2.getPhoneNumber(), "Are you there?");
        phone.seeMessages();
        phone.seeMessagesFromPhoneNumber("phone number");
        phone.getAvailableBatteryLife();

        phone.getFirstMessage("phone number");
        System.out.println("Your first message is: " + phone.getFirstMessage("phone number"));

        phone.getSecondMessage("phone number");
        System.out.println("Your second message is: " +phone.getSecondMessage("phone number"));
        phone.call("second phone number");
        phone.viewHistory();

    }
}