package studentlist;

/**
 * This class is to represent a Student in our app
 *
 * @author Paul Bonenfant
 */
public class Student {
    
    private String name;
    private int ID;

    public int getID() {
        return ID;
    }

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
    
    

}

