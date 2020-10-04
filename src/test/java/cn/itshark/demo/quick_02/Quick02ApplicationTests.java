package cn.itshark.demo.quick_02;

import cn.itshark.demo.quick_02.bean.Student;
import cn.itshark.demo.quick_02.bean.person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Quick02ApplicationTests {
    @Autowired
    person p;
    @Autowired
    Student student;
    @Test
    void contextLoads() {
        System.out.println(student);
    }

}
