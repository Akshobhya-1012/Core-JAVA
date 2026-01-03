package Lab3;

public class Car {
    private String regNo;
    private String ownerName;
    private int tokenNo;
 
    public Car(String regNo, String ownerName, int tokenNo) {
        this.regNo = regNo;
        this.ownerName = ownerName;
        this.tokenNo = tokenNo;
    }
 
    public String getRegNo() {
        return regNo;
    }
 
    public String getOwnerName() {
        return ownerName;
    }
 
    public int getTokenNo() {
        return tokenNo;
    }
}