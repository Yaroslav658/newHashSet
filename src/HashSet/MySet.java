package HashSet;

public interface MySet<E> {
    boolean add(E e); // Returns true if this set did not already contain the specified element        //done

    void clear();                                                                               //done

    boolean contains(E o);                                                                 //done

    boolean isEmpty();                                                                          //done

    boolean remove(E o); // Returns true if this set contained the specified element       //done

    int size();                                                                                 //done

    E[] toArray();                                                                         //done
}
