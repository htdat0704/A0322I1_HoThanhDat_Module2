package case_study.task1.services;

import case_study.task1.models.Employee;

import java.util.ArrayList;
import java.util.Iterator;

public class EmployeeServiceImpl implements IEmployeeService{
    private ArrayList<Employee> employees = new ArrayList<>();
    public Employee employeeR = new Employee("1111","mot","12/12/1999",true,"123456789C",
            12345677,"abc@gmail.com","Dai hoc","Phuc vu",100000);

    public EmployeeServiceImpl(Employee e){
        this.employees.add(e);
        this.employees.add(employeeR);
    }

    public EmployeeServiceImpl(){
        this.employees.add(employeeR);
        this.employees.add(employeeR);
        this.employees.add(employeeR);
    }

    public Employee getEmployee(int index){
        return employees.get(index);
    }

    public void showEmployee(){

        Iterator<Employee> iterator = this.employees.iterator();
        int index = 0;
        while (iterator.hasNext()){
            Employee employee = iterator.next();
            System.out.println("ID: "+(index++)+" "+employee.toString());
        }

    }

    public void addEmployee(Employee employee){
        this.employees.add(employee);
    }

    public int sizeEmployee(){
        return employees.size();
    }

    @Override
    public void editEmployee(int index, String code, String name, String dateOfBirth, boolean gender,
                             String CMND, int SDT, String email, String level, String position, double salary) {
        Employee editEmployee = employees.get(index);
        editEmployee.setLevel(level);
        editEmployee.setPosition(position);
        editEmployee.setSalary(salary);
        editEmployee.setEmail(email);
        editEmployee.setSDT(SDT);
        editEmployee.setCMND(CMND);
        editEmployee.setCode(code);
        editEmployee.setName(name);
        editEmployee.setDateOfBirth(dateOfBirth);
        editEmployee.setGender(gender);
    }


    public void editEmployee(int index, Employee e){
        employees.remove(index);
        employees.add(index,e);
    }


}
