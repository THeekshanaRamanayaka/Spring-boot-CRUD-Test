package edu.icet.cotroller;

import edu.icet.dto.Student;
import edu.icet.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class StudentController {

    @Autowired
    StudentService service;

    @GetMapping
    public List<Student> getStudent(){
        return service.getStudent();
    }

    @PostMapping
    public void addStudent(@RequestBody Student student){
        service.addStudent(student);
    }

    @DeleteMapping("/{id}")
    public void deleteStudentById(@PathVariable Integer id){
        service.deleteStudentById(id);
    }

    @PutMapping
    public void updateStudent(@RequestBody Student student){
        service.addStudent(student);
    }

    @GetMapping("/find-by-name/{name}")
    public List<Student> findBYName(@PathVariable String name){
        return service.findByName(name);
    }

    @GetMapping("/find-by-address/{address}")
    public List<Student> findByAddress(@PathVariable String address){
        return service.findByAddress(address);
    }
}
