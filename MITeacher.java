/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package schoolmanagementsystem;

/**
 *
 * @author jeeva
 */
public class MITeacher implements Teacher {
    private final String subject = "MI";
    private final int salary = 50000;
    
    @Override
    public int getSalary() {
        return salary;
    }
}
