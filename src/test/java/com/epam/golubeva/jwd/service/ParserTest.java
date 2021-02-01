package com.epam.golubeva.jwd.service;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.*;

public class ParserTest {


    @Test
    public void testParsToList() {

        final String patternString = "\\{[\\d, ]+\\}";

        List<Integer> integers = Parser.parsToList("{8,9,0}", patternString);
        assertTrue(integers.contains(9));
    }
}