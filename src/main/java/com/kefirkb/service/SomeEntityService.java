package com.kefirkb.service;

import com.kefirkb.model.SomeEntity;

import java.io.IOException;
import java.util.List;

public interface SomeEntityService {
    List<SomeEntity> findAllFirstEntity() throws IOException;
}
