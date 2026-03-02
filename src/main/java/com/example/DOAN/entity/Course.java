package com.example.DOAN.entity;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "courses")
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String courseName;
    private int credit;

    @OneToMany(mappedBy = "course")
    private List<Enrollment> enrollments;
}
