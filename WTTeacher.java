/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package schoolmanagementsystem;

/**
 *
 * @author jeeva
 */
public class WTTeacher implements Teacher {
    private final String subject = "WT";
    private final int salary = 60000;
    
    @Override
    public int getSalary() {
        return salary;
    }
}
