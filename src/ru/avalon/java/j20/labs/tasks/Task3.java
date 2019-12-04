package ru.avalon.java.j20.labs.tasks;

import ru.avalon.java.j20.labs.Task;
import ru.avalon.java.j20.labs.models.Fibonacci;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Задание №3
 *
 * <p>Тема: "Изучение интерфейсов {@link Iterable} и {@link Iterator}".
 */
public class Task3 implements Task {

    @Override
    public void run() {
        Fibonacci fib = new Fibonacci(20);
        Iterator it = fib.iterator();
        int count = 1;
        for (Integer i : fib) {
            System.out.println(count + " :" + it.next());
            count++;
        }
        Iterator it2 = fib.iterator();
        int sum = 0;
        for (Integer i : fib) {
            sum = sum + (int) it2.next();
        }
        System.out.println("сумма равна: " + sum);


        /*
         * TODO(Студент): Выполнить задание №3
         *
         * 1. Завершить описание класса Fibonacci так, чтобы класс
         *    возвращал заданное количество чисел последовательности
         *    Фибоначчи.
         *
         *    Количество чисел последовательности можно указывать
         *    при создании экземпляра класса.
         *
         *    Найти сумму 20 первых чисел последовательности Фибоначчи:
         *
         * 2. Создать экземпляр класса Fibonacci так, чтобы он
         *    возвращал последовательность чисел Фибоначчи длиной
         *    в 20 элементов.
         *
         * 3. Найти сумму полученных значений.
         *
         * 4. С использованием отладчика проверьте корректность
         *    выполнения задания.
         */
    }
}
