package com.kefirkb.repository;

import com.kefirkb.model.SomeEntity;

import java.io.IOException;
import java.util.List;

public interface SomeEntityRepository {
    List<SomeEntity> findAllFirstEntity() throws IOException;
}
