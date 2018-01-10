
public class Racecardriver
{
    private String name;
    private int age;
    private boolean driving = true;
    public static int topSpeed = 180;
    public Racecardriver(String nm, int year) {
        this.name = nm;
        this.age = year;
    }
    public String getName() {
        return this.name;
    }
    public int getAge() {
        return this.age;
    }
     public void setName(String nam) {
       this.name = nam;
    }
    public void setAge(int ag) {
        this.age = ag;
    }
    public boolean getDriving() {
        return driving;
    }
    public void setDriving(boolean drive) {
        this.driving = drive;
    }
    public String toString() {
        return "Car Driver: " + this.name + "Age: " + this.age;
    }
    public void Crash() {
        driving = false;
    }
    
}
