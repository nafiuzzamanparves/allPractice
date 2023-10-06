public class MultipleClassesInSameFile {
    // Single-File Source-Code Program Execution

    /*
     * In JDK 11, Java introduced the ability to launch a single-file source-code
     * program with the java launcher, without first needing to explicitly compile
     * the source code. This works by the java launcher automatically invoking the
     * compiler and storing the compiled code in-memory
     */

    // To run this file use CMD or any command line tool
    // e.g. java .\MultipleClassesInSameFile.java anyArgument
    public static void main(String[] args) {

        if (args.length > 0)
            System.out.println(GenerateMessage.generateMessage(args[0]));
        System.out.println(AnotherMessage.generateAnotherMessage());
    }
}

class GenerateMessage {
    static String generateMessage(String name) {
        return "Here is one message " + name;
    }
}

class AnotherMessage {
    static String generateAnotherMessage() {
        return "Here is another message";
    }
}
