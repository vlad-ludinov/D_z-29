import java.util.Random;

/**
 * task
 */
public class task {

    public static void main(String[] args) {
        int i = get_rnd_number(0, 2000);
    }

    static int get_rnd_number(int min, int max) {
        int number = new Random().nextInt(min, max + 1);
        return number;
    }
}