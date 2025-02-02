/* public class Main {
    public static void main(String[] args) {
    int x, y, z;
    x = 100;
    y = 100 + 20;
    z = y - 20;
    System.out.println("X = " + x);
    System.out.println("Y = " + y);
    System.out.println("Z = " + z);
    }
}
*/

/*
public class Main {
    public static void main(String[] args) {
        int x, age, z;
        x = 100;
        age = 22;
        z = x / 100;
        System.out.println("Число: " + x + ", возраст: " + age + ", второе число: " + z);

    }
}
*/

/*
public class Main {
    public static void main(String[] args) {
        int z = 5;
        z++;
        int c = ++z;
        System.out.println(c++); //1
        int f = --z;
        System.out.println(++f); //2
        int q = --c + f--;
        System.out.println(q); //3
        System.out.println(f);
    }
}
*/
/*
public class Main {
    public static void main(String[] args) {
        int age = 15;
    if (age >= 18) {
        System.out.println("OK");
    }
    else {
            System.out.println("No");
    }
    }
}
*/
/*
public class Main {
    public static void main(String[] args) {
        boolean money = true;
        String text = "Пришли 100 рублей";

        if (money == true) {
            System.out.println("Друг ");
        } else {
            System.out.println("Должник ");
        }
        System.out.println(text);
    }
}
*/
/*
public class Main {
    public static void main(String[] args) {
       int age = 4;
        System.out.println("Ваш возраст: " + age);
       if (age == 10) {
            System.out.print("Ваша категория: ");
            System.out.print("Ребенок");
        } else if (age >= 18) {
            System.out.print("Ваша категория: ");
            System.out.print("Взрослый");
        } else if (age >= 70) {
            System.out.print("Ваша категория: ");
            System.out.print("Пожилой");
        } else {
            System.out.print("Ни одна категория не подходит!");
        }
    }
}
*/

/*
public class Main {
    public static void main(String[] args) {
        boolean isMan = true;
        int age = 18;
        if (isMan == true && age >= 18) {
            System.out.println(" Взрослый");
        } else {
            System.out.println(" Ребенок");
        }
    }
}
*/
/*
public class Main {
    public static void main(String[] args) {
        boolean isX = true;
        boolean isY = true;
        int age = 10;

        if ((age > 30 && (isY || isX))) {
            System.out.println("X");
        } else {
            System.out.println("Y");
        }
    }
}
*/

/*
public class Main {
    public static void main(String[] args) {
        int age = 10;
        int w = 20;
        boolean isMan = true;

        if (!isMan) {
            System.out.println(1);
            if (w > age || isMan == false) {
                System.out.println(2);
            } else {
                System.out.println(3);
            }
        }else{
            System.out.println(4);
        }
    }
}

 */

/*
public class Main {
    public static void main(String[] args) {
        int num = 4;
        switch (num) {
            case 1:
                System.out.println("Один");
                break;
            case 2:
                System.out.println("Два");
                break;
            case 3:
                System.out.println("Три");
                break;
            case 4:
                System.out.println("Четыре");
                break;
            default:
                System.out.println("Неизвестно");
        }
    }
}

 */

/*
public class Main {
    public static void main(String[] args) {
        char word = 'g';

        switch (word) {
            case 'r':
                System.out.printf("Красный");
                break;
            case 'b':
                System.out.printf("Синий");
                break;
            case 'y':
                System.out.printf("Желтый");
                break;
            case 'g':
                System.out.printf("Зеленный");
                break;
            default:
                System.out.println("Такого цвета нету в базе");

        }
    }
}

 */
/*
public class Main {
    public static void main(String[] args) {
        int a = 1;
        if (a > 0)
            System.out.println("Hello 1");
        System.out.println("Hello 2");
    }
}

 */
/*
public class Main {
    public static void main(String[] args) {
        int x = 50;
        int y = 100;

        System.out.println(
                x > y ? "X= " + x + " больше Y= " + y :
                        x < y ? "y= " + y + " больше X= " + x : "Они равны");
    }
}

 */

// --------  03.11.2024

import java.sql.SQLOutput;
import java.util.Random;

/*
public class Main {
    public static void main(String[] args) {
    for (int i = 1; i < 11; i++) {
        if (i%2==0){
            System.out.println(i + " Четное");
        }else{
            System.out.println(i + " Не четное");
        }
    }
    }
}

 */

/*
public class Main {
    public static void main(String[] args) {
        int num = 10;
        for (int i = 0; i < num; i++) {
            if (i%2==0) {
                i--;
                continue;
            }
            System.out.println(i);
        }
    }
}
 */
/*
public class Main {
    public static void main(String[] args) {
        int count = 10;

        for (int i = 0; i < count; i++) {
            if (count < 0) {
                count = i + i;
                i = i * 10;
            } else {
                i++;
                count++;
            }
            System.out.println(i);
        }
    }
}

 */
/*
public class Main {
    public static void main(String[] args) {
        for (int i = 1; i < 4; i++) {
            System.out.println("******");
        }
    }
}

 */
/*
public class Main {
    public static void main(String[] args) {
        int count = 10;
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < count; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
*/

/*
public class Main {
    public static void main(String[] args) {
        int a = 10;
        boolean b = false;

        if (!b || ++a > 9) {
            System.out.println("Okay");
        }
        System.out.println("A => " + a);
        System.out.println("B => " + b);
    }
}

 */
/*
public class Main {
    public static void main(String[] args) {
        int x = 10;
        int i = 0, j = 0, k = 0;

        while (i<x) {
            j = 0;
            while (j < x - i) {
                if (j==x-i-1) {
                    k = 0;
                    while (k <= i*2) {
                        if ((i == 0 || i == x - 1 || k == 0 || k == i * 2))
                            System.out.println("*");
                        else if ((i > x / 2))
                            System.out.println("*");
                        else
                            System.out.println(" ");
                        k++;
                    }
                } else {
                    System.out.println(" ");
                }
                j++;
            }
            System.out.println();
            i++;
        }
    }
}

 */
/*
public class Main {
    public static void main(String[] args) {
        int[] arr = {-10, -20, -30, -40, 1, 10, 40, 5, 50};
        int max = arr[0];
        int min = arr[0];

        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]){
                max = arr[i];
            }
            if (min > arr[i]){
                min = arr[i];
            }
        }
        System.out.println();
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }
}

 */
/*
public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(arr[2]);
    }
}
*/
/*
public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.println("Iter:" + count);
                System.out.println("Arr["+j+"]=" + arr[j] + " , arr["+(j+1)+"]="+arr[j+1]);
                if (arr[j] > arr[j + 1]) {
                    System.out.println("Делай замену!\n Потому что " + arr[j] + " > cem " + arr[j+1]);
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
                System.out.println();
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
    }
}
*/

/*
//Сортировка чисел
public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 5, -5, 3, -10, -3, -1, 10};
        System.out.println("Положительные:");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                System.out.println(arr[i]);
            }
        }
        System.out.println("Отрицательные:");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                System.out.println(arr[i]);
            }
        }
    }
}

 */

//Подчет 0 в случайных чисел
public class Main {
    public static void main(String[] args) {
        int[] arr = new int[20];
        int count = 0;
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(41);
            System.out.print(count + " ");
            if (arr[i] == 0) {
                count++;
            }
            System.out.println("=> " + count);
        }
    }
}

