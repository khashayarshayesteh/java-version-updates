package CharStreamTask;

import java.util.List;

public class EmployeeTest {
    public static void main(String[] args) {





        //print all emails
        EmployeeData.readAll()
                .map(employee -> employee.getEmpEmail())
              //  .map((Employee::getEmpEmail))           // these lines , this and above are same.
                .forEach(System.out::println);

        System.out.println("Print All Phone Numbers");

        EmployeeData.readAll()
                .flatMap(employee -> employee.getEmpPhoneNumbers().stream())
                .forEach(System.out::println);


        System.out.println("Print All Phone Numbers With Double Colon");

        EmployeeData.readAll()
                .map(Employee::getEmpPhoneNumbers)
                .flatMap(List::stream)
                .forEach(System.out::println);


    }
}
