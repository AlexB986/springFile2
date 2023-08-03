package ru.skypro.lessons.springboot.springf2.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.skypro.lessons.springboot.springf2.dto.ReportDTO;
import ru.skypro.lessons.springboot.springf2.pojo.Report;

import java.util.List;

@Repository
public interface ReportRepository extends CrudRepository<Report, Integer> {

    /**
     * POST формировать  статистикой по отделам:
     */

    @Query("SELECT new ru.skypro.lessons.springboot.springf.dto. " +
            "ReportDTO(e.position.role ,count (e.employeeId),max(e.salary),min(e.salary),avg (e.salary))FROM Employee  e GROUP BY e .position")
    List<ReportDTO> buildReport();



}