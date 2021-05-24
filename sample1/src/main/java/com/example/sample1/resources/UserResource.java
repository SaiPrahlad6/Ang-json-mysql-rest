package com.example.sample1.resources;

import com.example.sample1.Repository.UsersRepository;
import com.example.sample1.model.Users;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/sample")

public class UserResource {
        @Autowired
        private UsersRepository un;
        @PostMapping("/register")
        public String register(@RequestBody final Users users){
            un.save(users);
            var s="Success";
            return s;
        }


        @GetMapping("/login")
        public String login(@RequestParam int roll_no,@RequestParam String f_s){
            String status;

                Users two=un.findByFirstnameAndRollno(f_s,roll_no);
                if(two!=null){
                    status="Success";
                }
                else{
                    status="Unsuccessful";
                }
            return status;
        }

    

}
