package com.example.demo.Services;

//public class StudentService {
//
//}
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.Repository.StudentRepo;
import com.example.demo.model.StudentEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

@Service
public class StudentService {
@Autowired
StudentRepo s;
public StudentEntity addEntity( StudentEntity stu ) {
return s.save(stu);
}
public List<StudentEntity> getmethod(){
return s.findAll();
}
public Optional<StudentEntity> getId( int sid){
return s.findById(sid);
}
public StudentEntity updatedetails( StudentEntity stu ) {
return s.saveAndFlush(stu);
}
public void delete(int id) {
s.deleteById(id);
}


public List<StudentEntity> getSorted(String name){
 return s.findAll(Sort.by(Sort.Direction.ASC,name));
}
public List<StudentEntity> getWithPagination(@PathVariable int offset,@PathVariable int pageSize){
 Page<StudentEntity> page = s.findAll(PageRequest.of(offset,pageSize));
 return page.getContent();
}


}
