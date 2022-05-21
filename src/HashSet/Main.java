package HashSet;

public class Main {
    public static void main(String[] args) {

            MySet set = new MyHashSet();
            set.add("asdf");
            set.add("qwer");
            set.add("zxcv");
            set.add("asdf");
            System.out.println(set.toString()); // [zxcv, qwer, asdf]
        System.out.println(set.remove("asdf"));
        System.out.println(set.remove("wqewewqe"));
        System.out.println(set.isEmpty());
        System.out.println(set.toString());
        set.clear();
        System.out.println(set.toString());
        System.out.println(set.isEmpty());

    }
}
