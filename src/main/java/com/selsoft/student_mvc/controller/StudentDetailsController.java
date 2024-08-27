package com.selsoft.student_mvc.controller;



import com.selsoft.student_mvc.model.StudentDetails;
import com.selsoft.student_mvc.service.StudentDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/students")
public class StudentDetailsController {

    @Autowired
    private StudentDetailsService service;

    @GetMapping
    public String viewStudents(Model model) {
        model.addAttribute("students", service.getAllStudents());
        return "view-students";
    }

    @GetMapping("/add")
    public String addStudentForm(Model model) {
        model.addAttribute("studentDetails", new StudentDetails());
        return "add-student";
    }

    @PostMapping("/add")
    public String addStudent(@ModelAttribute("studentDetails") StudentDetails student) {
        service.saveStudent(student);
        return "redirect:/students";
    }

    @GetMapping("/edit/{id}")
    public String editStudentForm(@PathVariable("id") Long id, Model model) {
        StudentDetails student = service.getStudentById(id).orElseThrow(() -> new IllegalArgumentException("Invalid student ID:" + id));
        model.addAttribute("studentDetails", student);
        return "edit-student";
    }

    @PostMapping("/update")
    public String updateStudent(@ModelAttribute("studentDetails") StudentDetails student) {
        service.saveStudent(student);
        return "redirect:/students";
    }

    @GetMapping("/delete/{id}")
    public String deleteStudent(@PathVariable("id") Long id) {
        service.deleteStudent(id);
        return "redirect:/students";
    }
}
