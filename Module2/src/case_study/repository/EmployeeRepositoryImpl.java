package case_study.repository;

import case_study.models.Customer;
import case_study.models.Employee;

import java.io.*;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class EmployeeRepositoryImpl implements EmployeeRepository {

    private static LinkedList<Employee> employeesList;
    private static String path = "src/case_study/data/employee.csv";

    static {
        employeesList= (LinkedList<Employee>) readCSV();
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
    public void addEmployee(Employee employee) throws IOException {
        writeCSV(employee);
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

    public static List<Employee> readCSV() {
        List<Employee> employeesList = new LinkedList<>();
        FileReader fileReader = null;
        BufferedReader buffRead = null;
        try {
            fileReader = new FileReader(path);
            buffRead = new BufferedReader(fileReader);
            String line;
            String temp[];
            Employee employee;

            while ((line = buffRead.readLine()) != null) {
                temp = line.split(",");
                employee = new Employee(temp[0], temp[1], temp[2], Boolean.parseBoolean(temp[3]),
                        temp[4], Integer.parseInt(temp[5]), temp[6], temp[7], temp[8],Double.parseDouble(temp[9]));
                employeesList.add(employee);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                buffRead.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return employeesList;
    }

    public static void writeCSV(Employee employee) throws IOException {
        FileWriter fileWriter = new FileWriter(path, true);
        BufferedWriter buffWrite = new BufferedWriter(fileWriter);
        Boolean gender = true;
        if(employee.getGender().equals("Women")){
            gender = false;
        }
        buffWrite.write(employee.getCode()+","+employee.getName()+","+employee.getDateOfBirth()+"" +
                ","+gender+","+employee.getCMND()+","+employee.getSDT()+
                ","+employee.getEmail()+","+employee.getLevel()+","+employee.getPosition()+","+employee.getSalary()+"\n");
        buffWrite.newLine();
        buffWrite.close();
    }

    public static void main(String[] args) throws IOException {
        EmployeeRepository employeeRepository = new EmployeeRepositoryImpl();
        employeeRepository.showEmployee();
    }

}
