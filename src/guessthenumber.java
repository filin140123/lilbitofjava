import java.util.Scanner;

public class guessthenumber {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Ваша задача угадать число. Введите верхнюю границу: ");
        int range = scanner.nextInt();
        playLevel(range);
        System.out.println("Ура победа победа ура");
        scanner.close();
    }

    private static void playLevel(int range){
        int number = (int)(Math.random() * (range-1))+1;  // number = random.randint(1, range)
        while(true) {
            System.out.println("Угадайте число от 1 до " + range);
            int input_number = scanner.nextInt();
            if(input_number == number){
                System.out.println("Вы угадали");
                break;
            } else if(input_number > number){
                System.out.println("Загаданное число меньше");
            } else {
                System.out.println("Загаданное число больше");
            }
        }
    }

}
