package com.company.FactorialAndFibonacci;

public class ChoiceOfMethod {

    MethodsFactorial methodsFactorial;
    MethodsFibonacci methodsFibonacci;
    InsufficientFundsException insufficientFundsException;

    public void ChoiceMethod (int algorithmId, int n, int loopType) throws InsufficientFundsException {
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

