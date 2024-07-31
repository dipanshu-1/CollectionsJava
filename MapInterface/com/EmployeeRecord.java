package MapInterface.com;

import java.util.HashMap;
import java.util.Scanner;

public class EmployeeRecord {
    public static class Employee{
        public int id;
        public String name;
        public String department;

        public void setValues()
        {
            Scanner sc=new Scanner(System.in);
            Scanner sc1=new Scanner(System.in);
            System.out.println("Enter the new Employee Id");
            this.id=sc.nextInt();
            System.out.println("Enter the new Employee name");
            this.name= sc1.nextLine();
            System.out.println("Enter the Department");
            this.department= sc1.nextLine();
        }

        @Override
        public String toString() {
            return id+" "+name+" "+department;
        }
    }
    public static void main(String[] args) {
        HashMap<Integer,Employee> map = new HashMap<>();
        boolean fl=true;

        while(fl){
            Scanner sc=new Scanner(System.in);
            System.out.println("1. Add new Employee");
            System.out.println("2. Search for a Employee");
            System.out.println("3. Exit");
            int option= sc.nextInt();

            switch (option){
                case 1:
                    Employee employee=new Employee();
                    employee.setValues();
                    map.put(employee.id, employee);
                    System.out.println("Added");
                    break;
                case 2:
                    System.out.println("Enter the Employee id you are looking for");
                    Employee emp=map.get(sc.nextInt());
                    System.out.println(emp);
                    break;
                case 3:
                    fl=false;
                    break;

                default:
                    System.out.println("Enter valid input");
                    break;
            }
        }

    }
}
