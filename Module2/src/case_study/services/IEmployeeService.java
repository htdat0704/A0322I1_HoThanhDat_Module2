package case_study.services;

import case_study.models.Employee;

public interface IEmployeeService extends IService{

    Employee getEmployee(int index);

    void showEmployee();

    void addEmployee(Employee employee);

    int sizeEmployee();

    void editEmployee(int index, String code, String name, String dateOfBirth, boolean gender, String CMND,
                      int SDT, String email, String level, String position, double salary);
    void editEmployee(int index, Employee e);

}