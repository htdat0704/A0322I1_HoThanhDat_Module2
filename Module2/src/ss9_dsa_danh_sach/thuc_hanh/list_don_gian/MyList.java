package ss9_dsa_danh_sach.thuc_hanh.list_don_gian;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY =10;
    private Object elements[];

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    private void ensureCapa(){
        int newSize = elements.length*2;
        elements = Arrays.copyOf(elements, newSize);
    }

    public void add(E e){
        if(size == elements.length){
            ensureCapa();
        }
        elements[size++] = e;
    }

    public E get (int i){
        if(i>= size && i<0){
            throw new IndexOutOfBoundsException("Index: "+i+" Size "+i);
        }
        return (E) elements[i];
    }

    public void set(int index, E e){
        if(size == elements.length){
            ensureCapa();
        }
        for(int i = elements.length-1; i>index; i--){
            elements[i] = elements[i-1];
        }
        elements[index] = e;
    }

    @Override
    public String toString() {
        return "MyList{" +
                "size=" + size +
                ", elements=" + Arrays.toString(elements) +
                '}';
    }
}
