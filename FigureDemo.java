package by.teachmeskills.lesson7;


    import java.util.Random;

    public class FigureDemo {
        private static final String sumOfPerimeter = "Периметр фигруры: ";
        private static final String sumOfPerimeters = "Сумма периметров фигур: ";

        public static void main(String[] args) {
            Random random = new Random();
            int a = random.nextInt(1);
            int b = random.nextInt(2);
            int c = random.nextInt(3);

            Figure[] figures = {new Triangle(a, b, c), new Rectangle(a, b), new Circle(a), new Circle(b), new Circle(c)};
            sumOfPerimeters(figures);
        }

        private static void sumOfPerimeters(Figure[] figures) {
            double sum = 0;
            for (Figure figure : figures) {
                double perimeter = figure.calculatePerimeter();
                System.out.println(sumOfPerimeter + perimeter);
                sum += perimeter;
            }
            System.out.printf(sumOfPerimeters + (String.format("%.2f", sum)));
        }
    }


