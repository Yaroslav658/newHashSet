package HashSet;

public class Main {
    public static void main(String[] args) {

            MySet set = new MyHashSet();
        System.out.print("try to add asdf = ");
        System.out.println( set.add("asdf"));
        System.out.print("try to add qwer = ");
        System.out.println(set.add("qwer"));
        System.out.print("try to add zxcv = ");
        System.out.println(  set.add("zxcv"));
        System.out.print("try to add null = ");
        System.out.println(set.add(null));
        System.out.print("try to add asdf again = ");
        System.out.println( set.add("asdf"));

        System.out.print("set to string = ");
        System.out.println(set.toString());

        System.out.print("try to remove asdf  = ");
        System.out.println(set.remove("asdf"));
        System.out.print("try to remove asdf again = ");
        System.out.println(set.remove("asdf"));

        System.out.print("is empty = ");
        System.out.println(set.isEmpty());

        System.out.print("size = ");
        System.out.println(set.size());

        System.out.print("clear");
        set.clear();

        System.out.print("set to string = ");
        System.out.println(set.toString());

        System.out.print("is empty = ");
        System.out.println(set.isEmpty());

    }
}
