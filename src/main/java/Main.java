
public class Main {


    public static void main(String[] args) {

/*Создаем массив*/
        String[][] MyExeptionArray;
        MyExeptionArray = new String[4][4];
        for (int i = 0; i < MyExeptionArray.length; i++) {
            for (int j = 0; j < MyExeptionArray.length; j++) {
                MyExeptionArray[i][j] = "1";
            }
        }
/*Задаем "неверный" элемент массива для проверки*/
        /*MyExeptionArray[3][1] = "ghj";*/

/*Обработчик исключений MyArraySizeExeption и MyArrayDataExeption*/
        try {
            Array(MyExeptionArray);
        } catch (MyArraySizeExeption e) {
            System.out.println(e.getMessage());
        } catch (MyArrayDataExeption e) {
            System.out.println(e.getMessage());
        }

    }

/*Метод преобразования элементов массива и подсчета их суммы*/

    public static void Array(String[][] MyExeptionArray) {
        int a = 0;
        if (MyExeptionArray.length != 4) {
            throw new MyArraySizeExeption("Неверная длина массива. Размер массива должен быть 4х4");
        } else {
            for (int i = 0; i < MyExeptionArray.length; i++) {
                for (int j = 0; j < MyExeptionArray.length; j++) {
                    try {
                        int c = Integer.parseInt(MyExeptionArray[i][j].trim());
                        a = a + c;
                    } catch (NumberFormatException e) {
                        throw new MyArrayDataExeption("Неверные данные в ячейке [" + i + "][" + j + "]");
                    }
                }
            }
        }
        System.out.println("сумма элементов массива " + a);
    }
}









