package com.nafiuzzaman.allPractice.customAnnotation;

import com.nafiuzzaman.allPractice.utils.JsonSerializationException;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Slf4j
public class TestCustomAnnotation {

    @Test
    public void givenObjectSerializedThenTrueReturned() throws JsonSerializationException {
        Person person = new Person("nafiuzzaman", "parves", "27");
        ObjectToJsonConverter serializer = new ObjectToJsonConverter();
        String jsonString = serializer.convertToJson(person);
        // log.info(jsonString);
        Assertions.assertEquals(
                "{\"firstName\":\"Nafiuzzaman\",\"lastName\":\"Parves\",\"age\":\"27\"}",
                jsonString);

    }
}
