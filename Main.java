import java.util.LinkedList;

class Node {
    String value;
    Node next;

    public Node(String value) {
        this.value = value;
    }
}

class MyLinkedList {
    Node head;

    public void addLast(String value) {
        if (head == null) {
            head = new Node(value);
        } else {
            Node tmp = head;
            while (tmp.next != null) {
                tmp = tmp.next;
            }
            Node newNode = new Node(value);
            tmp.next = newNode;
        }
    }

    public void addStart(String value){
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;
    }


    public void print() {
        Node tmp = head;
        while (tmp != null) {
            System.out.print(tmp.value + " ");
            tmp = tmp.next;
        }
        System.out.println();
    }

    public int indexOf(String value){//Farid
        Node tmp = head;
        int index = 0;
        while (tmp!=null){
            if (tmp.value.equals(value)){
                return index;
            }
            tmp = tmp.next;
            index++;
        }

        return -1;
    }

    public int size(){
        Node tmp = head;
        int size = 0;
        while (tmp!=null){
            size++;
            tmp = tmp.next;
        }
        return size;
    }


    public String removeLast(){
        if (head==null) return null;
        if (head.next==null){
            String removed =head.value;
            head = null;
            return removed;
        }

        Node tmp = head;
        while (tmp.next.next!=null){
            tmp = tmp.next;
        }
        String removed = tmp.next.value;
        tmp.next = null;
        return  removed;
    }

    //-10
    public void add(int index , String value) throws Exception {
        int size = size();

        if (index<0 || index>size)
            throw new Exception("Index bolse size libo mense 0");

        if (index ==0){
            addStart(value);
            return;
        }

        if (index==size){
            addLast(value);
            return;
        }

        Node tmp = head;
        for (int i = 0; i < index-1; i++) {
            tmp = tmp.next;
        }

//        Node node = new Node();//1
//        Node node = new Node(value);//2
        Node node = new Node(value);
        node.next =  tmp.next;//999-> 20
        tmp.next = node;
    }

//  +  public void addLast(String value);  DOBAV V KONEC
//  +  public void print();  NAPECATAY VES LINKEDLIST
//  +  public void addStart(String value); DOBAV V NACALO

    //---------------------------------------------------------------------------

//  +  public int size(); VERNI RAZMER (SKOLKO NODE)
//  -  public boolean contains(String value); // ESLI EST VERNET TRUE ESLI NET FALSE
//  +  public int indexOf(String value);  VOZVRAWAET INDEX DANNOQO ELEMENTA ELSI NETU -1
//  -  public String get(int index); VOZVRAWAET SAM ELEMENT  ELSI NETU THROW NEW EXCEPTION(VI VISLI ZA RAZMER)
//  +  public void add(int index , String value);// DOBAVIT NODE V UKAZANNIY INDEX

    //---------------------------------------------------------------------------

//  -  public void clear();                        ocisaet linked list
//  -  public boolean isEmpty();                   vozvrasaet true esli linked list pustoy inace false
//  -  public String removeFirst();                udalyayet perviy element i vozvrasaet eqo
//  +  public String removeLast();                 udalyayet posledniy element i vozvrasaet eqo
//  -  public String getFirst();                   vernut perviy element
//  -  public String getLast();                    vernut posledniy element
//  -  public String remove(int index);            udalyayet po indeksu i vozvrasaet udalyayemiy obyekt
//  -  public String remove(String value);         udalyayet po znaceniyu i vozvrasaet udalyayemiy obyekt
//  -  public void set(int index,String value);    zameni znacenie ukazannoqo index na value

    //****  ---------------------------------------------------------------------------

//  -  public void sort();                         sortiruet elementi po (vozrastaniyu / ubbivaniyu)
//  -  public void reverse();                      povoracivaet elementi naoborot

    //---------------------------------------------------------------------------
}
public class Main {
    public static void main(String[] args) {

        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addLast("Farid");
        myLinkedList.addLast("David");
        myLinkedList.addLast("Oleq");
        myLinkedList.addLast("Mawa");
        myLinkedList.print();
        try {
            myLinkedList.add(2,"999");
        } catch (Exception e) {
            System.out.println("Ne dobavil " + e.getMessage());
        }
        myLinkedList.print();


//        myLinkedList.addLast("Dima");
//        myLinkedList.addLast("BTC");
//        myLinkedList.addLast("COIN");
//        myLinkedList.addStart("999");
//        myLinkedList.addStart("1000");
//        myLinkedList.addStart("00");
//        myLinkedList.print();//Farid
//        System.out.println(myLinkedList.size());//10
//        System.out.println(myLinkedList.removeLast());////Farid
//        System.out.println(myLinkedList.size());//9
//        myLinkedList.print();
//        System.out.println(myLinkedList.indexOf("00"));
//        System.out.println(myLinkedList.size());//10
//        System.out.println(myLinkedList.size());//0


//        LinkedList<String> linkedList = new LinkedList<>();
////        linkedList.addFirst("1");
////        linkedList.addFirst("2");
////        linkedList.addFirst("3");
////        linkedList.addLast("1");
////        linkedList.addLast("2");
////        linkedList.addLast("3");
////        linkedList.add("4");
////        linkedList.add(0,"999");
//        linkedList.remove(0);
//        linkedList.remove("Farid");
//        linkedList.removeFirst();
//        linkedList.removeLast();
//        linkedList.contains("999");
//        linkedList.get(0);
//        linkedList.getFirst();
//        linkedList.getLast();
//        linkedList.clear();
//        linkedList.isEmpty();


//        for (String value : linkedList){
//            System.out.print(value + " ");
//        }

    }
}