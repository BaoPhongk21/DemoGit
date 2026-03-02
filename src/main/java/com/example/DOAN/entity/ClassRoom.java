package com.example.DOAN.entity;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "classrooms")
public class ClassRoom {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String className;

    // 1 lớp có nhiều sinh viên
    @OneToMany(mappedBy = "classRoom")
    private List<Student> students;
}
