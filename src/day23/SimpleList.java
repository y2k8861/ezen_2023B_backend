package day23;

import java.util.Arrays;

public class SimpleList<T> {
    Object[] array = new Object[0];
    int size = 0;

    public boolean add(T t){
        this.size++;
        Object[] newArray = new Object[size];
        for(int i = 0; i<this.array.length; i++){
            newArray[i] = this.array[i];
        }
        newArray[newArray.length-1] = t;
        this.array = newArray;
        return true;
    }

    public boolean remove(int index){
        this.size--;
        Object[] newArray = new Object[size];
        int j = 0;
        for(int i=0; i<this.array.length; i++){
            newArray[j] = this.array[i];
            System.out.println("j = " + j);
            if(i != index){
                j++;
            }
        }

        this.array = newArray;

        return true;
    }

    public int size(){return this.size;};

    @Override
    public String toString() {
        return "SimpleList{" +
                "array=" + Arrays.toString(array) +
                ", size=" + size +
                '}';
    }
}
