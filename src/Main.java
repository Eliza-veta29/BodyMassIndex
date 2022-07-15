public class Main {
    public static void main(String[] args) {
        System.out.println("Здравствуйте!");
        System.out.println("Для расчета Индекса Массы Тела введите Ваш рост(м) и массу тела(кг)");
        bmiService service = new bmiService();
        double height = 1.73;
        double weight = 63;
        double index;
        double bodyMassIndex;
        boolean imt = weight > height;
        index = service.calculate(height, weight);
        if (weight > height) {
            System.out.println("Индекс Массы Тела: " + index);
        } else {
            System.out.println("Проверьте введенные данные");
        }
        System.out.println("До свидания!");
    }
}