package net.javaguides.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.javaguides.sms.entity.Teacher;

@Repository
public interface TeacherRepository extends JpaRepository<Teacher, Long> {
    // Add any custom query methods here
}