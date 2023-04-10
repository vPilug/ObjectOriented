package OOP.phone;

import java.util.ArrayList;
import java.util.List;

public class BasicPhone implements Phone{
    private final int batteryLife;
    private String color;
    private String material;
    private String IMEI;

    private int availableBatteryLife;

    List<Contact> contactsList = new ArrayList<>();
    List<Message> messagesList = new ArrayList<>();
    List<Call> callsList = new ArrayList<>();
    public BasicPhone(int batteryLife, String color, String material, String IMEI) {
        this.batteryLife = batteryLife;
        this.color = color;
        this.material = material;
        this.IMEI = IMEI;
        this.availableBatteryLife = batteryLife;
    }

    public void getAvailableBatteryLife() {
        System.out.println("Your available battery life is: " + availableBatteryLife + " hours");
    }

    public int getBatteryLife() {
        return batteryLife;
    }

    public String getIMEI() {
        return IMEI;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void addContact(String index, String phoneNumber, String firstName, String lastName) {
        Contact newContact = new Contact(index, phoneNumber,firstName,lastName);
        contactsList.add(newContact);
    }
    public Contact getFirstContact() {
        return contactsList.get(0);
    }

    public Contact getLastContact() {
        return contactsList.get(contactsList.size()-1);
    }
    public void seeContacts() {
        System.out.println("_______________________");
        System.out.println("Your list of contacts is: ");
        for(Contact contact : contactsList) {
            System.out.println(getClass().getSimpleName() + " " + contact.toString());
        }
        System.out.println("_______________________");
    }

    public void sendMessage(String phoneNumber, String messageContent) {
        if(availableBatteryLife >= 1) {
            if (messageContent.length() <= 500) {

                Message newMessage = new Message(phoneNumber, messageContent);
                messagesList.add(newMessage);
                availableBatteryLife -= 1;
            } else {
                System.out.println("Message too long - max number of characters - 100");
            }
        } else {
            System.out.println("WARNING: Your battery is low (" + availableBatteryLife + ")");
        }
    }
    @Override
    public Message getFirstMessage(String phoneNumber) {
        return messagesList.get(0);
    }

    @Override
    public Message getSecondMessage(String phoneNumber) {
        return messagesList.get(1);
    }

    public void seeMessages() {
        System.out.println("_______________________");
        System.out.println("Your messages are: ");
        for(Message message : messagesList) {
            System.out.println(getClass().getSimpleName() + " " + message.toString());
        }
        System.out.println("_______________________");
    }
    public void seeMessagesFromPhoneNumber(String phoneNumber) {
        System.out.println("_______________________");
        System.out.println("Your messages with phone number " + phoneNumber + " are: ");
        for(Message message : messagesList) {
            if (message.getPhoneNumber().equals(phoneNumber)) {
                System.out.println(getClass().getSimpleName() + " " + message.toString());
            }
        }
        System.out.println("_______________________");
    }

    public void call(String phoneNumber) {
        if (availableBatteryLife >= 2) {
            Call newCall = new Call(phoneNumber);
            callsList.add(newCall);
            availableBatteryLife -= 2;
        } else {
            System.out.println("WARNING: Your battery is low (" + availableBatteryLife + ")");
        }
    }

    @Override
    public void viewHistory() {
        System.out.println("_______________________");
        System.out.println("Your calls history is: ");
        for (Call call: callsList) {
            System.out.println(getClass().getSimpleName() + " " + call.toString());
        }
        System.out.println("_______________________");
    }
}
