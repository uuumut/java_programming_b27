package b25_Constructor;

public class Address {
    public int buildingNumber;
    public String street;
    public String city;
    public String state;
    public String zipCode;

    public
    Address(int buildingNumber, String street, String city, String state, String zipCode) {
        this.buildingNumber = buildingNumber;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }
    public String address(){
        return buildingNumber+" "+" "+street+" "+city+" "+state+" "+","+" "+zipCode;
    }

    public String toString() {
        return "Address{" +
                "buildingNumber=" + buildingNumber +
                ", street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zipCode='" + zipCode + '\'' +
                ", Address is='" + address() + '\'' +
                '}';
    }
}
