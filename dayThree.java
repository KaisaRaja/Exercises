import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class dayThree {
    public static void main(String[] args) {
        int[] m = new int[10];
        int length = m.length;
        System.out.println(length);

        String[] carBrand = {"Tesla", "Honda", "Audi"};
        String [] carModel = {"Model S", "Civic", "A3"};
        carModel[0] =  "Model 3";

        Arrays.sort(carBrand);
        System.out.println(Arrays.toString(carBrand));


        System.out.println(carBrand[0] + " " + carModel[0]);
    }

}
