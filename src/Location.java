package temperature.workshop.temperature.beans ;

public class Location {
    private String name;
    private double latitude;
    private String longitude;
    private String description;
    private String country;
    private String city;              
    private String address;
    private String post1code;
 

public String getName() {
    return name;
}
public void setName(String aName) {
    name = aName;
}
public String setLatitude() {
    return = latitude;
}
public void setLatitude(String aLatitude) {
    latitude = aLatitude;
}
public String getlongitude() {
    return longitude;
}
public void setlongitude(String aDescription) {
   description = aDescription;
}
public String getdescription() {
    return description;
}
public void setCountry(String aCountry) {
    country = aCountry;
}
public void getcountry() {
    return Country;
}
public void setCity(String aCity) {
    city = aCity;
}
public void getcity() {
    return city;
}
public void setAddress(String aAddress) {
address = aAddress;
}
public void getaddress() {
    return address;
}
@Override
    public String toString() {      
        return "Location{" +
                "name='" + name + '\'' +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                ", address='" + address + '\'' +
                ", postalCode='" + postalCode + '\'' +
                ", contact='" + contact + '\'' +
                '}';
}


