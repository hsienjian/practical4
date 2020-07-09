/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Forge-15
 */
public class P4 {
    
    public static void main (String []agrs){
        
        Employee emp = new Employee("Ali", 5000.00);
        Employee emp2 = new Employee("Abu");
        emp2.setSalary(5600.00);
        
        //System.out.println("Salary is : " + emp.salary());
        
        System.out.println("Salary is : " + emp.getSalary());
        emp.raiseSalary(8.0);
        System.out.println("Salary is : " + emp.getSalary());
        
        //System.out.println("Salary is : " + emp.salary ());

        //part (c)
        if(emp.getSalary()>emp2.getSalary()){
            System.out.println(emp.getSalary());
            
        }
        else{
            System.out.println(emp2.getName() + " " + emp2.getSalary());
        }
        
        System.out.println("Total : " + emp.getSalary() + " + " + emp2.getSalary() + " = " + (emp.getSalary() + emp2.getSalary()) );
    }
    
}
