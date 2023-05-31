package net.javaguides.sms.service;

import java.util.List;

import net.javaguides.sms.entity.Teacher;

public interface TeacherService {
	List<Teacher> getAllTeachers();
    Teacher getTeacherById(Long id);
    Teacher saveTeacher(Teacher teacher);
    void deleteTeacherById(Long id);
}
