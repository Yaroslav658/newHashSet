package HashSet;

import java.util.ArrayList;
import java.util.Arrays;

// При наличии MyHashMap реализация тривиальная
public class MyHashSet implements MySet {

 //   private MyHashMap map = new MyHashMap();

    private ArrayList<String> myArrayList = new ArrayList<String>();
    // просто заглушка
  //  private String placeHolder = "";

    @Override
    public boolean add(String e) {
        // добавить элемент если его ещё нет пройти по листу поискать элемет вернуть true если эл. добавился, проверить тип элемента



 //       return map.put(e, placeHolder) == null;
    }

    @Override
    public void clear() {
        map.clear();
    }

    @Override
    public boolean contains(String o) {
        return map.containsKey(o);
    }

    @Override
    public boolean isEmpty() {
        return map.isEmpty();
    }

    @Override
    public boolean remove(String o) {
        return map.remove(o) == null;
    }

    @Override
    public int size() {
        return map.size();
    }

    @Override
    public String[] toArray() {
        String[] result = new String[map.size()];
        int index = 0;
        for (MyMap.Entry entry : map.toArray()) {
            result[index++] = entry.getKey();
        }
        return result;
    }

    @Override
    public String toString() {
        return Arrays.toString(toArray());
    }


}