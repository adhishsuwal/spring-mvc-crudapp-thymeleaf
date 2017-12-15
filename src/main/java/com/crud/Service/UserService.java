package com.crud.Service;

import com.crud.Model.FirstModel;

import java.util.List;

public interface UserService {

    FirstModel findOne(Long id);
    List<FirstModel> findAll();
    FirstModel addUser(FirstModel firstModel);
    void removeOne(Long id);
    FirstModel updateUser(FirstModel firstModel);
}
