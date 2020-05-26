/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentlist;

/**
 *
 * @author mustafa
 */
public class ParttimeStudent{
    private String Name;
    private int numCourses;

    public ParttimeStudent(String Name, int numCourses) {
        this.Name = Name;
        this.numCourses = numCourses;
    }

    public String getName() {
        return Name;
    }

    public int getNumCourses() {
        return numCourses;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setNumCourses(int numCourses) {
        this.numCourses = numCourses;
    }
    
    
    
}
