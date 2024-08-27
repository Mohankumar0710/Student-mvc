package com.selsoft.student_mvc.service;



import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.selsoft.student_mvc.model.StudentDetails;
import com.selsoft.student_mvc.repositroy.StudentDetailsRepository;

@Service
public class StudentDetailsService {

    @Autowired
    private StudentDetailsRepository repository;

    public List<StudentDetails> getAllStudents() {
        return repository.findAll();
    }

    public Optional<StudentDetails> getStudentById(Long id) {
        return repository.findById(id);
    }

    public StudentDetails saveStudent(StudentDetails student) {
        return repository.save(student);
    }

    public void deleteStudent(Long id) {
        repository.deleteById(id);
    }
}
