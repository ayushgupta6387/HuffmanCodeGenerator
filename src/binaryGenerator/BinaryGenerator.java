/*
 *   Created by IntelliJ IDEA Ultimate, 2020
 *   User: dbc2201
 *   Date: 28/02/20
 *   Time: 4:15 PM
 */

package binaryGenerator;

public class BinaryGenerator {
    private String userInputStringInLowerCase;

    public BinaryGenerator(String userInputStringInLowerCase) {
        this.userInputStringInLowerCase = userInputStringInLowerCase;
    }

    public String getUserInputStringInLowerCase() {
        return userInputStringInLowerCase;
    }

    public void setUserInputStringInLowerCase(String userInputStringInLowerCase) {
        this.userInputStringInLowerCase = userInputStringInLowerCase;
    }

    public String convertNormalStringToBinaryString() {
        StringBuilder stringBuilder = new StringBuilder();
        userInputStringInLowerCase = userInputStringInLowerCase.toLowerCase();
        for (int i = 0; i < userInputStringInLowerCase.length(); i++) {
            int asciiValue = userInputStringInLowerCase.charAt(i);
            String convert = Integer.toBinaryString(asciiValue);
            int remaining = 8 - convert.length();
            String append = "0".repeat(remaining) + convert;
            stringBuilder.append(append);
        }
        String returnbuilder = new String(stringBuilder);
        return returnbuilder;
    }
}
