package sample;

public class BranchingAlgorithm {
    private double x;
    private double y;
    private int functionNumber;

    public BranchingAlgorithm(double x, double y, int functionNumber) {
        this.x = x;
        this.y = y;
        this.functionNumber = functionNumber;
    }

    public double cos(double number) {
        return Math.cos(number);
    }

    public double pow(double number, double power) {
        return Math.pow(number, power);
    }

    public double exp(double number) {
        return Math.exp(number);
    }

    public double log(double number) {
        return Math.log(number);
    }

    public double abs(double number) {
        return Math.abs(number);
    }

    public double tan(double number) {
        return Math.tan(number);
    }

    public double sqrt(double number) {
        return Math.sqrt(number);
    }

    public double solve() {
        double answer;
        double resultOfFunction = calculateFunction();

        if (x / y > 0)
            answer = log(y + 2) + resultOfFunction;
        else if (x / y < 0)
            answer = log(abs(y)) - tan(resultOfFunction);
        else
            answer = resultOfFunction * pow(y, 3);

        return answer;
    }

    private double calculateFunction() {
        double resultOfFunction;

        switch (functionNumber) {
            case 1:
                resultOfFunction = cos(x);
                break;

            case 2:
                resultOfFunction = sqrt(x);
                break;

            case 3:
                resultOfFunction = exp(x);
                break;
            default:
                throw new java.lang.IllegalStateException("Unexpected value: " + functionNumber);
        }

        return resultOfFunction;
    }
}
