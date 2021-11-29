/*
String builder is a special kind of class which allows user to make a sting type object out side the string pool.
Ever changes performed on the object of the String builder is going to affect the orignal item where in the case of string
for every elemnt another object is created.
*/
package String;

import java.lang.*;

public class ExampleOfStringBulider {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < 26; i++) {
            builder.append((char)('a' + i));
        }

        System.out.println(builder.toString());
    }
    
}
