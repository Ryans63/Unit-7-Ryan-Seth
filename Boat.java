public class Boat{
    private boolean hasMotor;
    private int topSpeed;
    private int length;

    public Boat(){
        this.hasMotor = false;
        this.topSpeed = 0;
        this.length = 0;
    }

    public Boat(boolean hasMotor, int topSpeed, int length){
        this.hasMotor = hasMotor;
        this.topSpeed = topSpeed;
        this.length = length;
    }

    public String move(int nautMiles){
        if(hasMotor) {
            return "The Boat moved " + nautMiles + " nautical miles quickly.";
        }
        else
            return "The Boat moved " + nautMiles + " nautical miles slowly.";
    }
    public String sink(){
        if (length > 10){
            return "Boat sank in " + (length*2 +9) / 1.4 + "minutes.";
        }
        else
            return "Boat sank instantly";
    }

    public String toString(){
        return "Boat - /n/t Motor: " + hasMotor +
                "\n\t" + "Top Speed: " + topSpeed + "knots" +
                "\n\t" + "Length: " + length + "ft.";
    }
    public static void main(String[] args){
        Boat b = new Boat();
        Boat myBoat = new Boat(hasMotor true, topSpeed 23, length 44);

        System.out.println("Default boat: /n" + b)
    }
}