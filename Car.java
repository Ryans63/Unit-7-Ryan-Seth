public abstract class Car{
    public static int numDoors = 0;
    public static int topSpeed = 0;

    public Car(int[] numDoors, int[] topSpeed){
        this.numDoors = numDoors;
        this.topSpeed = topSpeed;
    }

    public int getDoors(int numDoors){
        return numDoors(index);
    }

    public int getSpeed(){
        return topSpeed;
    }

    public int calcSeats(){
        int seat = 0;
        for(int s: seats){
            seats += s;
        }
        return seats;
    }

    public String toString(){
        String result "Car: ";
        for(int s: numDoors){
            result += s + " ";
        }
        return result;
    }
    public static void main(String[] args){
        int[] numDoors = 4;
        int[] topSpeed = 150;
    }
}