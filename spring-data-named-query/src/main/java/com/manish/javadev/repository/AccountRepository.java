package com.manish.javadev.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.manish.javadev.model.AccountEntity;

public interface AccountRepository extends CrudRepository<AccountEntity, Long> {

	List<AccountEntity> getByAccountType(String accountType);

	List<AccountEntity> getByStartDateBetween(@Param("startDate") Date startDate, @Param("endDate") Date endDate);
}
