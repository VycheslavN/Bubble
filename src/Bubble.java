class ArrayBubble{
    private long[] a;
    private int elems;

    public ArrayBubble(int max){
        a = new long[max];
        elems = 0;
    }

    public void into(long value){
        a[elems] = value;
        elems++;
    }

    public void printer(){
        for (int i = 0; i < elems; i++){
            System.out.print(a[i] + " ");
            System.out.println("");
        }
        System.out.println("----Окончание вывода массива----");
    }

    private void toSwap(int first, int second){
        long dummy = a[first];
        a[first] = a[second];
        a[second] = dummy;
    }

    public void bubbleSorter(){//МЕТОД ПУЗЫРЬКОВОЙ СОРТИРОВКИ
        for (int out = elems - 1; out >= 1; out--){
            for (int in = 0; in < out; in++){
                if(a[in] > a[in + 1])
                    toSwap(in, in + 1);
            }
        }
    }
}

class Main {
    public static void main(String[] args) {
        ArrayBubble array = new ArrayBubble(5);

        array.into(100);
        array.into(500);
        array.into(200);
        array.into(400);
        array.into(300);

        array.printer();
        array.bubbleSorter();//ИСПОЛЬЗУЕМ ПУЗЫРЬКОВУЮ СОРТИРОВКУ
        array.printer();
    }
}

