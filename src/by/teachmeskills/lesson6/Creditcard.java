package by.teachmeskills.lesson6;

public class Creditcard {

    private String numberiban;
    private double summiban;

    public Creditcard(String numberiban) {
        this.numberiban = numberiban;
        this.summiban = 0;
    }
    public void addsumm( double summToadd) {
        this.summiban = this.summiban +summToadd;
    }
    public void withdraw(double summwithdraw ){
        this.summiban = this.summiban - summwithdraw;
    }

    public String getNumberiban() {
        return numberiban;
    }

    public void setNumberiban(String numberiban) {
        this.numberiban = numberiban;
    }

    public double getSummiban() {
        return summiban;
    }

    public void setSummiban(double summiban) {
        this.summiban = summiban;
    }

    public String getinfo(){
        return "numberiban" + this.numberiban;
    }


}
