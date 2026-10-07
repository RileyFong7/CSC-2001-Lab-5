public class AStack {
    String[] array;
    int size;
    public AStack(String[] array, int size){
        this.array = array;
        this.size = size;
    }
    public boolean equalElts(AStack arr1){
        if (this.size != arr1.size){
            return false;
        }
        for (int i=0; i < arr1.size; i++){
            if (arr1.array[i] != array[i]){
                return false;
            }
        }
        return true;
    }
    public boolean equals(Object o){
        switch (o) {
            case AStack arr1:
                if ((arr1.array.length == this.array.length) && equalElts(arr1)) {
                    return true;
                } else {
                    return false;
                }
            case null, default:
                return false;
        }
    }
    public static AStack empty_stack(){
        return new AStack(new String[7], 0);
    }
    public void push(String string){
            if (this.size >= this.array.length){
                grow();
            }
        this.array[this.size] = string;
        this.size += 1;
    }
    public String pop(){
        if (size == 0){
            throw new ArrayIndexOutOfBoundsException("No items in stack.");
        }
        size -=1;
        return array[size];
    }
    public String peek(){
        return array[size-1];
    }
    public int size(){
        return size;
    }
    public boolean is_empty(){
        return size == 0;
    }
    public void grow(){
        String[] newarray = new String[array.length*2];
        for (int i=0; i < array.length; i++){
            newarray[i] = array[i];
        }
        this.array = newarray;
    }
    public String toString() {
        for (int i=0; i < this.size; i++){
            IO.println(array[i]);
        }
        return "";
    }
    public static void main(){



    }
}