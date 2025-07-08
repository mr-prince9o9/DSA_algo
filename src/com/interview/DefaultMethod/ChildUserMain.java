package com.interview.DefaultMethod;

interface Sample
{
    void setPayment(int payment);
    public default void getTransaction(String transcation)
    {
        System.out.println("transaction of the userr payment "+transcation);

    }
}


class User1 implements Sample
{


    @Override
    public void setPayment(int payment) {
        System.out.println("the payment of the purchased product ");
    }



}





public class ChildUserMain {

    public static void main(String[] args) {
        User1 obj=new User1();
        obj.setPayment(3000);
        obj.getTransaction("S100bbsdv");
    }

}
