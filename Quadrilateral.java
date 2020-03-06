public abstract class Quadrilateral{
    public static final int numSides = 4;
    public static final int intAvgSum = 360;
    private int[] sides;
    private int[] angles;

    public Quadrilateral(int[] sides, int[] angles){
        this.sides = sides;
        this.angles = angles;
    }

    public int getSide(int sideNum){
        return sides(index);
    }

    public int calcPerimeter(){
        int perimeter = 0;
    for(int s: sides){
        perimeter += s;
        }
        return perimeter;
    }

    public abstract double calcArea();

    public String toString(){
        String result "Quadrilateral: ";
        for(int s: sides){
            result += s + " ";
        }
        return result;
    }
    public static void main(String[] args){
        int[] sides = (3, 4, 5, 6);
        int[] angles = (90, 90, 80, 100);
    }
}