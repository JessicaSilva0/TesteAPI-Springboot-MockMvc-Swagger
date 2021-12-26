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
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class TC04_PUTSimulacaoTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
     /*
         CT01 - Criar uma Simulação com Sucesso
         Dado o endpoint de Criar uma simulação por Sucesso
         Quando criar uma simulação
         Então retornar o status 201
         */


    public void CT01_AlterarSimulacaoNaoExistente() throws Exception {
        SimulacaoDTO novaSimulacaodto = new SimulacaoDTO();
        novaSimulacaodto.setId(11L);
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



        mockMvc.perform(put("http://localhost:8080/api/v1/simulacoes/02553862067")
                        .contentType(MediaType.APPLICATION_JSON_UTF8)
                        .accept(MediaType.APPLICATION_JSON_UTF8)
                        .content(JsonUtils.request(novaSimulacaodto)))
                         .andDo(print())
                        .andExpect(status().is(404))
                        .andExpect(content().string(containsString("CPF 02553862067 não encontrado")));


}

    @Test
     /*
         CT01 - Alterar uma Simulação existente
         Dado o endpoint de alterar uma simulação existente
         Quando
         Então retornar o status 201
         */


    public void CT02_AlterarSimulacaoExistente() throws Exception {
        SimulacaoDTO novaSimulacaodto = new SimulacaoDTO();
        novaSimulacaodto.setId(11L);
        novaSimulacaodto.setNome("Maria das Gripes");
        novaSimulacaodto.setCpf("02948852210");
        novaSimulacaodto.setEmail("mariadasgripess@hotmail.com");
        novaSimulacaodto.setValor(BigDecimal.valueOf(27000));
        novaSimulacaodto.setParcelas(3);
        novaSimulacaodto.setSeguro(true);

        Simulacao simulacaoEsperada = new Simulacao();
        simulacaoEsperada.setId(novaSimulacaodto.getId());
        simulacaoEsperada.setNome(novaSimulacaodto.getNome());
        simulacaoEsperada.setCpf(novaSimulacaodto.getCpf());
        simulacaoEsperada.setEmail(novaSimulacaodto.getEmail());
        simulacaoEsperada.setValor(novaSimulacaodto.getValor());package br.com.sicredi.simulacao;

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
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class TC04_PUTSimulacaoTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
     /*
         CT01 - Criar uma Simulação com Sucesso
         Dado o endpoint de Criar uma simulação por Sucesso
         Quando criar uma simulação
         Então retornar o status 201
         */


    public void CT01_AlterarSimulacaoNaoExistente() throws Exception {
        SimulacaoDTO novaSimulacaodto = new SimulacaoDTO();
        novaSimulacaodto.setId(11L);
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



        mockMvc.perform(put("http://localhost:8080/api/v1/simulacoes/02553862067")
                        .contentType(MediaType.APPLICATION_JSON_UTF8)
                        .accept(MediaType.APPLICATION_JSON_UTF8)
                        .content(JsonUtils.request(novaSimulacaodto)))
                         .andDo(print())
                        .andExpect(status().is(404))
                        .andExpect(content().string(containsString("CPF 02553862067 não encontrado")));


}

    @Test
     /*
         CT01 - Alterar uma Simulação existente
         Dado o endpoint de alterar uma simulação existente
         Quando
         Então retornar o status 201
         */


    public void CT02_AlterarSimulacaoExistente() throws Exception {
        SimulacaoDTO novaSimulacaodto = new SimulacaoDTO();
        novaSimulacaodto.setId(11L);
        novaSimulacaodto.setNome("Maria das Gripes");
        novaSimulacaodto.setCpf("02948852210");
        novaSimulacaodto.setEmail("mariadasgripess@hotmail.com");
        novaSimulacaodto.setValor(BigDecimal.valueOf(27000));
        novaSimulacaodto.setParcelas(3);
        novaSimulacaodto.setSeguro(true);

        Simulacao simulacaoEsperada = new Simulacao();
        simulacaoEsperada.setId(novaSimulacaodto.getId());
        simulacaoEsperada.setNome(novaSimulacaodto.getNome());
        simulacaoEsperada.setCpf(novaSimulacaodto.getCpf());
        simulacaoEsperada.setEmail(novaSimulacaodto.getEmail());
        simulacaoEsperada.setValor(novaSimulacaodto.getValor());
        simulacaoEsperada.setParcelas(novaSimulacaodto.getParcelas());
        simulacaoEsperada.setSeguro(novaSimulacaodto.isSeguro());



        mockMvc.perform(put("http://localhost:8080/api/v1/simulacoes/66414919004")
                        .contentType(MediaType.APPLICATION_JSON_UTF8)
                        .accept(MediaType.APPLICATION_JSON_UTF8)
                        .content(JsonUtils.request(novaSimulacaodto)))
                        .andDo(print())
                        .andExpect(status().is(200));
    }
}