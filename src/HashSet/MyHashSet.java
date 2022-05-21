package HashSet;

import java.util.ArrayList;
import java.util.Arrays;

public class MyHashSet<String> implements MySet<String> {
    ArrayList<String> myArrayList = new ArrayList<>();

    @Override
    public boolean add(String e) {
        // добавить элемент если его ещё нет пройти по листу поискать элемет вернуть true если эл. добавился, проверить тип элемента
        if(!myArrayList.contains(e)){
            myArrayList.add(e);
            return true;
        }
        return false;
    }

    @Override
    public void clear() {
        myArrayList.clear();
    }

    @Override
    public boolean contains(String o) {
       return myArrayList.contains(o);
    }

    @Override
    public boolean isEmpty() {
        return myArrayList.isEmpty();
    }

    @Override
    public boolean remove(String o) {
       // return myArrayList.remove(o) == null;
        if(myArrayList.contains(o))
        {
            myArrayList.remove(o);
            return true;
        }
            return false;
    }

    @Override
    public int size() {
        return myArrayList.size();
    }
    @Override
    @SuppressWarnings("unchecked")
    public String[] toArray() {
        return (String[]) myArrayList.toArray();
    }
    @Override
    public java.lang.String toString() {
        return Arrays.toString(toArray());
    }
}