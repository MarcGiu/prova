////////////////////////////////////////////////////////////////////
// GIULIA MARCON 2075541
// SARA FERRARO 2076442
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class IntegerToRomanParameterizedTest {

    private String input;
    private String expectedOutput;

    public IntegerToRomanParameterizedTest(String input, String expectedOutput) {
        this.input = input;
        this.expectedOutput = expectedOutput;
    }

    @Parameters
    public static Collection<String[]> testConditions() {
        String[][] expectedOutputs = {
                { "1", "I" },
                { "2", "II" },
                { "3", "III" },
                { "4", "IV" },
                { "5", "V" },
                { "6", "VI" },
                { "7", "VII" },
                { "8", "VIII" },
                { "9", "IX" },
                { "10", "X" },
                { "11", "XI" },
                { "12", "XII" },
                { "13", "XIII" },
                { "14", "XIV" },
                { "15", "XV" },
                { "16", "XVI" },
                { "17", "XVII" },
                { "18", "XVIII" },
                { "19", "XIX" },
                { "20", "XX" },
                { "40", "XL" },
                { "50", "L" },
                { "59", "LIX" },
                { "90", "XC" },
                { "99", "XCIX" },
                { "100", "C" },
                { "227", "CCXXVII" },
                { "333", "CCCXXXIII" },
                { "400", "CD" },
                { "500", "D" },
                { "555", "DLV" },
                { "690", "DCXC" },
                { "900", "CM" },
                { "999", "CMXCIX" },
                { "1000", "M" }};
        return Arrays.asList(expectedOutputs);
    }

    @Test
    public void testConvertNumbers() {
        assertEquals(expectedOutput,
                IntegerToRoman.convert(Integer.parseInt(input)));
    }

}
