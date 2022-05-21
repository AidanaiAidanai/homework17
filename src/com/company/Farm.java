package com.company;

public class Farm  {
    private String address;
    private String ownerName;

    public Farm(String address, String ownerName) {
        this.address = address;
        this.ownerName = ownerName;
    }


    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    @Override
    public String toString() {
        return "Farm{" +
                "address='" + address + '\'' +
                ", ownerName='" + ownerName + '\'' +
                '}';
    }
}
