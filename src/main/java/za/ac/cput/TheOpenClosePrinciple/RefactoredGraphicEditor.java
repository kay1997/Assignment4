package za.ac.cput.TheOpenClosePrinciple;



public class RefactoredGraphicEditor {

    public void drawShape(Shape2 s){
        s.draw();
    }

}

abstract class Shape2 {

    abstract void draw();
}

class Rectangle2 extends Shape2{
    public void draw ()
    {

    }
}

