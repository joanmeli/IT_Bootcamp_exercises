import java.util.Arrays;
import java.util.HashMap;

public class CitiesTemps {
    public static void main(String[] args) {
        int[] lowest_temps = {
                -2, -3, -8, 4, 6, 5, 0, -7, -1, -10
        };
        int[] highest_temps = {
                33, 32, 27, 37, 42, 43, 39, 26, 31, 35
        };
        String[] cities = {
                "Londres", "Madrid", "Nueva York", "Buenos Aires", "Asunción",
                "São Paulo", "Lima", "Santiago de Chile", "Lisboa", "Tokio"
        };
        int highest_temp = 0, lowest_temp = 0, highest_temp_i = 0, lowest_temp_i = 0;
        int CITES_COUNT = cities.length;
         for (int i=0; i<CITES_COUNT; i++){
             if(highest_temps[i] > highest_temp) {
                 highest_temp = highest_temps[i];
                 highest_temp_i = i;
             }

             if(lowest_temps[i] < lowest_temp) {
                 lowest_temp = lowest_temps[i];
                 lowest_temp_i = i;
             }

         }
        System.out.println(
                "A temperatura mais alta foi em " + cities[highest_temp_i] + ", com " + highest_temp + "graus"
        );
        System.out.println(
                "A temperatura mais baixa foi em " + cities[lowest_temp_i] + ", com " + lowest_temp + "graus"
        );
    }
}
