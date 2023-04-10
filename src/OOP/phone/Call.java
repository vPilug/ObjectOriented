package OOP.phone;

public class Call {
    private String phoneNumber;

    public Call(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Call{" +
                "phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
