package org.fasttrack.tema16.recursivitate;

public class Methods {
    public int sumOfFirstEvenIntegers(int n) {
        if (n == 1) {
            return 2;
        } else {
            return n * 2 + sumOfFirstEvenIntegers(n - 1);
        }
    }

    public int sumOfDigits(int n) {
        if (n < 10) {
            return n;
        } else {
            return n % 10 + sumOfDigits(n / 10);
        }
    }

    public int fibonacci(int n) {
        if (n <= 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
