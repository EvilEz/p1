package com.company.FactorialAndFibonacci;

public class MethodsFactorial {


    public void methodLoopTypeFactorial(int n, int loopType) throws InsufficientFundsException {
        switch (loopType) {
            case 1:
                factorialDoWhile(n);
                break;
            case 2:
                factorialWhile(n);
                break;
            case 3:
                factorialFor(n);
                break;
            default:
                throw new InsufficientFundsException("Выбрано неправильное число");
            }
    }


    public int factorialDoWhile (int n) {
        int fact = 1;
        int i = 1;
        int num = n;
        do {
            fact = fact * i;
            i++;
        } while( i <= num );
        return fact;
}


    public int factorialWhile(int n){
        int factorialNumb = n;
        int fact = 1;
        int firstNumbOnFactorial = 1;

        while (firstNumbOnFactorial<=factorialNumb){
            fact = fact * firstNumbOnFactorial;
            firstNumbOnFactorial++;
        }
        return fact;
    }

    public int factorialFor(int n) {
        int factNumb = n;
        int numb1 = 1;

        for (int i = 1; i <=factNumb; i++) {
            numb1 = numb1 * i;
        }
        return numb1;
    }

    public void methodLoopTypeFactorial(int n) {
    }



}

