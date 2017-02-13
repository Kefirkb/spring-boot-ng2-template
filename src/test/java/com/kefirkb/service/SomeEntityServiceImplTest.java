package com.kefirkb.service;

import com.kefirkb.model.SomeEntity;
import com.kefirkb.repository.SomeEntityRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.List;

import static java.util.Collections.singletonList;
import static junit.framework.TestCase.assertEquals;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class SomeEntityServiceImplTest {

    @Mock
    private SomeEntityRepository repository;

    @InjectMocks
    private SomeEntityServiceImpl service;

    @Test
    public void findAllFirstEntity() throws Exception {
        when(repository.findAllFirstEntity()).thenReturn(buildListSomeEntity());
        List<SomeEntity> result = service.findAllFirstEntity();
        assertEquals(result.size(), 1);
        verify(repository, times(1)).findAllFirstEntity();
    }

    private List<SomeEntity> buildListSomeEntity() {
        return singletonList(SomeEntity
                .builder()
                .name("name1")
                .code("aaa111")
                .build());
    }

}