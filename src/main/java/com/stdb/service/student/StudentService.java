package com.stdb.service.student;

import com.stdb.entity.Student;

import java.util.List;
import java.util.Map;

public interface StudentService {
    Student createStudent(Student student);

    Student editStudent(Student student, int studentId);

    void deleteStudent(int studentId);

    Student getById(int studentId);

    Student getByName(String name);

    List<Student> getByGroup(String[] group, Map<String, Object> filters);

    List<Student> getByCourse(Integer[] course, Map<String, Object> filters);

    List<Student> getByDisciplineAndMark(List<Integer> groupIds,int idDiscipline, int mark);
}
