package ss9_dsa_danh_sach.thuc_hanh.LinkedList;

import java.util.Arrays;

public class MyList <E> {
    public int size =0;
    public static final int DEFAULT_SIZE = 10;
    private Object elements[];

    public MyList(){
        elements = new Object[DEFAULT_SIZE];
    }

    private void ensureCapa(){
        int newSize = elements.length*2;
        elements = Arrays.copyOf(elements,newSize);
    }

    public void add(int index, E e){
        if(size == elements.length){
            ensureCapa();
        }
        for(int i = elements.length-1; i>index; i--){
            elements[i] = elements[i-1];
        }
        elements[index] = e;
        size++;
    }

    public void addFirst(E e){
        if(size == elements.length){
            ensureCapa();
        }
        for(int i = elements.length-1; i>0; i--){
            elements[i] = elements[i-1];
        }
        elements[0] = e;
        size++;
    }

    public E get(int index){
        if(index <0 || index > size){
            throw new IndexOutOfBoundsException("Index: "+index+" Size"+size);
        }
        return (E) elements[index];
    }
}
