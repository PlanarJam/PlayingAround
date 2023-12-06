package A;
import java.util.AbstractList;
import java.util.Arrays;
import java.lang.reflect.Array;
public class CollectionArrayList<E> extends AbstractList<E>{
    private int size;
    private E[] genericArray;
    public CollectionArrayList(int size){
        this.size = size;
        this.genericArray = (E[]) Array.newInstance(Object.class, this.size);

    }
    public CollectionArrayList(E[] array){
        this.size = array.length;
        this.genericArray = Arrays.copyOf(array, array.length);
    }
    @Override
    public E get(int index) {
        return (genericArray[index]);
    }
    @Override
    public int size() {
        return (size);
    }
    @Override
    public E set(int index, E element) {
        E previousElement = genericArray[index];
        genericArray[index] = element;
        return (previousElement);
    }
}


