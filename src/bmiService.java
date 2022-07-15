public class bmiService {
    public double calculate(double height, double weight) {
        double bodyMassIndex = weight / (height * height);
        return bodyMassIndex;
    }
}
