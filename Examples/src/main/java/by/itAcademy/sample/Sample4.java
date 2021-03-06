package by.itAcademy.sample;

/* Задание:
1. запустить убедится, что работает.
2. разобраться как работает. (если не получится - не беда, этого я вам не обьяснял)
3. поменять функцию обработчик так, чтобы она выводила еще и информацию, о том делится ли значение i на 3
* */
public class Sample4 {//Сообщаем компилятору что Это класс и мы дали ему имя Sample4
    private static int[] array=new int[]{5,16,22,18,49,68,-3,12,21}; //определяем масив целых чисел с именем array и сразу наполняем его значениями.

    /* Это зарезервированное имя. функция класса с таким именем и параметрами, может быть вызвана из вне JVM, т.е являться точкой входа
    * */
    public static void main (String[] arg){ //Сообщаем компилятору что класс имеет публичный метод, не возвращающий рельтатов, но принимающий в качестве аргументов масив строк.
        for (int i=0;i<array.length;i++){//для цулочисленного i установить значение 0;выполнять блок пока i меньше чем длинна масива array; после каждого исполнения увеличить i на 1
            processNumber(array[i],i);//Вызываем определенную ниже функцию processNumber. Передаем в качестве параметра передаем значение из масива и его номер по порядку
        }
    }

    //определяем функцию не возвращающую результата и принимающую 2 целочисленных параметра
    private static void processNumber(int i,int index){
            System.out.println("Значение масива № "+index+ " равняется "+i);//Достаем системный поток out и вызываем его метод println (напечатать и перевести строку). В качестве аргумента передаем то, что хотим напечатать.
    }

}
