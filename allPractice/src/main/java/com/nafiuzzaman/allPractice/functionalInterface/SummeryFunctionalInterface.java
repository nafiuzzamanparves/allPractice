package com.nafiuzzaman.allPractice.functionalInterface;

import lombok.extern.slf4j.Slf4j;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * Supplier = () -> {x} does not take anything, returns something <br>
 * Function = (k) -> {v} take something, returns something <br>
 * Predicate = (k) -> {b} takes something, returns boolean <br>
 * Consumer = (p) -> {} take something, does not return anything <br>
 */
@Slf4j
@SuppressWarnings("all")
public class SummeryFunctionalInterface {
    /**
     * A Supplier does not take anything but returns something
     * This can also be replaced by lambda expression
     */
    Supplier<String> supplier = new MySupplier() {
        @Override
        public String get() {
            return "Returned from Supplier";
        }
    };

    /**
     * A Function in Java takes two parameter One type as Input value and other is the expected returned value
     * <p>
     * String - the type of the input to the function
     * Integer - the type of the result of the function
     * <p>
     * This can also be replaced by lambda expression
     */
    Function<String, Integer> function = new MyFunction() {
        @Override
        public Integer apply(String s) {
            return s.length();
        }
    };

    /**
     * Predicate in Java takes a value, perform actions and returns boolean value
     */
    Predicate<String> predicate = new MyPredicate() {
        @Override
        public boolean test(String s) {
            return s.equals("Nafiuzzaman");
        }
    };

    /**
     * Consumer Represents an operation that accepts a single input argument and returns no result
     */
    Consumer<String> consumer = new MyConsumer() {
        @Override
        public void accept(String s) {
            log.info("This message is logged from Consumer implementation");
        }
    };
}
