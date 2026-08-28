package com.rohan.Exception;

class Main{


    static void main(String[] args){
        int a = 4;
        int b = 0;

        try{
          if(b == 0){
              throw new MyException("This is my error");   //throw keyword is used
                                                      // to make custom exception object
          }
        }
        catch(MyException e){       // in this case we know that the exception
                                            // is an arithmetic exception...
            System.out.println(e);
        }
        System.out.println("This is exception handling syntax...");

    }
}

