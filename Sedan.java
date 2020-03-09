public class Sedan extends Car{
    public static final int numDoors = 4;
    public int MPG = 0;

    public Sedan(int s1){
        super(new int(s1), topSpeed);
    }

    public Sedan(int MPG){
        this.MPG = MPG;
    }

    public double calcSpeed(){
        return getSpeed();
    }

    public double calcMPG(){
        return getMPG();
    }

    public String toString(){
        return super.toString() + "Sedan"
    }

    public static void main(String[] args){
        Sedan s = new Sedan();
        System.out.println(s);
        System.out.println("MPG: " + s.calcMPG);
        System.out.println("Speed: " + s.calcTopSpeed);
    }
}