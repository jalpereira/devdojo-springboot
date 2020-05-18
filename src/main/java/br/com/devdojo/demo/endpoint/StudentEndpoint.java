package br.com.devdojo.demo.endpoint;

import br.com.devdojo.demo.error.CustomErrorType;
import br.com.devdojo.demo.model.Student;
import br.com.devdojo.demo.util.DateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * author: Jose Augusto for DevDojo SpringBoot Course on 5/18/20
 */

@RestController
@RequestMapping("students")
public class StudentEndpoint {
    @Autowired
    private DateUtil dateUtil;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<?> listAll() {
        return new ResponseEntity<>(Student.studentList, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    public ResponseEntity<?> getStudentById(@PathVariable("id") int id) {
        Student student = new Student();
        student.setId(id);
        int index = Student.studentList.indexOf(student);
        if (index == -1)
            return new ResponseEntity<>(new CustomErrorType("Student not found"), HttpStatus.NOT_FOUND);
        return new ResponseEntity<>(Student.studentList.get(index), HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<?> save(@RequestBody Student student) {
        Student.studentList.add(student);
        return new ResponseEntity<>(student, HttpStatus.OK);
    }
}
