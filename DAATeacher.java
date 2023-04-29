/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package schoolmanagementsystem;

/**
 *
 * @author jeeva
 */
public class DAATeacher implements Teacher {
    private final String subject = "DAA";
    private final int salary = 55000;
    
    @Override
    public int getSalary() {
        return salary;
    }
}
