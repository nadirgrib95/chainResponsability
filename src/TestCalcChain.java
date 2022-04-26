public class TestCalcChain {

    public static void main(String [] args) {

        Chain chainCalc1 = new AddNumbers();
        Chain chainCalc2 = new SubtractNumbers();
        Chain chainCalc3 = new multNumbers();
        Chain chainCalc4 = new divNumbers();

        chainCalc1.setNextChain(chainCalc2);
        chainCalc2.setNextChain(chainCalc3);
        chainCalc3.setNextChain(chainCalc4);

        Numbers request = new Numbers(4,2, "suba");

        chainCalc1.calculate(request);

    }
}
