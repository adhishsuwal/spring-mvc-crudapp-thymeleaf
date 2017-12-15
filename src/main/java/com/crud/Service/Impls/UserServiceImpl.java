package com.crud.Service.Impls;

import com.crud.Model.FirstModel;
import com.crud.Repository.UserRepository;
import com.crud.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;

    @Override
    public FirstModel findOne(Long id) {
        return userRepository.findOne(id);
    }

    @Override
    public List<FirstModel> findAll() {
        return (List<FirstModel>) userRepository.findAll();
    }

    @Override
    public FirstModel addUser(FirstModel firstModel) {
        return userRepository.save(firstModel);
    }

    @Override
    public void removeOne(Long id) {
        userRepository.delete(id);
    }

    @Override
    public FirstModel updateUser(FirstModel firstModel) {
        return userRepository.save(firstModel);
    }
}
