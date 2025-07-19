package com.sathvika.studentapp.controller;

import com.sathvika.studentapp.model.Student;
import com.sathvika.studentapp.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@Controller
public class StudentController {

    @Autowired
    private StudentRepository studentRepo;

    @GetMapping("/")
    public String viewHomePage(Model model) {
        model.addAttribute("students", studentRepo.findAll());
        return "index";
    }

    @PostMapping("/add")
public String addStudent(@RequestParam int id, @RequestParam String name, @RequestParam int marks) {
    Student s = new Student();
    s.setId(id);
    s.setName(name);
    s.setMarks(marks); // ✅ add this
    studentRepo.save(s);
    return "redirect:/";
}

    @GetMapping("/search")
    public String search(@RequestParam String keyword, Model model) {
        List<Student> results;  // ✅ Fixed Line 30
        try {
            long id = Long.parseLong(keyword);  // ✅ Line 32
            results = studentRepo.findByNameContainingIgnoreCaseOrId(keyword, id);  // ✅ Line 34
        } catch (NumberFormatException e) {
            results = studentRepo.findByNameContainingIgnoreCase(keyword);  // ✅ Line 36
        }
        model.addAttribute("students", results);  // ✅ Line 37
        return "index";
    }

    @GetMapping("/edit/{id}")
    public String editStudent(@PathVariable("id") long id, Model model) {
    Student student = studentRepo.findById(id)
        .orElseThrow(() -> new IllegalArgumentException("Invalid student Id:" + id));
    model.addAttribute("student", student);
    return "edit_student";
    }

    @PostMapping("/update/{id}")
    public String updateStudent(@PathVariable("id") long id, @ModelAttribute Student student) {  // ✅ Line 49 — use int
        student.setId(id);
        studentRepo.save(student);
        return "redirect:/";
    }

    @GetMapping("/delete/{id}")
    public String deleteStudent(@PathVariable("id") long id) {
    studentRepo.deleteById(id);
    return "redirect:/";
}
}
