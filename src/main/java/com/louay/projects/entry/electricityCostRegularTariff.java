package com.louay.projects.entry;

import com.louay.projects.entry.Account;

public class electricityCostRegularTariff extends Account {
    private double totalBills;

    public electricityCostRegularTariff(String name, String address, String phoneNumber, double totalBills) {
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
            result = 160 * 42;
            netConsumption -= 160;
            if (consumption > 300 ) {
                result += (300-160) * 92;
                netConsumption -= (300 - 160);
                if (consumption > 500 ) {
                    result += (500 - 300) * 109;
                    netConsumption -= (500 - 300);
                    if (consumption > 600 ) {
                        result += (600 - 500) * 145;
                        netConsumption -= (600 - 500);
                        if (consumption > 750 ) {
                            result += (750 - 600) * 169;
                            netConsumption -= (750 - 600);
                            if (consumption > 1000 ) {
                                result += (1000 - 750) * 190;
                                netConsumption -= (1000 - 750);
                                if (consumption > 1001) {
                                    result += netConsumption * 256;
                                }
                            }
                            else
                                result += netConsumption*190;
                        }
                        else
                            result += netConsumption*169;
                    }
                    else
                        result += netConsumption*145;
                }
                else
                    result += netConsumption*109;
            }
            else
                result += netConsumption*92;
        }
        else
            result = consumption*42;
        this.totalBills = (result/1000)+gc+tv;
    }

    @Override
    public double getTotalBills(){
        return totalBills;
    }

    @Override
    public String toString() {
        return super.toString()+" electricityCostRegularTariff{" +
                "totalBills=" + totalBills +" JD"+
                '}';
    }
}
