public class main{ //has to be same name as file
    public static void main(String[] args){
        System.out.println("Practicing Java Basics");
        variables();
    }

    static void printMethods(){
        //print() for no \n
        space("Print Methods");
        System.out.println("You don't have to put numbers in quotes: ");
        System.out.println(5);
    }

    static void space(String title){
        String line = "-".repeat(5);
        System.out.println(String.format("\n%s\n%s\n%s\n",line,title,line));
    }

    static void variables(){
        String title = "Variables";
        space(title);
        String[] variable_types = {
            "String: String string = \"I am a string\";", 
            "Int: int integer = 12;", 
            "Float: float floatNum = 3.145f;", 
            "Char: char letter = 'S';",
            "Bool: boolean bool = true;"
        };
        
        System.out.println("Look in source code for variables init: ");
        for (int i = 0; i < variable_types.length; i++){
            System.out.println(variable_types[i]);
        }
        int integer = 12;
        float floatNum = 3.145f;
        char letter = 'S'; //single quote for chars
        boolean bool = true;

        //delcaring multiple vars
        System.out.println("You can declare multiple variables in one line: \nString a = \"A\", b = \"B\", c = \"C\";");
        String a = "A", b = "B", c = "C";

        int x, y, z;
        x = y = z = 1;

        System.out.println("Using byte to save memory when storing numbers: -128 to 127");
        byte small_num = 120;

        System.out.println("Use short for numbers smaller than int, long for numbers bigger than int\nShort: -32768 to 32767\nLong: (Very large)");
        short short_num = 32766; //-32768 to 32767
        long long_num = 12345678912345L; // -9223372036854775808 to 9223372036854775807 and has to end in L to cast it to long

        float float_num = 1.23f; //floats end in f
        double double_num = 12.98; //double end in d
    }
}
