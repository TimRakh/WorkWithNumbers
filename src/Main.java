import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < intList.size(); i++) {
            Integer num = intList.get(i);
            if (num > 0 && num % 2 == 0){
                list.add(num);
            }
        }
        list.sort(Comparator.naturalOrder());
        System.out.println(list);


    }
}