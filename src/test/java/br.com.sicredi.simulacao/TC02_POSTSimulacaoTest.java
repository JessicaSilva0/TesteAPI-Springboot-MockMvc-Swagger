package br.com.sicredi.simulacao;

import br.com.sicredi.simulacao.dto.SimulacaoDTO;
import br.com.sicredi.simulacao.entity.Simulacao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import java.math.BigDecimal;


import static org.hamcrest.CoreMatchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class TC02_POSTSimulacaoTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
     /*
         CT01 - Criar uma Simulação com Sucesso
         Dado o endpoint de Criar uma simulação por Sucesso
         Quando criar uma simulação
         Então retornar o status 201
         */
    public void CT01_CriarSimulacaoComSucesso() throws Exception {
        SimulacaoDTO novaSimulacaodto = new SimulacaoDTO();
        novaSimulacaodto.setId(14L);
        novaSimulacaodto.setNome("Maria das Dores");
        novaSimulacaodto.setCpf("02948852210");
        novaSimulacaodto.setEmail("mariadasdores@hotmail.com");
        novaSimulacaodto.setValor(BigDecimal.valueOf(25000));
        novaSimulacaodto.setParcelas(5);
        novaSimulacaodto.setSeguro(true);

        Simulacao simulacaoEsperada = new Simulacao();
        simulacaoEsperada.setId(novaSimulacaodto.getId());
        simulacaoEsperada.setNome(novaSimulacaodto.getNome());
        simulacaoEsperada.setCpf(novaSimulpackage br.com.sicredi.simulacao;

import br.com.sicredi.simulacao.dto.SimulacaoDTO;
import br.com.sicredi.simulacao.entity.Simulacao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import java.math.BigDecimal;


import static org.hamcrest.CoreMatchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class TC02_POSTSimulacaoTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
     /*
         CT01 - Criar uma Simulação com Sucesso
         Dado o endpoint de Criar uma simulação por Sucesso
         Quando criar uma simulação
         Então retornar o status 201
         */
    public void CT01_CriarSimulacaoComSucesso() throws Exception {
        SimulacaoDTO novaSimulacaodto = new SimulacaoDTO();
        novaSimulacaodto.setId(14L);
        novaSimulacaodto.setNome("Maria das Dores");
        novaSimulacaodto.setCpf("02948852210");
        novaSimulacaodto.setEmail("mariadasdores@hotmail.com");
        novaSimulacaodto.setValor(BigDecimal.valueOf(25000));
        novaSimulacaodto.setParcelas(5);
        novaSimulacaodto.setSeguro(true);

        Simulacao simulacaoEsperada = new Simulacao();
        simulacaoEsperada.setId(novaSimulacaodto.getId());
        simulacaoEsperada.setNome(novaSimulacaodto.getNome());
        simulacaoEsperada.setCpf(novaSimulacaodto.getCpf());
        simulacaoEsperada.setEmail(novaSimulacaodto.getEmail());
        simulacaoEsperada.setValor(novaSimulacaodto.getValor());
        simulacaoEsperada.setParcelas(novaSimulacaodto.getParcelas());
        simulacaoEsperada.setSeguro(novaSimulacaodto.isSeguro());


        mockMvc.perform(post("http://localhost:8080/api/v1/simulacoes")
                        .contentType(MediaType.APPLICATION_JSON_UTF8)
                        .accept(MediaType.APPLICATION_JSON_UTF8)
                        .content(JsonUtils.request(novaSimulacaodto)))
                         .andDo(print())
                         .andExpect(status().is(201))
                         .andExpect(content().json(JsonUtils.request(simulacaoEsperada)));


}
    @Test
       /*
         CT02 - Criar uma Simulação com Problema
         Dado o endpoint de Criar uma simulação com Problema
         Quando criar uma simulação com problema
         Então retornar o status 400
         */
    public void CT02_CriarSimulacaoComErros() throws Exception {
        SimulacaoDTO novaSimulacaodto = new SimulacaoDTO();
        novaSimulacaodto.setId(13L);
        novaSimulacaodto.setNome("Maria das Dores");
        novaSimulacaodto.setCpf("02948852210");
        novaSimulacaodto.setEmail("");
        novaSimulacaodto.setValor(BigDecimal.valueOf(5555000));
        novaSimulacaodto.setParcelas(5);
        novaSimulacaodto.setSeguro(true);

        Simulacao simulacaoEsperada = new Simulacao();
        simulacaoEsperada.setId(novaSimulacaodto.getId());
        simulacaoEsperada.setNome(novaSimulacaodto.getNome());
        simulacaoEsperada.setCpf(novaSimulacaodto.getCpf());
        simulacaoEsperada.setEmail(novaSimulacaodto.getEmail());
        simulacaoEsperada.setValor(novaSimulacaodto.getValor());
        simulacaoEsperada.setParcelas(novaSimulacaodto.getParcelas());
        simulacaoEsperada.setSeguro(novaSimulacaodto.isSeguro());


        mockMvc.perform(post("http://localhost:8080/api/v1/simulacoes")
                        .contentType(MediaType.APPLICATION_JSON_UTF8)
                        .accept(MediaType.APPLICATION_JSON_UTF8)
                        .content(JsonUtils.request(novaSimulacaodto)))
                        .andDo(print())
                        .andExpect(status().is(400))
                        .andExpect(content().string(containsString("Valor deve ser menor ou igual a R$ 40.000")))
                        .andExpect(content().string(containsString("E-mail deve ser um e-mail válido")));

    }

    @Test
     /*
         CT03 - Criar uma Simulação para um mesmo CPF
         Dado o endpoint de Criar uma Simulação para um mesmo CPF
         Quando criar uma simulação com CPF já existente
         Então retornar o status 409
         */
    public void CT03_CriarSimulacaoComCpfDuplicado() throws Exception {
        SimulacaoDTO novaSimulacaodto2 = new SimulacaoDTO();
        novaSimulacaodto2.setId(11L);
        novaSimulacaodto2.setNome("Maria das Dores");
        novaSimulacaodto2.setCpf("17822386034");
        novaSimulacaodto2.setEmail("mariadasdores@hotmail.com");
        novaSimulacaodto2.setValor(BigDecimal.valueOf(25000));
        novaSimulacaodto2.setParcelas(5);
        novaSimulacaodto2.setSeguro(true);

        Simulacao simulacaoEsperada2 = new Simulacao();
        simulacaoEsperada2.setId(novaSimulacaodto2.getId());
        simulacaoEsperada2.setNome(novaSimulacaodto2.getNome());
        simulacaoEsperada2.setCpf(novaSimulacaodto2.getCpf());
        simulacaoEsperada2.setEmail(novaSimulacaodto2.getEmail());
        simulacaoEsperada2.setValor(novaSimulacaodto2.getValor());
        simulacaoEsperada2.setParcelas(novaSimulacaodto2.getParcelas());
        simulacaoEsperada2.setSeguro(novaSimulacaodto2.isSeguro());


        mockMvc.perform(post("http://localhost:8080/api/v1/simulacoes")
                        .contentType(MediaType.APPLICATION_JSON_UTF8)
                        .accept(MediaType.APPLICATION_JSON_UTF8)
                        .content(JsonUtils.request(novaSimulacaodto2)))
                        .andDo(print())
                        .andExpect(status().is(400))
                        .andExpect(content().string(containsString("CPF duplicado")));



    }



}