package ControlWork1;

public class Main {
    public static void main(String[] args) {
        LinkList<Integer> listInt = new LinkList<>();
            listInt.add(10);
            listInt.add(10);
            listInt.add(10);
            listInt.add(10);
            listInt.add(10);
        LinkList<String> listString = new LinkList<>();
        listString.add("sadasda");
        listString.add("sadasda");
        listString.add("sadasda");
        listString.print();
        listString.remove("sadasda");
        listString.print();
        System.out.println(listString.size());
        listString.removeByIndex(0);
        listString.print();
        System.out.println(listString.size());
        listString.clear();
        System.out.println(listString.size());

    }
}
