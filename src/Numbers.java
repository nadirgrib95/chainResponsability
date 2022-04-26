public class Numbers {

    private int number1;
    private int number2;

    private String calculationWanted;

    public Numbers(int newNumber1, int newNumber2, String calcWanted){

        number1 = newNumber1;
        number2 = newNumber2;
        calculationWanted = calcWanted;
    }

    public int getNumber1() {
        return this.number1;
    }

    public int getNumber2() {
        return this.number2;
    }

    public String getCalculationWanted() {
        return this.calculationWanted;
    }
}
