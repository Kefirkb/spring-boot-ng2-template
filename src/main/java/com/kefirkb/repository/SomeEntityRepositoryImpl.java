package com.kefirkb.repository;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.kefirkb.model.SomeEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import java.io.File;
import java.io.IOException;
import java.util.List;

@Repository
public class SomeEntityRepositoryImpl implements SomeEntityRepository {

    @Value("${some_entity_file.path}")
    private String filePath;

    @Autowired
    private ObjectMapper mapper;

    @Override
    public List<SomeEntity> findAllFirstEntity() throws IOException {
        return mapper.readValue(new File(filePath), new TypeReference<List<SomeEntity>>() {
        });
    }
}
