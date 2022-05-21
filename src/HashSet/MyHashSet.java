package HashSet;

import java.util.ArrayList;
import java.util.Arrays;

// При наличии MyHashMap реализация тривиальная
public class MyHashSet<String> implements MySet<String> {

    //   private MyHashMap map = new MyHashMap();



    ArrayList<String> myArrayList = new ArrayList<>();
    // просто заглушка
    //  private String placeHolder = "";

    @Override
    public boolean add(String e) {
        // добавить элемент если его ещё нет пройти по листу поискать элемет вернуть true если эл. добавился, проверить тип элемента
        myArrayList.add(e);
        return true;

        //       return map.put(e, placeHolder) == null;
    }

    @Override
    public void clear() {
        myArrayList.clear();
    }

    @Override
    public boolean contains(String o) {
     //   return myArrayList.containsKey(o);
        return true;
    }

    @Override
    public boolean isEmpty() {
        return myArrayList.isEmpty();
    }

    @Override
    public boolean remove(String o) {
       // return myArrayList.remove(o) == null;
        return true;
    }

    @Override
    public int size() {
        return myArrayList.size();
    }
    @Override
    public String[] toArray() {
        return (String[]) myArrayList.toArray();
    }
    @Override
    public java.lang.String toString() {
        return Arrays.toString(toArray());
    }
}