package PatikaOdev.KendiListemiz;

public class MyList<T> {
    private int capacity;

    private T[] array;

    private int index = 0;

    public MyList() {
        this.capacity = 10;
        this.array = (T[]) new Object[capacity];
    }

    public MyList(int capacity) {
        this.capacity = capacity;
    }

    public void add(T data){
        if(index == capacity){
            this.capacity *= 2;
            T[] newArray = (T[]) new Object[capacity];
            int i = 0;
            for(T item : this.array){
                newArray[i] = item;
                i++;
            }
            this.array = newArray;
            this.capacity = capacity;
        }
        this.array[index] = data;
        index++;
    }
    public T get(int index){
        if(index<this.index){
            return this.array[index];
        }else{
            return null;
        }
    }
    public T remove(int index){
        this.index--;
        if(index<0 || index>this.index){
            return null;
        }else{
            T deletedIndexValue = this.array[index];
            for(int i=index ; i<this.index;i++){
                this.array[i] = this.array[i+1];
            }
            this.array[size()] = null;
            return deletedIndexValue;
        }
    }
    public T set(int index,T data){
        if(index<0 || index>this.index){
            return null;
        }else{
            T setIndexValue = this.array[index];
            this.array[index] = data;
            return setIndexValue;
        }
    }
    public String toString(){
        String text = "[";
        for(int i=0;i<this.index;i++){
                text+= this.array[i]+",";
        }
        text = text.substring(0,text.length()-1);
        text+= "]";
        return text;
    }
    public int indexOf(T data){
        int index;
        for(int i=0;i<size();i++){
            if(this.array[i]==data){
                return i;
            }
        }
        return -1;
    }
    public int lastIndexOf(T data){
        // 10 20 30 20 10
        for(int i = size();i>=0;i--){
            if(this.array[i]==data){
                return i;
            }
        }
        return -1;
    }
    public T[] toArray(){
        return this.array;
    }

    public void clear(){
        this.index = 0;
        this.capacity = 10;
        T[] newArray = (T[]) new Object[this.capacity];
        this.array = newArray;
    }
    public boolean isEmpty(){
        if(index==0){
            return true;
        }else{
            return false;
        }
    }

    public MyList<T> sublist(int start,int finish){
        MyList<T> newMyList = new MyList<>();
        for(int i = start; i<finish; i++){
            newMyList.add(this.array[i]);
        }
        return newMyList;
    }
    public boolean contains(T data){
        for(int i=0;i<size();i++){
            if(this.array[i]==data){
                return true;
            }
        }
        return false;
    }
    public int size(){
        return index;
    }
    public int getCapacity(){
        return capacity;
    }
}
