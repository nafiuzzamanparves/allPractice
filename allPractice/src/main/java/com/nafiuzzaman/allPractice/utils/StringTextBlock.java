package com.nafiuzzaman.allPractice.utils;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class StringTextBlock {
    /**
     * Character \ means that the line feed will be escaped (If not understood just run the code)
     * There can not be any space after \ as we will get compiler error
     * we can use escape character as well.
     * e.g. we can use " and also \" which is essentially same
     * Use \s to preserve the trailing whitespaces
     * if we don't use the \s at the end of the line compiler will remove trailing whitespaces
     * we can check that with printTextBlockEachLine() method
     */
    static String htmlFrom = """
            <form>
              <label for="fname">First name:</label><br>\
              <input type="text" id="fname" name="fname"><br>
              <label for="lname">Last name:</label><br>
              <input type="text" id="lname" name="lname">
            </form>                                     \s
            """;

    static String format = "| %6.3f | %6.3f |";
    static String formatted = format.formatted(Math.PI, Math.E);

    public static String printFormatted() {
        log.info("Formatted String is {}", formatted);
        return formatted;
    }

    public static void printTextBlock() {
        log.info(htmlFrom);
    }

    public static void printTextBlockEachLine() {
        htmlFrom.lines()
                .map(s -> "|" + s + "|")
                .forEach(System.out::println);
    }
}
