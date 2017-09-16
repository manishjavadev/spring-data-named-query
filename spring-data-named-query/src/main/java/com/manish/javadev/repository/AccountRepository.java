package com.manish.javadev.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.manish.javadev.model.AccountEntity;

public interface AccountRepository extends CrudRepository<AccountEntity, Long> {

	List<AccountEntity> getByAccountType(String string);

	List<AccountEntity> getByStartDateBetween(Date startDate, Date endDate);
}
