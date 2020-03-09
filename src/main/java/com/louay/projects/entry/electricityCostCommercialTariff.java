package com.louay.projects.entry;

import com.louay.projects.entry.Account;

public class electricityCostCommercialTariff extends Account {
    private int registrationNumber;
    private double totalBills;

    public electricityCostCommercialTariff(String name, String address, String phoneNumber, int registrationNumber, double totalBills) {
        super(name, address, phoneNumber);
        this.registrationNumber = registrationNumber;
        setTotalBills(totalBills);
    }
    @Override
    public void setTotalBills(double consumption){
        double result =0;
        double gc = consumption*0.05;
        double netConsumption =consumption;
        if (consumption > 2000) {
            result = 2000 * 120;
            netConsumption -= 2000;
            result+=netConsumption*175;
        } else
            result = consumption*120;
        this.totalBills = (result/1000)+gc;
    }
    @Override
    public double getTotalBills() {
        return totalBills;
    }

    @Override
    public String toString() {
        return super.toString()+" electricityCostCommercialTariff{" +
                "registrationNumber=" + registrationNumber +
                ", totalBills=" + totalBills +" JD"+
                '}';
    }

    public int getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(int registrationNumber) {
        this.registrationNumber = registrationNumber;
    }
}
