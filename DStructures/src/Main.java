import java.util.*;

/*
        DATA STRUCTURES
* ARRAY : It is a fixed sized in memory data storage.
  String                    String["Index must be defined with this way or ..."]
  Integer[] arrayName = new Integer[] (... = {"Define elements according to the type of Instance"})
  Boolean                   Boolean[]

  * ARRAYLIST (LIST in C#) : Basically it is similar to array but its not fixed size.
                             You can Create, Add, Delete  or Update by using Index of
                             ArrayList.

  *LIKEDLIST : It's like array's and arraylist's cousin. You can only go forwards or backwards
               You cant really access in between. Each index points to the next/previous index
               ( or Nodes ). So each index has a pointer to the next index. If you break the chain,
               you lose the all of the elements afterwards. if you iterate through this chain and you
               dont keep track where you started, you also lose all the elements behind you.

  * HASHMAP : Basically they are sort of Dictionary. It is Key/Value pair data structure. You can
              Store the data according to the key you indicate in HashMap. When you add suited key
              value pair, the data will be stored under the indicated key and counts up the size of
              it according to the amount of the data you store.

  * STACK   : (LIFO) "Last In First Out". The last item that we put in the stack is the last item
              that we pop off the stack.

  * QUEUE   : (FIFO) "First in First Out"

  *





 */

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        String[] ss = {"hey it's a", " ", "it's the last element"};

        var a = ss[2];

        System.out.println(a);

        System.out.println( "Size of String array: " +  ss.length);

        for(var i : ss){ System.out.println(i);}

        List<String> list = new ArrayList<String>();
        list.add("groceries");
        list.add("furnitures");
        list.add("apple");
        list.add("Grape");

        System.out.println("size of v1 List: " + list.size());
        System.out.println("Ingredients of v1 List");
        for(String item: list) {
            System.out.print(item + ", ");
        }
        System.out.println();
        list.remove(2);
        System.out.println("Ingredients of v2 List");
        for(String item: list) {
            System.out.print( item + ", ");
        }
        System.out.println();
        System.out.println("size of v2 List: " + list.size());
        System.out.println(list.size());


        System.out.println("first element of List: " + list.get(2));



        /* LINKEDLIST Example */ // Usually in JAVA there is a LinkList/ListNode Class

        ListNode n4 = new ListNode("Samo", null);
        ListNode n3 = new ListNode("Faso", n4 );
        ListNode n2 = new ListNode("Tato", n3 );
        ListNode n1 = new ListNode("Tirro", n2 );

        ListNode temp = n1;

        ListNode n5 = new ListNode("lipopetti",null);

        while (temp!=null){
            if(temp.next==null){
                temp.next = n5;
                break;
            }

            temp = temp.next;
        }

        System.out.println();
        System.out.println("Inserted lipotetti after" + n1.toString());

        while (temp!=null){
            if(temp.gamer.equals("Tato")){
                n5.SetNext(temp.next);
                temp.SetNext(n5);
            }

            temp = temp.next;
        }
        System.out.println();
        System.out.println("Inserted lipotetti after tato" + n1.toString());


        // HASHMAP //

        HashMap<String,List<String>> continents = new HashMap<String, List<String>>();

        List<String> Asia = new ArrayList<String>(){
            {
                add("Malaysia");
                add("China");
                add("Japan");
                add("Kazakhstan");
            }
        };

        List<String> Europe = new ArrayList<String>(){
            {
                add("France");
                add("Germany");
                add("United Kingdom");
            }
        };

        List<String> Africa = new ArrayList<String>(){
            {
                add("Congo");
                add("Kenya");
                add("Morocco");
                add("Mali");
            }
        };

        List<String> America = new ArrayList<String>(){
            {
                add("Usa");
                add("Mexico");
                add("Canada");
                add("Argentina");
            }
        };

        continents.put("Asia", Asia);
        continents.put("Africa",Africa);
        continents.put("America",America);
        continents.put("Europe",Europe);

        List<String> results = continents.get("America");



        for(String countries : results){
            System.out.println(countries);
        }

    // STACK //

        Stack<String> pantry = new Stack<String>();

        String[] materials = {"Wheat", "Chickpeas", "Haricot"};
        for(var item : materials){
            pantry.push(item);
        }


        for(var material: pantry){
            System.out.println(material);
        }

        System.out.println(pantry.clone());

        for(var material: pantry){
            System.out.println(material);
        }

        // QUEUE

       Queue<String> sira = new LinkedList<String>();

        sira.add("Carol");
        sira.add("BuddyHolly");
        sira.add("Frank Sinatra");
        sira.add("Chuck Berry");

        System.out.println("Queue : " + sira);

        var rem = sira.remove();
        System.out.println(rem);// Carol will be removed

        sira.add("Strome");

        String firstElement = sira.peek();

        System.out.println("Peeked Element of Sira: " + firstElement);

        System.out.println(sira);

    }



    // TREE (BINARY TREE)
    public class Node{
        int value;
        Node left;
        Node right;

        Node(int value){
            this.value = value;
            right = null;
            left = null;
        }
    }

    private Node addRecursive(Node current, int value){
        if (current == null) return new Node(value);
        if (value < current.value){
            current.left = addRecursive(current.left, value);
        } else if (value > current.value){
            current.right = addRecursive(current.right, value);
        } else {
            // value already exist
            return current;
        }

        return current;
    }


    // ALSO We can use this another recursive method For BINARYTREE

    private boolean containesNodeRecursive(Node current, int value){
        if(current==null) return false;

        if(value==current.value) return true;
        return value<current.value
                ?containesNodeRecursive(current.left,value)
                :containesNodeRecursive(current.right,value);
    }



   // LINKED LIST NODES
    public static class ListNode{
        String gamer;
        ListNode next;

        public ListNode(String gamer, ListNode next){
            this.gamer = gamer;
            this.next = next;
        }

        public void SetNext(ListNode node){
            this.next = node;
        }

        public String toString(){
            String result= "";
            ListNode temp = this;
            while(temp!=null){
                result += " [" + temp.gamer +"] ";
                temp = temp.next;
            }
            return result;
        }
    }
}