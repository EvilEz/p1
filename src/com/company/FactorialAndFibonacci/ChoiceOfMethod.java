package com.company.FactorialAndFibonacci;

public class ChoiceOfMethod {
    public static void main(String[] args) throws InsufficientFundsException {
        ChoiceOfMethod choiceOfMethod = new ChoiceOfMethod();
        int n = 5;
        int algorithmId = 1;
        int loopType = 1;
        choiceOfMethod.ChoiceMethods(n, algorithmId, loopType);
    }



    MethodsFactorial methodsFactorial = new MethodsFactorial();
    MethodsFibonacci methodsFibonacci = new MethodsFibonacci();
    InsufficientFundsException insufficientFundsException;
    public void ChoiceMethods(int n, int algorithmId, int loopType) throws InsufficientFundsException {
        //выбираем метод через условие и передаем n
        if ( algorithmId == 1) {
            methodsFactorial.methodLoopTypeFactorial(n,loopType);
           }
        if ( algorithmId == 2){
            methodsFibonacci.methodLoopTypeFibonacci(n,loopType);
        }
        else {
            throw new InsufficientFundsException("Выбрано неправильное число");
        }
    }
        }

