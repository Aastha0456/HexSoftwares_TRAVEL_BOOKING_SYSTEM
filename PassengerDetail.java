package Information;

public class PassengerDetail {
    private String firstName;
    private String middleName;
    private String LastName;
    private String address;
    private String Gender;
    private String from;

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getWhere() {
        return Where;
    }

    public void setWhere(String where) {
        Where = where;
    }

    private String Where;

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    private int pincode;
    private double aadharcardNo;
    private double mobileNo;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPincode() {
        return pincode;
    }

    public void setPincode(int pincode) {
        this.pincode = pincode;
    }

    public double getAadharcardNo() {
        return aadharcardNo;
    }

    public void setAadharcardNo(double aadharcardNo) {
        this.aadharcardNo = aadharcardNo;
    }

    public double getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(double mobileNo) {
        this.mobileNo = mobileNo;
    }
}
