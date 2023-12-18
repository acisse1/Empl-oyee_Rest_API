package cisse.cm.springBootWebApp.repository;

import cisse.cm.springBootWebApp.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface employeeRepository extends JpaRepository<Employee, Long> {
}
