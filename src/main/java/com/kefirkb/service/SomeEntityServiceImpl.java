package com.kefirkb.service;

import com.kefirkb.model.SomeEntity;
import com.kefirkb.repository.SomeEntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service
public class SomeEntityServiceImpl implements SomeEntityService {

    @Autowired
    private SomeEntityRepository repository;

    @Override
    public List<SomeEntity> findAllFirstEntity() throws IOException {
        return repository.findAllFirstEntity();
    }
}
