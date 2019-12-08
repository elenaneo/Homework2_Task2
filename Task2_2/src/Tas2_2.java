public class Tas2_2 {
    public static void main(String [] arg) {
        System.out.println ("Задание2");
        int[] a =new  int[] {1,2,3,4,5};
        MyArray primer =new  MyArray (a);
        primer.printArr(primer.intArray);
        primer.insertElEnd(6);
        primer.printArr(primer.intArray);
        primer.insertEl(7,1);
        primer.printArr(primer.intArray);
        primer.insertEl(8,4);
        primer.printArr(primer.intArray);
        primer.insertEl(9,6);
        primer.printArr(primer.intArray);
        primer.sortArray(true);
        primer.printArr(primer.intArray);
        primer.sortArray(false);
        primer.printArr(primer.intArray);
        System.out.println ("Максимальное значение - "+primer.returnMinMax(true));
        System.out.println ("Минимальное значение - "+primer.returnMinMax(false));
        System.out.println ("Длина массива - "+primer.returnLen());
        primer.deleteEl(2);
        primer.printArr(primer.intArray);
        primer.deleteEl(8);
        primer.printArr(primer.intArray);
        primer.returnSame(2);
        primer.printArr(primer.intArray);
        primer.editArr(8,3);
        primer.printArr(primer.intArray);
    }
}

