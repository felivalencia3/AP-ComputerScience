package valencia.java;

public class Invitation {
    private String hostName;
    private String address;

    public Invitation(String n, String a) {
        hostName = n;
        address = a;
    }

    // (a)
    public String getHostName() {
        return hostName;
    }

    // (b)
    public void updateAddress(String address) {
        this.address = address;
    }

    // (c)
    public String inviteeMessage(String invitee) {
        return "Dear " + invitee + ", please attend my event at " + address + ". See you then, " + hostName;
    }

    // (d)
    public Invitation(String address) {
        this.address = address;
        hostName = "Host";
    }
}
