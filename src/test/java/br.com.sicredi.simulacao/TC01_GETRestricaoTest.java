package br.com.sicredi.simulacao;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.sppackage br.com.sicredi.simulacao;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.hamcrest.CoreMatchers.containsString;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@SpringBootTest
@AutoConfigureMockMvc

public class TC01_GETRestricaoTest {
    @Autowired
    private MockMvc mockMvc;
    /*
         CT01 - Consultar CPF com Restrição
         Dado o endpoint da consulta de CPF com Restrição
         Quando consultar um CPF com Restrição
         Então deverá retornar Status 200 com uma mensagem de validação
         */
    @Test
    public void cpf_com_restricao() throws Exception {

        this.mockMvc.perform(get("http://localhost:8080/api/v1/restricoes/97093236014"))
                .andDo(print())
                .andExpect(status().is(Integer.parseInt("200")))
                .andExpect(content().string(containsString("O CPF 97093236014 tem problema")));

    }
            /*
          CT02 - Consultar CPF sem Restrição
          Dado o endpoint da consulta de CPF
          Quando consultar um CPF sem Restrição
          Então deverá retornar Status 204
          */
    @Test
    public void cpf_sem_restricao() throws Exception {

        this.mockMvc.perform(get("http://localhost:8080/api/v1/restricoes/97093236010"))
                .andDo(print())
                .andExpect(status().is(Integer.parseInt("204")));
    }



}
