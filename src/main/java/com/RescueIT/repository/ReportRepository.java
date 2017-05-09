package com.RescueIT.repository;

import com.RescueIT.domain.Report;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


/**
 * Created by Filip on 08.05.2017.
 */
@Repository
public interface ReportRepository extends CrudRepository<Report, Long>{

}
