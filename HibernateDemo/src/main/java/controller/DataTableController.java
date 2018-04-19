package controller;

import domain.datatable.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/datatable")
public class DataTableController {

    @RequestMapping("/getData")
    @ResponseBody
    public List<DataTableModel> getData() {
        List list = new ArrayList();
        DataTableModel m1 = new DataTableModel("abc", "2017-12-11");
        DataTableModel m2 = new DataTableModel("xyz", "2012-01-08");
        list.add(m1);
        list.add(m2);
        return list;
    }

    @RequestMapping("/getData1")
    @ResponseBody
    public DataTableDataModel getData1() {
        List list = new ArrayList();
        DataTableModel m1 = new DataTableModel("abc", "2017-12-11");
        DataTableModel m2 = new DataTableModel("xyz", "2012-01-08");
        list.add(m1);
        list.add(m2);
        DataTableDataModel data = new DataTableDataModel(list);
        return data;
    }

    @RequestMapping("/getData2")
    @ResponseBody
    public DataTableStaffModel getData2() {
        List list = new ArrayList();
        DataTableModel m1 = new DataTableModel("abc", "2017-12-11");
        DataTableModel m2 = new DataTableModel("xyz", "2012-01-08");
        list.add(m1);
        list.add(m2);
        DataTableStaffModel data = new DataTableStaffModel(list);
        return data;
    }

    @RequestMapping("/getData3")
    @ResponseBody
    public List<List<String>> getData3() {
        List<List<String>> list = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            list.add(Arrays.asList("abc" + i, "xyz" + i, "2017-12-11"));
        }
        return list;
    }

    @RequestMapping("/getData4")
    @ResponseBody
    public List<User> getData4() {
        List<User> list = new ArrayList<>();
        User user1 = new User("user1", new Address("nanjing", "yuhua"));
        User user2 = new User("user2", new Address("suzhou", "hukou"));
        list.add(user1);
        list.add(user2);
        return list;
    }
}