package HashSet;

public class Main {
    public static void main(String[] args) {
//            // Map<String, String> map = new HashMap<>(); - аналог
//            MyMap myMap = new MyHashMap();
//            myMap.put("1", "asdf");
//            myMap.put("2", "qwert");
//            myMap.put("3", "zxcv");
//            myMap.put("1", "zzz");
//            System.out.println(myMap); // [1=zzz, 2=qwert, 3=zxcv]

            MySet set = new MyHashSet();
            set.add("asdf");
            set.add("qwer");
            set.add("zxcv");
            set.add("asdf");
            System.out.println(set); // [zxcv, qwer, asdf]

    }
}
