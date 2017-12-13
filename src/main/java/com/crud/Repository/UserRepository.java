package com.crud.Repository;

import com.crud.Model.FirstModel;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<FirstModel, Long> {
}
