package com.example.DOAN.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "enrollments")
public class Enrollment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // nhiều bản ghi thuộc 1 sinh viên
    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;

    // nhiều bản ghi thuộc 1 môn
    @ManyToOne
    @JoinColumn(name = "course_id")
    private Course course;

    private Double score;
}
