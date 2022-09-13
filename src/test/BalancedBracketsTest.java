package test;

import main.BalancedBrackets;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class BalancedBracketsTest {
//assert True
    String s1 = "[]";
    String s2 = "brackets dont exist";
    String s3 = "[brackets do exist]";
    String s4 = "[brackets] do [exist]";
    String s5 = "][";
//assert false
    String s6 ="[[silly goose these are not brackets]";

    String s7 = "[only 1 bracket does exist";

    String s8 =  "only 1 bracket does exist]";

    String s9 = "{silly goose these are not brackets}";

    String s10 = "(silly goose these are not brackets)";

    String s11 = "[]silly goose there are too many closing brackets]";

    String s12 = "[[silly goose there are too many open brackets]";


    @Test
    public void trueTestValid() {
        ArrayList<String> Tests = new ArrayList<>(Arrays.asList(s1, s2, s3, s4, s5));
        for (String TrueTest : Tests) {
            assertTrue(BalancedBrackets.hasBalancedBrackets(TrueTest));

        }


    }
    @Test
    public void falseTestValid() {
        ArrayList<String> Tests = new ArrayList<>(Arrays.asList(s6, s7, s8, s9, s10, s11, s12));
        for (String FalseTest : Tests) {
            assertFalse(BalancedBrackets.hasBalancedBrackets(FalseTest));

        }
    }
}

/*
@Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }


    @Test
    public void bracketsExist() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("brackets dont exist"));
    }
    @Test
    public void randomBracketedWord() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[brackets do exist]"));
    }
    @Test
    public void manyBrackets() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[brackets] do [exist]"));
    }
    @Test
    public void openBrackets() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[only 1 bracket does exist"));
    }
    @Test
    public void closeBrackets() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("only 1 bracket does exist]"));
    }
    @Test
    public void onlyBracketsReversed() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("]["));
    }
    @Test
    public void wrongOpenBrackets() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[silly goose these are not brackets]" ));
    }
    @Test
    public void wrongCloseBrackets() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[]silly goose these are not brackets]" ));
    }



    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }


}*/
