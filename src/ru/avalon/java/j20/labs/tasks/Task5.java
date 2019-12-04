package ru.avalon.java.j20.labs.tasks;

import ru.avalon.java.j20.labs.Task;
import ru.avalon.java.j20.labs.core.RandomArrayFactory;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * Задание №5.
 *
 * <p>Тема: "Изучение отличия между списками и наборами".
 */
public class Task5 implements Task {

    /**
     * Фабрика, генерирующая массивы чисел случайного характера.
     */
    private final RandomArrayFactory arrayFactory = new RandomArrayFactory();

    /**
     * {@inheritDoc}
     */
    @Override
    public void run() {
        final Integer[] array = arrayFactory.getInstance(20);

        List<Integer> list = new LinkedList<>();
        System.out.println("Task 5: \nВывод коллекции List");
        for (Integer i : array) {
            list.add(i);
            System.out.print(i + " ");
        }
        System.out.println("");
        System.out.println("Вывод коллекции Set");
        Set<Integer> set = new TreeSet<>();
        for (Integer i : array) {
            set.add(i);
            System.out.print(i + " ");
        }

        /**
         * TODO(Студент): Выполните задание №5
         *
         * 1. Проинициализируйте переменные list и set объектами
         *    подходящих классов.
         *
         * 2. В обе коллекции поместите элементы массива array.
         *
         * 3. С использованием отладчика проверьте корректность
         *    выполнения задания.
         */
    }
}
