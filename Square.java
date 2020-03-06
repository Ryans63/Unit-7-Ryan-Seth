public class Square extends Rectangle{
    public Square(int s1){
        super(s, s);
    }

    public String toString(){
        return super.toString() + "[Square]";
        Quadrilateral[] shapes = (new Rectangle(4, 8), new Square(s: 5));
        System.out.println(shapes[0].toString);
        System.out.println(shapes[1].toString);
        
    }
}