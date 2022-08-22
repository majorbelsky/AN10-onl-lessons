package lesson11.Part2;

public class MainClass {
    public static void main(String[] args) {
        MyArrayList<Integer> myArrList = new MyArrayList<>();
        myArrList.add(10);
        myArrList.add(20);
        myArrList.add(30);
        myArrList.add(40);
        myArrList.add(50);
        myArrList.remove(3);
        myArrList.remove(Integer.valueOf(50));
        System.out.println(myArrList.get(2));
        System.out.println(myArrList.isContains(20));
        myArrList.clearAll();
    }
}
