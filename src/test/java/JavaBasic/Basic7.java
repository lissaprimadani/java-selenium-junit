package JavaBasic;

public class Basic7 {
    public static void main(String[] args) {
        //contoh create array dengan cara satu//
        String[] arrayString;
        arrayString = new String[3];

        //contoh create array dengan cara dua//
        String[] stringArray2 = new String[3];

        //Mengisi array pertama//
        arrayString[0] = "Avanza";
        arrayString[1] = "Rush";
        arrayString[2] = "Terios";

        System.out.println(arrayString[2]);
        System.out.println(arrayString[1]);
        System.out.println(arrayString);

    }
}
