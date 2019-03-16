package za.ac.cput.SingleResponsibilityPrinciple;


public class RefactoredText {

    String text;
    String author;
    int length;

    String getText() {
        return text;
    }

    void setText(String s) {
    }

    String getAuthor() {
        return author;
    }

    void setAuthor(String s) {
    }

    int getLength() {
        return length;
    }

    void setLength(int k) {
    }

    /* methods to change text */
    void allLettersToUpperCase() {

    }

    void findSubTextAndDelete(String s) {

    }
}
    class Printer {

        RefactoredText refactoredText;

        Printer(RefactoredText rt)
        {
            this.refactoredText = rt;
        }

        void printText()
        {

        }
    }

