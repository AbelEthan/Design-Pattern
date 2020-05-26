package com.aen.principle.demeter.case1;

import java.util.ArrayList;
import java.util.List;

/**
 * Title: {@link SchoolManager}
 * Description: 直接朋友：Employee, CollegeManager
 * CollegeEmployee 不是直接盆友而是一个陌生类，这样违反了迪米特法则
 * @author 谭 tmn
 * @email AbelEthan@aliyun.com
 * @date 2020/5/26 14:55
 */
public class SchoolManager {

    public List<Employee> getAllEmployee(){
        List<Employee> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            Employee employee = new Employee();
            employee.setId("学校总部员工id = " + i);
            list.add(employee);
        }
        return list;
    }

    void printAllEmployee(CollegeManager sub){
        List<CollegeEmployee> allEmployee = sub.getAllEmployee();
        System.out.println("----------------学院员工------------------");
        for (CollegeEmployee e: allEmployee){
            System.out.println(e.getId());
        }

        List<Employee> list = this.getAllEmployee();
        System.out.println("------------学校总部员工-----------------");
        for (Employee e : list){
            System.out.println(e.getId());
        }
    }

}
