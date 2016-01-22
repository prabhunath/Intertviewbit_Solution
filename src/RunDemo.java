import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RunDemo {

/**
 * @param args
 */
public static void main(String[] args) {
    // Get n
    List<List<Integer>> triangle = new ArrayList<List<Integer>>();

    List<Integer> row1 = new ArrayList<Integer>(1);
    row1.add(2);
    triangle.add(row1);

    List<Integer> row2 = new ArrayList<Integer>(2);
    row2.add(3);row2.add(4);
    triangle.add(row2);

    triangle.add(Arrays.asList(6,5,7));
    triangle.add(Arrays.asList(4,1,8,3));

    System.out.println("Size = "+ triangle.size());
    for (int i=0; i<triangle.size();i++)
        System.out.println(triangle.get(i));

}
}