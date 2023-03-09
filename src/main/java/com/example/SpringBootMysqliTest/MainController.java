package com.example.SpringBootMysqliTest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path="/demo")
public class MainController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping (path="/add")
    public @ResponseBody String addNewStudent (@RequestParam String name, @RequestParam String email){
        Student st = new Student();
        st.setName(name);
        st.setEmail(email);
        userRepository.save(st);
        return "Saved";
    }

    @GetMapping (path="/all")
    public @ResponseBody Iterable <Student> getAllStudents(){
        return userRepository.findAll();
    }

}
