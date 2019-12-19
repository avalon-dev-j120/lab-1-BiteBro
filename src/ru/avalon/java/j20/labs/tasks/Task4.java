package ru.avalon.java.j20.labs.tasks;

import ru.avalon.java.j20.labs.Task;
import ru.avalon.java.j20.labs.models.Person;

/**
 * Задание №4.
 *
 * <p>Тема: "Методы класса {@link Object}".
 */
public class Task4 implements Task {

    /**
     * {@inheritDoc}
     */
    @Override
    public void run() {
        Person a = new Person("Иван", "Иванов");
        Person b = new Person("Иваныч", "Иванов");
        Person c = new Person("Иван", "Иванов");

        boolean isEqual = a.equals(b);
        boolean isEqual2 = a.equals(c);

        System.out.println("Task 4");
        System.out.println(isEqual);
        System.out.println(isEqual2);

        System.out.println("+++++++++++++++++++++++++++++++++++++++");
        /*
         * TODO(Студент): Выполните задание №4
         *
         * 1. С использованием отладчика проверьте, что
         *    сравнение объектов класса Person выполняется
         *    некорректно.
         *
         * 2. Переопределите в классе Person методы equals и
         *    hashCode.
         *
         * 3. С использованием отладчика проверьте что сравнение
         *    объектов типа Person выполняется корректно.
         */
    }
}
