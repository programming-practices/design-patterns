package com.trl.bl;

import com.trl.entity.*;
import com.trl.service.*;

import java.sql.Date;
import java.util.Calendar;
import java.util.List;

public class Domain {
    public static void main(String[] args) {
        AddressService addressService = new AddressService();
        Empl_ProjService empl_projService = new Empl_ProjService();
        EmployeeService employeeService = new EmployeeService();
        ProjectService projectService = new ProjectService();

        // ----------------------------------- Address
        Address address = new Address();
        address.setId(1L);
        address.setCountry("DC");
        address.setCity("Cotham City");
        address.setStreet("Arkhan Street 1");
        address.setPost_Code("43422");

        Address address2 = new Address();
        address2.setId(2L);
        address2.setCountry("2DC");
        address2.setCity("2Cotham City");
        address2.setStreet("2Arkhan Street 1");
        address2.setPost_Code("243422");

        Address address3 = new Address();
        address3.setId(3L);
        address3.setCountry("3DC");
        address3.setCity("3Cotham City");
        address3.setStreet("3Arkhan Street 1");
        address3.setPost_Code("343422");

        // ---------------------------------- Employee
        Employee employee = new Employee();
        employee.setId(1L);
        employee.setFirst_Name("James");
        employee.setLast_Name("Gordon");

        Calendar calendar = Calendar.getInstance();
        calendar.set(1939, Calendar.MAY, 1);
        employee.setBirthday(new Date(calendar.getTime().getTime()));
        employee.setAddress_Id(address.getId());

        Employee employee2 = new Employee();
        employee2.setId(2L);
        employee2.setFirst_Name("2James");
        employee2.setLast_Name("2Gordon");

        Calendar calendar2 = Calendar.getInstance();
        calendar2.set(1939, Calendar.MAY, 2);
        employee2.setBirthday(new Date(calendar2.getTime().getTime()));
        employee2.setAddress_Id(address.getId());

        Employee employee3 = new Employee();
        employee3.setId(3L);
        employee3.setFirst_Name("3James");
        employee3.setLast_Name("3Gordon");

        Calendar calendar3 = Calendar.getInstance();
        calendar3.set(1939, Calendar.MAY, 3);
        employee3.setBirthday(new Date(calendar3.getTime().getTime()));
        employee3.setAddress_Id(address.getId());

        // ----------------------------------- Project
        Project project = new Project();
        project.setId(1L);
        project.setTitle("Gothman City Police Departament Commissioner");

        Project project2 = new Project();
        project2.setId(2L);
        project2.setTitle("2Gothman City Police Departament Commissioner");

        Project project3 = new Project();
        project3.setId(3L);
        project3.setTitle("3Gothman City Police Departament Commissioner");

        // ----------------------------------- Empl_Proj
        Empl_Proj empl_proj = new Empl_Proj();
        empl_proj.setEmployee_Id(employee.getId());
        empl_proj.setProject_Id(project.getId());

        Empl_Proj empl_proj2 = new Empl_Proj();
        empl_proj2.setEmployee_Id(employee2.getId());
        empl_proj2.setProject_Id(project2.getId());

        Empl_Proj empl_proj3 = new Empl_Proj();
        empl_proj3.setEmployee_Id(employee3.getId());
        empl_proj3.setProject_Id(project3.getId());

        // ----------------------------------- Test
        // ----------- add()
//        addressService.add(address);
//        employeeService.add(employee);
//        projectService.add(project);
//        empl_projService.add(empl_proj);

//        addressService.add(address2);
//        employeeService.add(employee2);
//        projectService.add(project2);
//        empl_projService.add(empl_proj2);

//        addressService.add(address3);
//        employeeService.add(employee3);
//        projectService.add(project3);
//        empl_projService.add(empl_proj3);

        // ----------- getAll()
        List<Address> addressServiceAll = addressService.getAll();
        System.out.println(addressServiceAll);
        System.out.println("---------------------------------------------------------------------------------------");

        List<Employee> employeeServiceAll = employeeService.getAll();
        System.out.println(employeeServiceAll);
        System.out.println("---------------------------------------------------------------------------------------");

        List<Project> projectServiceAll = projectService.getAll();
        System.out.println(projectServiceAll);
        System.out.println("---------------------------------------------------------------------------------------");

        List<Empl_Proj> empl_projServiceAll = empl_projService.getAll();
        System.out.println(empl_projServiceAll);
        System.out.println("---------------------------------------------------------------------------------------");

        // ----------- getById()
        System.out.println(addressService.getById(1L));
        System.out.println(employeeService.getById(1L));
        System.out.println(projectService.getById(1L));
        System.out.println(empl_projService.getByEmployeeIdAndProjectId(1L, 1L));

        // ----------- update()
        Address addressUpdate = new Address();
        addressUpdate.setId(1L);
        addressUpdate.setCountry("Espania");
        addressUpdate.setCity("Madrid");
        addressUpdate.setStreet("Street Update");
        addressUpdate.setPost_Code("444444444");
        addressService.update(addressUpdate);
        System.out.println("--------------------------------------------------------------------------------");

        Project projectUpdate = new Project();
        projectUpdate.setId(1L);
        projectUpdate.setTitle("Title Update");
        projectService.update(projectUpdate);
        System.out.println("--------------------------------------------------------------------------------");

        Employee employeeUpdate = new Employee();
        employeeUpdate.setId(1L);
        employeeUpdate.setFirst_Name("First Name Update");
        employeeUpdate.setLast_Name("Last Name Update");
        Calendar calendarUpdate = Calendar.getInstance();
        calendarUpdate.set(2018, Calendar.MAY, 10);
        employeeUpdate.setBirthday(new Date(calendarUpdate.getTime().getTime()));
        employeeUpdate.setAddress_Id(addressUpdate.getId());
        employeeService.update(employeeUpdate);
        System.out.println("----------------------------------------------------------------------------------");

        Empl_Proj empl_projUpdate = new Empl_Proj();
        empl_projUpdate.setEmployee_Id(employeeUpdate.getId());
        empl_projUpdate.setProject_Id(projectUpdate.getId());
        empl_projService.update(empl_projUpdate);
        System.out.println("-----------------------------------------------------------------------------------");

        // -------------- remove()
//        addressService.remove(address3);
//        employeeService.remove(employee3);
//        projectService.remove(project3);
//        empl_projService.remove(empl_proj3);
    }
}
