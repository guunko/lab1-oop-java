public class Main{
    public static void main(String[] args) {
        // Перше завдання
        double x1 = -2;
        double end1 = 2;
        double step1 = 0.5;

        System.out.println("Перше завдання:");
        System.out.println("x\t\ty");
        while (x1 <= end1) {
            double y1 = Math.exp(x1 * x1 - Math.cos(x1));
            System.out.println(x1 + "\t" + y1);
            x1 +=  step1;
        }

        double x2 = 19;
        double end2 = 22;
        double step2 = 0.4;

        System.out.println("\nДруге завдання:");
        System.out.println("x\t\ty");
        while (x2 <= end2 + 0.0001) {
            double y2;
            if (x2 < 20) {
                y2 = Math.sqrt(2 * Math.sin(x2) + Math.cos(x2));
            } else {
                y2 = 2 * Math.sin(x2) - Math.cos(x2);
            }
            System.out.println(x2 + "\t" + y2);
            x2 += step2;
        }
    }
}
