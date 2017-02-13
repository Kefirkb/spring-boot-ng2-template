package com.kefirkb.controller;

import com.kefirkb.service.SomeEntityService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.test.web.servlet.MockMvc;

import static java.util.Collections.emptyList;
import static org.mockito.Mockito.when;
import static org.springframework.http.MediaType.APPLICATION_JSON_UTF8;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;

@RunWith(MockitoJUnitRunner.class)
public class DataControllerTest {

    private MockMvc mockMvc;

    @Mock
    private SomeEntityService firstEntityService;
    @InjectMocks
    private DataController dataController;


    @Test
    public void getFirst() throws Exception {
        when(firstEntityService.findAllFirstEntity()).thenReturn(emptyList());
        mockMvc = standaloneSetup(dataController).
                build();

        mockMvc.perform(get("/first"))
                .andExpect(content().contentType(APPLICATION_JSON_UTF8))
                .andExpect(status().isOk());
    }

}