public class Yacht extends Boat implements Comparable{

    public Yacht(int topSpeed, int length, int numPassengers){
        super(hasMotor true, topSpeed, length);
        this.numPassengers = numPassengers;
    }

    public boolean equals(Object obj){
        Yacht otherYacht = (Yacht) obj;
        return this.getLength() == otherYacht.getLength &&(this.numPassengers == otherYacht.numPassengers);
    }

    public int compareTo(Object other){
        Yacht otherYacht = (Yacht) other;
        return this.getLength() - otherYacht.getLength();
    }

}