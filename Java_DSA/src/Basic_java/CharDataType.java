package Basic_java;

public class CharDataType {
    public static void main(String[] args) {

        char x = 'a';
        System.out.println(x);

//        ASCII values a-97 to z-122 or A-66 to Z-90 and 0-48 to 9-57

//   typecasting- convert one data type to another data type
        char ch = 'A';
        int y = ch; //implicit typecasting
        System.out.println(y);

        char piyush = 'a';
        int z= (int)piyush; //explicit type casting
        System.out.println(z);

        char harsh ='3';
        System.out.println((int)harsh);

        char ab= 'b';
        System.out.println(ab+0);


//        integer to character

        int ca = 35;
        char ba = (char) ca;
        System.out.println(ba);


    }
}
