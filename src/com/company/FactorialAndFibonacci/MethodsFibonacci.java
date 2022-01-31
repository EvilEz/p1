package com.company.FactorialAndFibonacci;

public class MethodsFibonacci {


    public void methodLoopTypeFibonacci(int n, int loopType) throws InsufficientFundsException {
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
            default:
                throw new InsufficientFundsException("Выбрано неправильное число");
        }
    }


public int fibonacciDoWhile(int n) {
    int firstNumb = 0;
    int twoNumb = 1;
    int currVal;


    do {
        currVal = firstNumb + twoNumb;
        System.out.print(firstNumb + " ");

        twoNumb = firstNumb;
        firstNumb = currVal;


    } while (firstNumb <= n-2);
    return 0;
}
    public int fibonacciWhile(int n) {
        int count = n, num1 = 0, num2 = 1;

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

    for (int i = 1; i <= count; ++i)
    {
        System.out.print(num1+" ");
        
        int sumOfPrevTwo = num1 + num2;
        num1 = num2;
        num2 = sumOfPrevTwo;
    }
    return 0;
}

    public void methodLoopTypeFibonacci(int n) {
    }
}
