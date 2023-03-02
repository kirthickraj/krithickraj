package com.example.demo.Controller;


import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.DeleteMapping;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.PutMapping;

import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Services.*;
import com.example.demo.model.StudentEntity;

@RestController

public class StudentController {

@Autowired

StudentService str;

@PostMapping("/post")

public StudentEntity add(@RequestBody StudentEntity stu ) {

return str.addEntity(stu);

}

@GetMapping("/get")

public List<StudentEntity> get(){

return str.getmethod();

}

@GetMapping("/get/{id}")

public Optional<StudentEntity> getId(@PathVariable("id") int sid){

return str.getId(sid);

}

@PutMapping("/put")

public StudentEntity update(@RequestBody StudentEntity stu) {

return str.updatedetails(stu);

}

@DeleteMapping("/del/{id}")

String update(@PathVariable("id") int sid) {

str.delete(sid);

return "delete";

}

@GetMapping("sort/{name}")

public List<StudentEntity> getWithSort(@PathVariable String name){

return str.getSorted(name);

}

@GetMapping("display/{offset}/{pageSize}")

public List<StudentEntity> productWithPagination(@PathVariable int offset,@PathVariable int pageSize){

return str.getWithPagination(offset,pageSize);

}


}
