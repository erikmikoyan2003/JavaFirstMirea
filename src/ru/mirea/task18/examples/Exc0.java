package ru.mirea.task18.examples;

// Пример, когда исключение не обрабатывается
class Exc0 {
    static void sub() {
        int d = 0;
        int a = 10 / d;
    }

    public static void main(String[] args) {
        Exc0.sub();
    }
}
/* Результат трассировки стека стандартного обработчика исключений:
-------------------------------------------------------------------
Exception in thread "Frame.java.java" java.lang.ArithmeticException: / by zero
	at Chapter10.UnhandledExceptions.Exc0.sub(Exc0.java:7)
	at Chapter10.UnhandledExceptions.Exc0.Frame.java.java(Exc0.java:11)
 */