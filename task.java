import java.util.Random;

/**
 * task
 */
public class task {

    public static void main(String[] args) {
        int i = get_rnd_number(0, 2000);
        System.out.printf("Выпавшее случайное число: %d\n", i);
        int n = count_number_msbit(i);
        System.out.printf("Номер старшего значещего бита: %d\n", n);
        int[] m1 = count_multiple_number(i, Short.MAX_VALUE, n);
        int[] m2 = count_multiple_number(Short.MIN_VALUE, i, n);
        // Сначала хотел вывести все числа в этих массивах
        // System.out.print("Все кратные n числа в диапазоне от i до Short.MAX_VALUE: ");
        // print_array(m1);
        // System.out.print("Все некратные n числа в диапазоне от Short.MIN_VALUE до i: ");
        // print_array(m2);
        // Но их оказалось слишком много,
        // поэтому просто решил вывести их количество
        System.out.printf("Количество кратных n чисел в диапазоне от i до Short.MAX_VALUE: %d\n", count_length_array(m1));
        System.out.printf("Количество кратных n чисел в диапазоне от Short.MIN_VALUE до i: %d\n", count_length_array(m2));
    }

    static int get_rnd_number(int min, int max) {
        int number = new Random().nextInt(min, max + 1);
        return number;
    }

    static int count_number_msbit(int number) {
        int number_msbit = Integer.toBinaryString(number).length() - 1;
        return number_msbit;
    }

    static int[] count_multiple_number(int min, int max, int number) {
        int count = 0;
        for (int i = min; i < max + 1; i++) {
            if (i%number == 0) count += 1;
        }
        int temp = 0;
        int [] multiple_array = new int[count];
        for (int i = min; i < max + 1; i++) {
            if (i%number == 0) {
                multiple_array[temp] = i;
                temp += 1;
            }
        }
        return multiple_array;
    }
    static void print_array(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length - 1; i++) {
            System.out.printf("%d, ", array[i]);
        }
        System.out.printf("%d]", array[array.length - 1]);
        System.out.println();
    }
    static int count_length_array(int[] array) {
        return array.length;
    }
}