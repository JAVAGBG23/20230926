public class Strings {
    public static void main(String[] args) {
        String helloWorld = "Hello World";
        /*printInfo("Hello World");
        printInfo("");
        printInfo(" ");
        printInfo("\t   \n");*/
        /*
        System.out.printf("index of r = %d %n", helloWorld.indexOf('r'));
        System.out.printf("index of World = %d %n", helloWorld.indexOf("World"));

        System.out.printf("index of l = %d %n", helloWorld.indexOf('l'));
        System.out.printf("index of l = %d %n", helloWorld.lastIndexOf('l'));

        System.out.printf("index of l = %d %n", helloWorld.indexOf('l', 3));
        System.out.printf("index of l = %d %n", helloWorld.lastIndexOf('l', 8));*/

        String helloWorldLower = helloWorld.toLowerCase();
        // "hello world"
        if (helloWorld.equals(helloWorldLower)){
            System.out.println("Values match exactly");
        }
        if (helloWorld.equalsIgnoreCase(helloWorldLower)) {
            System.out.println("Values match ignoring case");
        }

        if (helloWorld.startsWith("Hello")) {
            System.out.println("String starts with Hello");
        }

        if (helloWorld.endsWith("World")) {
            System.out.println("String ends with World");
        }

        if (helloWorld.contentEquals("Hello World")) {
            System.out.println("Values match exactly");
        }




























    }

    public static void printInfo(String string) {

        int length = string.length();
        System.out.printf("Length = %d %n", length);

        if (string.isEmpty()) {
            System.out.println("String is empty!");
            return;
        }

        if (string.isBlank()) {
            System.out.println("String is blank");
        }
        /*
            %s formats strings.
            %d formats decimal integers.
            %f formats floating-point numbers.
            %b formats booleans.
            %c formats characters.
            %t formats date/time values.
            %n results in the platform-specific line separator.
         */
        System.out.printf("First char = %c %n", string.charAt(0));
        System.out.printf("Last char = %c %n", string.charAt(length - 1));
    }
}
