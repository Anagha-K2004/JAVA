class stringmanipulation
{
    public static void main(String[] args)
    {
        String str1 ="    String Manipulation    "; 
        String str2 ="java programming";

        int length = str1.length();
        System.out.println("Length of str1: " + length);

        /*string concatination */
        String str3 = str1 + " " + str2;
        System.out.println("Concatenated string : " + str3);

        String str4 = str1.concat(" ").concat(str2);
        System.out.println("Concatenated string using concat(): " + str4);

        /* string comparison with equals*/
        String str5 = "Computer lab";
        boolean isEqual = str2.equals(str5);
        System.out.println("str2 equals str5: " + isEqual);

        /* string comparison with compareTo */
        int result = str2.compareTo(str5);
        System.out.println("str2 compared to str5: " + result);

        /*Index of a character in a string */
        int index = str1.indexOf('M');
        System.out.println("Index of 'M' in str1: " + index);

        /* Upper case and lower case */
        String upperCase = str1.toUpperCase();
        String lowerCase = str1.toLowerCase();
        System.out.println("Upper case of str1: " + upperCase);
        System.out.println("Lower case of str1: " + lowerCase);

        /* Replace a character in a string */
        String replaced = str1.replace('M', 'd');
        System.out.println("String after replacing 'M' with 'd': " + replaced);

        /*Compare to ignore case */
        boolean isEqualIgnoreCase = str2.equalsIgnoreCase(str5);
        System.out.println("str2 equals str5 (ignoring case): " + isEqualIgnoreCase);

        /*sub string */
        String subString = str1.substring(3, 8);
        System.out.println("Substring of str1: " + subString);

        /*Trim */
        String trimmed = str1.trim();
        System.out.println("Trimmed string: " + trimmed);

        /*trim whitespace */
        String trimmedWhitespace = str1.trim();
        System.out.println("Trimmed string (whitespace): " + trimmedWhitespace);

        /*byte ascii value */
        byte [] ascii= {75,71,70};
        String str7 = new String(ascii);
        System.out.println("string from ascii values: " + str7);

        byte[] array = str1.getBytes();
        System.out.println("ASCII values of characters in str1:");
        for (byte b : array) 
        {
            System.out.print(b + " ");
        }
    }

}