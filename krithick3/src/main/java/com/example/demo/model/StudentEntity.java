package com.example.demo.model;

//public class StudentEntity {
//
//}
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="studentinfo")
public class StudentEntity {
@Id
private int id;

public int getId() {
return id;
}
public void setId(int id) {
this.id = id;
}
private String name;
public String getName() {
return name;
}
public void setName(String name) {
this.name = name;
}
private int  marks;
public int getMarks() {
return marks;
}
public void setMarks(int marks) {
this.marks = marks;
}
private char grade;
public char getGrade() {
return grade;
}
public void setGrade(char grade) {
this.grade = grade;
}


public StudentEntity(int id, String name, int marks, char grade) {
super();
this.id = id;
this.name = name;
this.marks = marks;
this.grade = grade;
}
public StudentEntity() {

}
public String toString() {
return "id: "+id+"name: "+name+"price: "+"marks :";
}
}
