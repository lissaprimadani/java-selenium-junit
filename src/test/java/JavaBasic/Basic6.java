package JavaBasic;

public class Basic6 {
    public static void main(String[] args) {
        //Contoh type data bukan premitif awalan huruf besar//
        Integer IniInteger = 100;

        //Contoh type data premitif awalan huruf kecil//
        int iniInteger = 100;


        //contoh konversid data, kalau type data sama.. bisa langsung dipanggil//
        Integer iniObject = iniInteger;

        //Kalau type data berbeda, ada cara khusus konversi//
        short iniShort = iniObject.shortValue();
        long iniLong = iniObject.longValue();
        float iniFloat = iniObject.floatValue();
    }

}
