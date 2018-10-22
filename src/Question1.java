import java.util.HashSet;

public class Question1 {

    public static void main(String[] args)
    {
        System.out.println("1. Create two hash sets {\"George\", \"Jim\", \"John\", \"Blake\", \"Kevin\", \"Michael\"} and {\"George\", \"Katie\", \"Kevin\", \"Michelle\", \"Ryan\"}, and find t heir union, difference, and intersection. (You may clone the sets to preserve the original sets from being changed by these set methods");
        HashSet<String> h1 = new HashSet<String>();
        h1.add("George");
        h1.add("Jim");
        h1.add("John");
        h1.add("Blake");
        h1.add("Kevin");
        h1.add("Michael");
        HashSet<String> h2 = new HashSet<String>();
        h2.add("George");
        h2.add("Katie");
        h2.add("Kevin");
        h2.add("Michelle");
        h2.add("Ryan");

        System.out.println("Start condition : SET 1 " + h1.toString() +" SET 2 "+ h2.toString());

        HashSet<String> union = new HashSet<String>();
        union = (HashSet) h1.clone();
        union.addAll(h2);
        System.out.println("Union : " + union.toString());

        HashSet<String> cloneh1 = new HashSet<String>();
        cloneh1 = (HashSet) h1.clone();
        cloneh1.removeAll(h2);
        HashSet<String> cloneh2 = new HashSet<String>();
        cloneh2 = (HashSet) h2.clone();
        cloneh2.removeAll(h1);
        cloneh1.addAll(cloneh2);
        System.out.println("Difference : " + cloneh1.toString());

        HashSet<String> intersect = new HashSet<String>();
        intersect = (HashSet) h1.clone();
        intersect.retainAll(h2);
        System.out.println("Intersection :" + intersect.toString());





    }
}
