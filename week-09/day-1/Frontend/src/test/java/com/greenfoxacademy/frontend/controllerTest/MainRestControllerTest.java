package com.greenfoxacademy.frontend.controllerTest;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import com.greenfoxacademy.frontend.controller.MainRestController;
import org.hamcrest.Matchers;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.mockito.Mockito.when;
import static org.mockito.ArgumentMatchers.*;

import static org.hamcrest.Matchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@RunWith(SpringRunner.class)
@WebMvcTest(MainRestController.class)
public class MainRestControllerTest {

    @Autowired
    MockMvc mockMvc;

    /*
        @MockBean
        ItemService itemService;
        csak akkor kell ha van service
    */
    @Test
    public void doublingTest() throws Exception {
        this.mockMvc.perform(get("/doubling?=input=15"))
                .andExpect(jsonPath("$.result", is(30)));
    }

    @Test
    public void doubling_error_message() throws Exception {
        this.mockMvc.perform(get("/doubling"))
                .andExpect(jsonPath("$.error", is("Please provide an input!")));

    }

    @Test
    public void greeterTest() throws Exception{
        this.mockMvc.perform(get("/greeter?name=Szabi&title=student"))
                .andExpect(jsonPath("$.welcome_message", is("Oh, hi there Szabi, my dear student!")));
    }

    @Test
    public void missingNameAndTitleTest() throws Exception{
        this.mockMvc.perform(get("/greeter"))
                .andExpect(jsonPath("$.error",is("Please provide a name and a title!")));
    }

    @Test
    public void missingNameTest() throws Exception {
        this.mockMvc.perform(get("/greeter?title=student"))
                .andExpect(jsonPath("$.error",is("Please provide a name!")));
    }

    @Test
    public void missingTitleTest() throws Exception{
        this.mockMvc.perform(get("/greeter?name=Szabi"))
                .andExpect(jsonPath("$.error",is("Please provide a title!")));
    }

    @Test
    public void appendATest() throws Exception{
        this.mockMvc.perform(get("/appenda/kuty"))
                .andExpect(jsonPath("$.appended",is("kutya")));
    }

    @Test
    public void appendAErrorTest() throws Exception{
        this.mockMvc.perform(get("/appenda"))
                .andExpect((status().isNotFound()));
    }

    @Test
    public void doUntilSumTest()throws Exception{
        this.mockMvc.perform(post("/dountil/sum")
                .contentType(MediaType.APPLICATION_JSON)
                .content("{\"until\": 5}"))
                .andExpect(jsonPath("$.result",is(15)));
    }
    @Test
    public void doUntilFactorTest() throws Exception{
        this.mockMvc.perform(post("/dountil/factor")
                .contentType(MediaType.APPLICATION_JSON)
                .content("{\"until\": 5}"))
                .andExpect(jsonPath("$.result",is(120)));
    }
}

