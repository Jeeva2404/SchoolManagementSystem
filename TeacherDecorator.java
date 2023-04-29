/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package schoolmanagementsystem;

/**
 *
 * @author jeeva
 */
public class TeacherDecorator implements Teacher {
    protected Teacher decoratedTeacher;
    
    public TeacherDecorator(Teacher decoratedTeacher) {
        this.decoratedTeacher = decoratedTeacher;
    }
    @Override
    public int getSalary() {
        return decoratedTeacher.getSalary();
    }
}
