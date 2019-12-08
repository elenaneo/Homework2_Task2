import java.util.Arrays;

public class MyArray {
    int [] intArray;

    //конструктор
    public MyArray (int[] intArray)
    {
        this.intArray= intArray;
    }
    //функция по добавлению в конец массива значения int
    void insertElEnd(int value)
    {
        intArray  = Arrays.copyOf(intArray, intArray.length + 1);
        intArray[intArray.length - 1] = value;

        //this.intArray=intArray;
        //return intArray;
    }
    //функция по добавлению в позицию pos значения int
    void insertEl (int value, int pos)
    {
        int[] resArray =new int[intArray.length+1];

        if (pos==0) {
            resArray[pos] = value;
            }
        else{
        for(int i=0;i<pos-1;i++)
        {
            resArray[i]=intArray[i];
        }
        resArray[pos-1]=value;}
        for(int i=pos;i<resArray.length;i++)
        {
            resArray[i]=intArray[i-1];
        }
       intArray=resArray;
    }
    // функция по возврату длины массива
    int returnLen ()
    {
        int res=0;
        for(int i=0;i<intArray.length;i++)
        {
            res=++res;
        }
        return res;
    }


  // функция удаления элемента массива по индексу
  void deleteEl ( int pos)
  {
      int[] resArray =new int[intArray.length-1];
      //resArray  = Arrays.copyOf(intArray, intArray.length + 1);
      if (pos>1) {
          for (int i = 0; i < pos-1; i++) {
              resArray[i] = intArray[i];
          }
      }
      for(int i=pos;i<intArray.length;i++)
      {
          resArray[i-1]=intArray[i];
      }
      intArray= resArray;
  }

    // именение элемента массива по его индексу
   void editArr (int value, int pos)
   {
       intArray[pos]=value;
       //return  intArray;
   }

    //функция вывода на экран всего массива
    void printArr (int[] intArray)
    {
        System.out.println(Arrays.toString(intArray));
    }

    //функция сортировки массива sort=true - по возрастанию
    void sortArray ( boolean sort ) {
        boolean sorted = false;
        int minimax;
        while (!sorted) {
            sorted = true;
            for (int i = 0 ;i < intArray.length-1; i++) {
                if ((intArray[i] >intArray[i + 1]&sort)
                        || (intArray[i] <intArray[i + 1]&!sort))
                {
                    minimax = intArray[i];
                    intArray[i] = intArray[i + 1];
                    intArray[i + 1] =minimax;
                    sorted = false;
                }
            }
        }
        //return intArray;
    }
    //функция вывода максимального /минимального элемента
    int returnMinMax( boolean max) {
        int indexOfMinMax = 0;
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] > intArray[indexOfMinMax]&max||intArray[i] < intArray[indexOfMinMax]&!max) {
                indexOfMinMax = i;
            }
        }
        return intArray[indexOfMinMax];
    }
    //заполнение массива элементами

    void returnSame (int value)
    {
        for(int i=0;i<intArray.length;i++)
        {
            intArray[i]=value;
        }
        //return intArray;
    }

}
