package edu.mum.lms.dao;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

import edu.mum.lms.commonUtil.JDBCUtil;
import edu.mum.lms.entities.Employee;
import edu.mum.lms.entities.EmployeeRole;

public class EmployeeDao {

    private JDBCUtil db = new JDBCUtil();
    private static final String TABLE_NAME = "Employee";
    
    public int addEmployee(int personId, Employee emp) {

        LinkedHashMap<String, Object> map = new LinkedHashMap<String, Object>();
        map.put("username", emp.getUsername());
        map.put("password", emp.getPassword());
        map.put("person_id", personId);

        int empId = db.insertRow(TABLE_NAME, map, true);
        return empId;
    }

    public boolean addRole(int empId, List<EmployeeRole> roles) {
        LinkedHashMap<String, Object> map = new LinkedHashMap<String, Object>();
        List<LinkedHashMap<String, Object>> rows = new ArrayList<LinkedHashMap<String, Object>>();
        
        for (EmployeeRole role : roles) {
            map.put("employee_id", empId);
            map.put("roleName", role);
            rows.add(map);
        }

        return db.insertRows("EmployeeRole", rows);
    }

}
