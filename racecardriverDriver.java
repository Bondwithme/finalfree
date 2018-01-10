
public class racecardriverDriver
{
    public static void main(String[] args) {
        Racecardriver rc1 = new Racecardriver("Bob", 32);
        Racecardriver rc2 = new Racecardriver("Bill", 33);
        System.out.println(Racecardriver.topSpeed);
        rc1.toString();
        rc2.toString();
        changeIt(rc1, rc2);
        rc1.toString();
        rc2.toString();
    }
    public static void changeIt(Racecardriver rc1, Racecardriver rc2) {
        rc1.setAge(34);
        Racecardriver rc3 = new Racecardriver("Billy", 28);
        rc2 = rc3;
        rc2.setName("Wilbur");
        rc1.toString();
        rc2.toString();
        
    }
    
}
