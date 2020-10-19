package com.example.tips;

public class Calc {
    private double billAmount; // Сумма счёта
    private double percent; // Процент чаевых
    private double tip; // Сумма чаевых
    private double total; // Итоговая сумма


    public double calculateTip(double billAmount, double percent) { return billAmount*percent; }
    public double calculateNDS(double billAmount) { return billAmount*0.2; }
    public double calculateTotal(double billAmount, double percent) { return billAmount*(1+percent); }
    public double calculateTest(double billAmount, double percent) {

        /*return calculateTotal(billAmount,percent)/50000;*/
        return billAmount*(1+percent)/50000;

    }
    public double calculateFine(double billAmount, double percent) { return billAmount*percent-(billAmount*percent*0.2); }

// Getter and setter:

    public double getBillAmount() { return billAmount; }
    public void setBillAmount(double billAmount) { this.billAmount = billAmount; }

    public double getPercent() { return percent; }
    public void setPercent(double percent) { this.percent = percent; }

    public double getTip() { return tip; }
    public void setTip(double tip) { this.tip = tip; }

    public double getTotal() { return total; }
    public void setTotal(double total) { this.total = total; }




}
