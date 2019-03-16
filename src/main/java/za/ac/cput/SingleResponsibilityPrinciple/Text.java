package za.ac.cput.SingleResponsibilityPrinciple;

    /*
This code violates the Single Responsibility Principle.

 */

public class Text {

    String text;
    String author;
    int length;

    String getText()
    {
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

    void findSubTextAndDelete(String s){

    }
    /* method fof formatting output */
    void printText() {
    }



}
