package sample;

public class LinearAlgorithm {
    private double x;
    private double y;
    private double z;

    public LinearAlgorithm(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double cos(double number) {
        return Math.cos(number);
    }

    public double pow(double number, double power) {
        return Math.pow(number, power);
    }

    public double solve() {
        double PI = Math.PI;
        return ((2 * cos(x - PI / 6)) / (0.5 + (1 - cos(2 * y)) / 2)) * (1 + (pow(z, 2) / (3 - (pow(z, 2) / 5))));
    }
}
