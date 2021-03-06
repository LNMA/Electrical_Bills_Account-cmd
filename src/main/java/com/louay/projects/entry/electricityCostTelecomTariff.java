package com.louay.projects.entry;

import com.louay.projects.entry.Account;

public class electricityCostTelecomTariff extends Account {
    private int registrationNumber;
    private double totalBills;

    public electricityCostTelecomTariff(String name, String address, String phoneNumber, int registrationNumber, double totalBills) {
        super(name, address, phoneNumber);
        this.registrationNumber = registrationNumber;
        setTotalBills(totalBills);
    }
    @Override
    public void setTotalBills(double consumption){
        double gc = consumption*0.05;
        double result =0;
        double netConsumption =consumption;
        if (consumption > 2000) {
            result = 2000 * 230;
            netConsumption -= 2000;
            result+=netConsumption*273;
        } else
            result = consumption*230;
        this.totalBills = (result/1000)+gc;
    }
    @Override
    public double getTotalBills() {
        return totalBills;
    }

    public int getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(int registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    @Override
    public String toString() {
        return super.toString()+" electricityCostTelecomTariff{" +
                "registrationNumber=" + registrationNumber +
                ", totalBills=" + totalBills +" JD"+
                '}';
    }
}
