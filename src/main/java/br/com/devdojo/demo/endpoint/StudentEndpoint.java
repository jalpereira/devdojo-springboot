package br.com.devdojo.demo.endpoint;

import br.com.devdojo.demo.model.Student;
import br.com.devdojo.demo.util.DateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;

import static java.util.Arrays.asList;

@RestController
@RequestMapping("student")
public class StudentEndpoint {
    @Autowired
    private DateUtil dateUtil;

    @RequestMapping(method = RequestMethod.GET,path = "/list")
    public List<Student> listAll() {
        System.out.println(dateUtil.formatLocalDateTimetoDatabaseStyle(LocalDateTime.now()));
        return asList(new Student("Deku"),new Student("Todoroki"));
    }
}
