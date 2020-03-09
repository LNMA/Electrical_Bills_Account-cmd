package com.louay.projects.entry;

import com.louay.projects.entry.Account;

public class electricityCostResidentialTariff extends Account {
    private double totalBills;

    public electricityCostResidentialTariff(String name, String address, String phoneNumber, double totalBills) {
        super(name, address, phoneNumber);
        setTotalBills(totalBills);
    }
    @Override
    public void setTotalBills(double consumption){
        double result =0;
        double gc = consumption*0.025;
        double tv = 1;
        double netConsumption =consumption;
        if (consumption > 160) {
            result = 160 * 33;
            netConsumption -= 160;
            if (consumption > 300 ) {
                result += (300-160) * 72;
                netConsumption -= (300 - 160);
                if (consumption > 500 ) {
                    result += (500 - 300) * 86;
                    netConsumption -= (500 - 300);
                    if (consumption > 600 ) {
                        result += (600 - 500) * 114;
                        netConsumption -= (600 - 500);
                        if (consumption > 750 ) {
                            result += (750 - 600) * 158;
                            netConsumption -= (750 - 600);
                            if (consumption > 1000 ) {
                                result += (1000 - 750) * 188;
                                netConsumption -= (1000 - 750);
                                if (consumption > 1001) {
                                    result += netConsumption * 265;
                                }
                            }
                            else
                                result += netConsumption*188;
                        }
                        else
                            result += netConsumption*158;
                    }
                    else
                        result += netConsumption*114;
                }
                else
                    result += netConsumption*86;
            }
            else
                result += netConsumption*72;
        }
        else
            result = consumption*33;
        this.totalBills = ((result/1000)+gc+tv);
    }
    @Override
    public double getTotalBills() {
        return totalBills;
    }

    @Override
    public String toString() {
        return super.toString()+" electricityCostResidentialTariff{" +
                "totalBills=" + totalBills +" JD"+
                '}';
    }
}
