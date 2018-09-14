package ateneu.utils;

public class Output {

    /**
     * Application output.
     * 
     * @param string
     */
    public static void output(String string) 
    {
    	System.out.println(string);
    }

    /**
     * Send start chars to output.
     * 
     * @param questionLetter
     * @param questionDescription
     */
    public static void writeQuestion(String questionLetter, String questionDescription)
    {
        output("::: Questão "+ questionLetter +" :::");
        output(questionDescription + "\n");
    }

    /**
     * Send end chars to output.
     */
    public static void end()
    {
        output("\n---\n\n");
    }
}
