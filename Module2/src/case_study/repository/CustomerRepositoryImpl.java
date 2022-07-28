package case_study.repository;

import case_study.models.Customer;

import java.io.*;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class CustomerRepositoryImpl implements CustomerRepository {

    private static LinkedList<Customer> customerList ;
    private static String path = "src/case_study/data/customer.csv";

    static {
        customerList = (LinkedList<Customer>) readCSV();
    }

    public CustomerRepositoryImpl(Customer c){
        customerList.add(c);
    }

    public CustomerRepositoryImpl(){
    }

    public static LinkedList<Customer> getListCustomer() {
        return customerList;
    }

    @Override
    public Customer getCustomer(int index) {
        return customerList.get(index);
    }

    @Override
    public void showCustomer() {
        Iterator<Customer> iterator = customerList.iterator();
        int index = 0;
        while (iterator.hasNext()){
            Customer customer = iterator.next();
            System.out.println("ID: "+(index++)+" "+customer.toString());
        }
    }

    @Override
    public void addCustomer(Customer c) throws IOException {
        customerList.add(c);
        writeCSV(c);
    }

    @Override
    public int sizeCustomer() {
        return customerList.size();
    }

    @Override
    public void editCustomer(int index, String code, String name, String dateOfBirth, boolean gender,
                             String CMND, int SDT, String email, String typeOfGuest, String address) {
        Customer editCustomer = customerList.get(index);
        editCustomer.setTypeOfGuest(typeOfGuest);
        editCustomer.setAddress(address);
        editCustomer.setEmail(email);
        editCustomer.setSDT(SDT);
        editCustomer.setCMND(CMND);
        editCustomer.setCode(code);
        editCustomer.setName(name);
        editCustomer.setDateOfBirth(dateOfBirth);
        editCustomer.setGender(gender);
    }

    public static List<Customer> readCSV() {
        List<Customer> customerLists = new LinkedList<>();
        FileReader fileReader = null;
        BufferedReader buffRead = null;
        try {
            fileReader = new FileReader(path);
            buffRead = new BufferedReader(fileReader);
            String line ;
            String temp[];
            Customer customer;

            while ((line = buffRead.readLine()) != null) {
                temp = line.split(",");
                customer = new Customer(temp[0], temp[1], temp[2], Boolean.parseBoolean(temp[3]),
                        temp[4], Integer.parseInt(temp[5]), temp[6], temp[7], temp[8]);
                customerLists.add(customer);
            }

            buffRead.close();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            return customerLists;
        }



    }

    @Override
    public void editCustomer(int index, Customer c) {
        customerList.set(index,c);
    }

    public static void writeCSV(Customer customer) throws IOException {
        FileWriter fileWriter = new FileWriter(path, true);
        BufferedWriter buffWrite = new BufferedWriter(fileWriter);
        buffWrite.write(customer.getCode()+","+customer.getName()+","+customer.getDateOfBirth()+"" +
                ","+customer.getGender()+","+customer.getCMND()+","+customer.getSDT()+
                ","+customer.getEmail()+","+customer.getTypeOfGuest()+","+customer.getAddress()+"\n");
        buffWrite.newLine();
        buffWrite.close();
    }

    public static void main(String[] args) throws IOException {
        CustomerRepositoryImpl customerRepository = new CustomerRepositoryImpl();
//        customerRepository.showCustomer();
//        Customer customer = new Customer("test413", "Hui", "12/12/1212", false,
//                "12392382318", 123213213, "huioc@gmail.com", "Member", "12 phung");
//        customerRepository.addCustomer(customer);
        customerRepository.showCustomer();
    }
}
