public class StringManipulation {
    public static void main(String[] args) {
        // kom ihåg att strängar börjar på 0 precis som en array
        String birthDate = "21/09/1985";
        // start index
        int startingIndex = birthDate.indexOf("1985");
        //System.out.println("Starting index: " + startingIndex);

        //System.out.println("Birth year: " + birthDate.substring(startingIndex));

        /*String str = "Java is a programming language";
        System.out.println(str.substring(0, 4));*/

        //System.out.println("Month: " + birthDate.substring(3, 5));

        // join()
        String newDate = String.join("/", "21", "09", "1985");
        //System.out.println("newDate: " + newDate);

        // concat()
        newDate = "21";
        newDate = newDate.concat("/");
        newDate = newDate.concat("09");
        newDate = newDate.concat("/");
        newDate = newDate.concat("1985");
        //System.out.println("newDate concat: " + newDate);

        newDate = "21" + "/" + "09" + "/" + "1985";
        //System.out.println("neDate +: " + newDate);

        // method chaining
        newDate = "21".concat("/").concat("09").concat("/").concat("1985");
        //System.out.println("newDate: " + newDate);

        // ersätta en del av en sträng
        //System.out.println(newDate.replace("/", "-"));

        // ersätt första
        //System.out.println(newDate.replaceFirst("/", "-"));
        //System.out.println(newDate.replaceAll("/", "---"));

        // repetera en sträng
        System.out.println("ABC\n".repeat(3).indent(2));
        System.out.println("-".repeat(20));


























    }
}
