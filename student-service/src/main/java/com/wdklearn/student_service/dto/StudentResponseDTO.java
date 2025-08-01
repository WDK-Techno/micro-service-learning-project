package com.wdklearn.student_service.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class StudentResponseDTO {
    private String id;
    private String name;
    private int age;
    private String gender;
    private SchoolDTO school;
}
