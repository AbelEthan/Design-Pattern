package com.aen.principle.demeter.case2;

import java.util.ArrayList;
import java.util.List;

/**
 * Title: {@link CollegeManager}
 * Description:
 *
 * @author 谭 tmn
 * @email AbelEthan@aliyun.com
 * @date 2020/5/26 14:53
 */
public class CollegeManager {

    public List<CollegeEmployee> getAllEmployee(){
        List<CollegeEmployee> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            CollegeEmployee collegeEmployee = new CollegeEmployee();
            collegeEmployee.setId("学院员工 ID= "+ i);
            list.add(collegeEmployee);
        }
        return list;
    }

    public void printEmployee(){
        List<CollegeEmployee> list = getAllEmployee();
        System.out.println("---------学院员工---------");
        for (CollegeEmployee e : list){
            System.out.println(e.getId());
        }
    }
}
