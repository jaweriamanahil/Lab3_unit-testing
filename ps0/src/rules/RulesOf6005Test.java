package rules;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * JUnit tests for RulesOf6005.
 */
public class RulesOf6005Test {
    
    /**
     * Test when code is not written by yourself and is not cited, 
     * but it is publicly available and written as non-coursework.
     */
    @Test
    public void testUnCitedPublicCode() {
        assertFalse("Expected false: un-cited publicly available code not written as course work",
                RulesOf6005.mayUseCodeInAssignment(false, true, false, false, false));
    }

    /**
     * Test when the code is written by yourself and required in the assignment.
     */
    @Test
    public void testSelfWrittenRequiredCode() {
        assertTrue("Expected true: self-written required code",
                RulesOf6005.mayUseCodeInAssignment(true, false, true, true, true));
    }
    
    /**
     * Test when code is publicly available, cited, written as coursework, but not required.
     */
    @Test
    public void testPubliclyAvailableCitedNotRequiredCode() {
        assertFalse("Expected false: code not required in the assignment",
                RulesOf6005.mayUseCodeInAssignment(false, true, true, true, false));
    }

}