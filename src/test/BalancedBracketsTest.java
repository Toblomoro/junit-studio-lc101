package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

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
    public void reversedBrackets() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }
    @Test
    public void wrongBrackets() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("{silly goose these are not brackets}"));
    }

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }


}
