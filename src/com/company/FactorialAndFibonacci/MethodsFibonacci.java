package com.company.FactorialAndFibonacci;

public class MethodsFibonacci {


    public void methodLoopTypeFibonacci(int loopType, int n) throws InsufficientFundsException {

        switch (loopType) {
            case 1:
                fibonacciDoWhile(n);
                break;
            case 2:
                fibonacciWhile(n);
                break;
            case 3:
                fibonacciFor(n);
                break;
            case 4:
                throw new InsufficientFundsException("Выбрано неправильное число");
        }
    }



public int fibonacciDoWhile(int n) {
    int firstNumb = 0;
    int twoNumb = 1;


    do {
        n = firstNumb + twoNumb;
        System.out.print(n + " ");

        twoNumb = firstNumb;
        firstNumb = n;


    } while (firstNumb <= 100);
    return 0;
}
    public int fibonacciWhile(int n) {
        int count = n, num1 = 0, num2 = 1;
        System.out.print("Fibonacci Series of "+count+" numbers:");

        int i=1;
        while(i<=count)
        {
            System.out.print(num1+" ");
            int sumOfPrevTwo = num1 + num2;
            num1 = num2;
            num2 = sumOfPrevTwo;
            i++;
        }
return 0;
    }

public int fibonacciFor(int n) {
    int count = n, num1 = 0, num2 = 1;
    System.out.print("Fibonacci Series of "+count+" numbers:");

    for (int i = 1; i <= count; ++i)
    {
        System.out.print(num1+" ");
        
        int sumOfPrevTwo = num1 + num2;
        num1 = num2;
        num2 = sumOfPrevTwo;
    }
    return 0;
}
}
