package case_study.repository;

import case_study.models.Employee;

import java.util.Iterator;
import java.util.LinkedList;

public class EmployeeRepositoryImpl implements EmployeeRepository {

    private static LinkedList<Employee> employeesList;

    static {
        employeesList= new LinkedList<>();
        employeesList.add(new Employee("1111","mot","12/12/1999",true,"123456789C",
                123456778,"55abc@gmail.com","Dai hoc","Phuc vu",1000100));
        employeesList.add(new Employee("11311","m2ot","12/12/1999",true,"123456789C",
                123456779,"ab2c@gmail.com","Dai3 hoc","Phuc vu",1000200));
        employeesList.add(new Employee("11211","m1ot","12/12/1999",true,"123456789C",
                123456770,"ab11c@gmail.com","Dai 4hoc","Phuc vu",34100000));
    }

    public EmployeeRepositoryImpl(Employee e){
        employeesList.add(e);
    }

    public EmployeeRepositoryImpl(){
    }

    @Override
    public Employee getEmployee(int index) {
        return employeesList.get(index);
    }

    @Override
    public void showEmployee() {

        Iterator<Employee> iterator = employeesList.iterator();
        int index = 0;
        while (iterator.hasNext()){
            Employee employee = iterator.next();
            System.out.println("ID: "+(index++)+" "+employee.toString());
        }

    }

    @Override
    public void addEmployee(Employee employee) {
        employeesList.add(employee);
    }

    @Override
    public int sizeEmployee() {
        return employeesList.size();
    }

    @Override
    public void editEmployee(int index, String code, String name, String dateOfBirth, boolean gender, String CMND, int SDT, String email, String level, String position, double salary) {
        Employee editEmployee = employeesList.get(index);
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

    @Override
    public void editEmployee(int index, Employee e) {
        employeesList.set(index,e);
    }

}
