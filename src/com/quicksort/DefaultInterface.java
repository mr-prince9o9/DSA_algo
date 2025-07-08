package com.quicksort;

public interface DefaultInterface {

    public default void getMessage()
    {
        System.out.println("myname is khan");
    }

    public static void main(String[] args) {

    DefaultInterface obj=new DefaultInterface() {
        @Override
        public void getMessage() {
            System.out.println("the interface is in i need for the implementation"
                    );
        }
    };
    obj.getMessage();

ChildDfaultMethod obChild=new ChildDfaultMethod();
obChild.getMessage();
        System.out.println("hello");
    }

}
