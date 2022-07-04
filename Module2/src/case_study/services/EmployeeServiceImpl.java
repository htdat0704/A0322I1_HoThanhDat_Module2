package case_study.services;

import case_study.models.Employee;
import case_study.repository.EmployeeRepository;
import case_study.repository.EmployeeRepositoryImpl;

import java.util.ArrayList;
import java.util.Iterator;

public class EmployeeServiceImpl implements IEmployeeService{

    private EmployeeRepository repository = new EmployeeRepositoryImpl();

    public EmployeeServiceImpl(Employee e){
        repository.addEmployee(e);
    }

    public EmployeeServiceImpl(){
    }

    public Employee getEmployee(int index){
        return repository.getEmployee(index);
    }

    public void showEmployee(){

        repository.showEmployee();

    }

    public void addEmployee(Employee employee){
        repository.addEmployee(employee);
    }

    public int sizeEmployee(){
        return repository.sizeEmployee();
    }

    @Override
    public void editEmployee(int index, String code, String name, String dateOfBirth, boolean gender,
                             String CMND, int SDT, String email, String level, String position, double salary) {
        repository.editEmployee(index, code, name, dateOfBirth,
                gender, CMND, SDT, email, level, position, salary);
    }

    public void editEmployee(int index, Employee e){
        repository.editEmployee(index, e);
    }

}