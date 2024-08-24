package com.onkonfeton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class StringUtilsTest {

    StringUtils utils = new StringUtils();


    @Test
    public void testIsPositiveNumber_withPositiveInteger_shouldReturnTrue() {
        assertTrue(utils.isPositiveNumber("123"));
    }

    @Test
    public void testIsPositiveNumber_withPositiveDecimal_shouldReturnTrue() {
        assertTrue(utils.isPositiveNumber("123.45"));
    }

    @Test
    public void testIsPositiveNumber_withZero_shouldReturnFalse() {
        assertFalse(utils.isPositiveNumber("0"));
    }

    @Test
    public void testIsPositiveNumber_withNegativeInteger_shouldReturnFalse() {
        assertFalse(utils.isPositiveNumber("-123"));
    }

    @Test
    public void testIsPositiveNumber_withNegativeDecimal_shouldReturnFalse() {
        assertFalse(utils.isPositiveNumber("-123.45"));
    }

    @Test
    public void testIsPositiveNumber_withNullString_shouldReturnFalse() {
        assertFalse(utils.isPositiveNumber(null));
    }

    @Test
    public void testIsPositiveNumber_withEmptyString_shouldReturnFalse() {
        assertFalse(utils.isPositiveNumber(""));
    }

    @Test
    public void testIsPositiveNumber_withNonNumericString_shouldReturnFalse() {
        assertFalse(utils.isPositiveNumber("abc"));
    }

    @Test
    public void testIsPositiveNumber_withWhitespaceString_shouldReturnFalse() {
        assertFalse(utils.isPositiveNumber(" "));
    }

}
