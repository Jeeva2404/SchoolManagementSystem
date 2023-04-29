/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package schoolmanagementsystem;

/**
 *
 * @author jeeva
 */
public class CNSTeacher implements Teacher {
    private final String subject = "CNS";
    private final int salary = 65000;

    @Override
    public int getSalary() {
        return salary;
    }
}
