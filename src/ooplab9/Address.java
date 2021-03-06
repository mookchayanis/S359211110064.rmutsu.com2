package ooplab9;

public class Address {
    private String homeNo;
    private String province;
    private String postCode;
    //construcotr

    public Address(String homeNo, String province, String postCode) {
        this.homeNo = homeNo;
        this.province = province;
        this.postCode = postCode;
    }
    //getter and setter method

    public String getHomeNo() {
        return homeNo;
    }

    public void setHomeNo(String homeNo) {
        this.homeNo = homeNo;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }
    //toString

    @Override
    public String toString() {
        return "Address{" +
                "homeNo='" + homeNo + '\'' +
                ", province='" + province + '\'' +
                ", postCode='" + postCode + '\'' +
                '}';
    }
}//class
