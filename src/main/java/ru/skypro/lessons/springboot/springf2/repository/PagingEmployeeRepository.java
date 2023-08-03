package ru.skypro.lessons.springboot.springf2.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import ru.skypro.lessons.springboot.springf2.pojo.Employee;

public interface PagingEmployeeRepository extends PagingAndSortingRepository<Employee,Integer> {

}
