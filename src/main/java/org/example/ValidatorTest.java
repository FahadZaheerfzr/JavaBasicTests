package org.example;

public class ValidatorTest {
    private static final String TEST_ONE = "Valid username";
    private static final String TEST_TWO = "Invalid username";
    private static final String TEST_THREE = "Empty username";
    private static final String TEST_Four = "Null username";
    private static final String SUCCESSFUL = " was successful";
    private static final String FAILED = " has failed";

    /**
     * Success only if true (valid) is returned
     */
    public static void testValidNames(){
        if (Validator.validateUsername("fahad@19")){
            testLogger(TEST_ONE, SUCCESSFUL);
        }else{
            testLogger(TEST_ONE, FAILED);
        }
    }

    /**
     * Success only if false (invalid) is returned
     */
    public static void testInvalidNames(){
        if (!Validator.validateUsername("fahad.zaheer19")) testLogger(TEST_TWO, SUCCESSFUL);
        else testLogger(TEST_TWO, FAILED);

        if (!Validator.validateUsername("")) testLogger(TEST_THREE, SUCCESSFUL);
        else testLogger(TEST_THREE, FAILED);

        if (!Validator.validateUsername(null)) testLogger(TEST_Four, SUCCESSFUL);
        else testLogger(TEST_Four, FAILED);
    }


    private static void testLogger(String testName, String result){
        System.out.println("Test " + testName + result);
    }
}
