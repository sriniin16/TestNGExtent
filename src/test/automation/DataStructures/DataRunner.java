package DataStructures;

public class DataRunner {

    public static void main(String args[])
    {
        MyList list = new MyList();
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);
        list.insert(6);
        list.insert(7);
        list.insert(8);

        list.show();
        System.out.println("*************");
//        list.get(1);
        list.insertAt(4,12);
        list.show();
//        list.delete(2);
//        System.out.println("*************");
//        list.show();
//        System.out.println("*************");
//        list.insertAtStart(10);
//        list.show();
    }
}
