package br.com.sicredi.simulacao;
import br.com.sicredi.simulacao.controller.SimulacaoController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import static org.hamcrest.CoreMatchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class SimulacaoServiceTest {

    @Autowired
    private MockMvc mockMvc;
    private SimulacaoController restController;

    @Test
    //Consultar uma simulação pelo CPF valido
    public void GET_ConsultaCpf_valido() throws Exception {
        this.mockMvc.perform(get("http://localhost:8888/api/v1/simulacoes/17822386034"))
                .andDo(print())
                .andExpect(status().is(200))
                .andExpect(content().string(containsString("Deltrano")));
    }

    @Test
    //Consultar uma simulação pelo CPF
    public void GET_ConsultaCpf_invalido() throws Exception {
        this.mockMvc.perform(get("http://localhost:8888/api/v1/simulacoes/02949243100"))
                .andDo(print())
                .andExpect(status().is(404))
                .andExpect(content().string(containsString("CPF 02949243100 não encontrado")));
    }

    @Test
    //Lista todas as simulaçoes
    public void GET_lista_ConsultaCpf() throws Exception {

        this.mockMvc.perform(get("http://localhost:8888/api/v1/simulacoes/"))
                .andDo(print())
                .andExpect(status().is(200));
    }

    @Test
    //Alterar uma simulação de um CPF que não existe
    public void PUT_AlterarSimulacao() throws Exception {
        this.mockMvc.perform(put("http://localhost:8888/api/v1/simulacoes/02949243100"))
                .andDo(print())
    package br.com.sicredi.simulacao;
import br.com.sicredi.simulacao.controller.SimulacaoController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import static org.hamcrest.CoreMatchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class SimulacaoServiceTest {

    @Autowired
    private MockMvc mockMvc;
    private SimulacaoController restController;

    @Test
    //Consultar uma simulação pelo CPF valido
    public void GET_ConsultaCpf_valido() throws Exception {
        this.mockMvc.perform(get("http://localhost:8888/api/v1/simulacoes/17822386034"))
                .andDo(print())
                .andExpect(status().is(200))
                .andExpect(content().string(containsString("Deltrano")));
    }

    @Test
    //Consultar uma simulação pelo CPF
    public void GET_ConsultaCpf_invalido() throws Exception {
        this.mockMvc.perform(get("http://localhost:8888/api/v1/simulacoes/02949243100"))
                .andDo(print())
                .andExpect(status().is(404))
                .andExpect(content().string(containsString("CPF 02949243100 não encontrado")));
    }

    @Test
    //Lista todas as simulaçoes
    public void GET_lista_ConsultaCpf() throws Exception {

        this.mockMvc.perform(get("http://localhost:8888/api/v1/simulacoes/"))
                .andDo(print())
                .andExpect(status().is(200));
    }

    @Test
    //Alterar uma simulação de um CPF que não existe
    public void PUT_AlterarSimulacao() throws Exception {
        this.mockMvc.perform(put("http://localhost:8888/api/v1/simulacoes/02949243100"))
                .andDo(print())
                .andExpect(status().is(400));
    }

    @Test
    //Deletar uma simulação de um CPF que não existe
    public void DELETE_Simulacao() throws Exception {
        this.mockMvc.perform(delete("http://localhost:8888/api/v1/simulacoes/13"))
                .andDo(print())
                //.andExpect(status().is(404))
                .andReturn().getResponse();

}


}
