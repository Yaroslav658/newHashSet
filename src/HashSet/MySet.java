package HashSet;

public interface MySet<String> {
    boolean add(String e); // Returns true if this set did not already contain the specified element        //done

    void clear();                                                                               //done

    boolean contains(String o);                                                                 //done

    boolean isEmpty();                                                                          //done

    boolean remove(String o); // Returns true if this set contained the specified element       //done

    int size();                                                                                 //done

    String[] toArray();                                                                         //done
}
