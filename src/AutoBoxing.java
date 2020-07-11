import java.util.ArrayList;

class Autoboxing {
    public static void main(String[] args) {
        char ch = 'a';
        char ch1;
        int in = 10;

        // Autoboxing- primitive to Character object conversion
        Character a = ch;

        //boxing
        Character b = new Character('b');

        ch1 = a;
        System.out.println(ch1);

        Integer i = in;

        ArrayList <Integer> arrayList = new ArrayList<Integer>();

        // Autoboxing because ArrayList stores only objects
        arrayList.add(25);

        // printing the values from object
        System.out.println(arrayList.get(0));
    }
}



