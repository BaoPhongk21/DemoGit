package com.example.DOAN.entity;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;

    // N sinh viên thuộc 1 lớp
    @ManyToOne
    @JoinColumn(name = "classroom_id")
    private ClassRoom classRoom;

    // 1 sinh viên học nhiều môn
    @OneToMany(mappedBy = "student")
    private List<Enrollment> enrollments;
}
