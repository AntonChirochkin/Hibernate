import hibernate.model.Employee;
import service.EmployeeDao;
import service.EmployeeDaoImpl;

public class  Application {
    public static void main(String[] args) {
        Employee employee = new Employee(8, "Bart", "Simson", "man", 13, 4);

        EmployeeDao employeeDao = new EmployeeDaoImpl();
        employeeDao.getAllEmployee().forEach(System.out::println);

        Integer employeeId = employeeDao.add(employee);
        System.out.println(employeeDao.getAllEmployee());
        System.out.println();
        employeeDao.updateEmployee(employee, employeeId);
       // employeeDao.deleteEmployee(employeeDao.getById(employeeId));

//        System.out.println(employeeDao.getById(8));
    }
}
