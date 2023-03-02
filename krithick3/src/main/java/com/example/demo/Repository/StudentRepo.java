package com.example.demo.Repository;

//public class StudentRepo {
//
//}
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.StudentEntity;
@Repository
public interface StudentRepo extends JpaRepository<StudentEntity,Integer> {

	StudentEntity save(StudentEntity stu);

}

