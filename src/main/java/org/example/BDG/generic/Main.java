package org.example.BDG.generic;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        String[] strArray = {"a", "b", "c", "d", "e"};
        System.out.println("До изменения ");
        System.out.println(Arrays.toString(intArray));
        System.out.println(Arrays.toString(strArray));
        exchange(intArray, 1, 3);
        exchange(strArray, 2, 4);
        System.out.println("После изменения");
        System.out.println(Arrays.toString(intArray));
        System.out.println(Arrays.toString(strArray));
        Gen7();

    }

    public static <T> void exchange(T[] array, int i, int j) {
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;

    }/* 2 задание
        Will the following class compile? If not, why?
        public final class Algorithm {
        public static <T> T max(T x, T y) {
                return x > y ? x : y;
                }
        }

        Неверно так как оператор не может использовать неизвестный тип данных
        и чтобы использовать в даном методе оператор сравнения
        нужно использовать интерфейс Comparable который позволяет сравнивать
        объекты на основе их значений
        И нужно изменить метод max() таким образом чтобы параметр типа <T> ограничивался интерфейсом Comparable
        исправленный вид будет иметь такой вид

        public final class Algorithm{
            public static <T extends Comparable<T>> T max(T x, Ty){
                return x.compareTo(y) > 0? x:y;

        3 задание
        Will the following method compile? If not, why?
        public static void print(List<? extends Number> list) {
            for (Number n : list)
            System.out.print(n + " ");
            System.out.println();
        }

     Да, так как Widcard 'List<? extends Number> list'
     означает что метод может принимать любой из типов списка List
      при расширении extends класс Number или же сам является классом
      Number.
*/
    public static <T> int Generic7(Collection<T> collection, Predicate<T> property) {
        int count = 0;
        for (T element : collection) {
            if (property.test(element)) {
                count++;
            }
        }
        return count;
    }
    public static void Gen7(){
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        int count = Generic7(numbers, n -> n % 2 != 0);
        System.out.println(count);
    }
}
