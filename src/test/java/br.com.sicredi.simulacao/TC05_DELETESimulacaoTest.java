package br.com.sicredi.simulacao;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class TC05_DELETESimulacaoTest {

    @Autowired
    private MockMvc mockMvc;
    //   http://localhost:8080/api/v1/simulacoes/999999999999999999999999999

    @Test
         /*
          CT01 - Deletar uma Simulação Existente
          Dado a request de deletar
          Quando o ID existir na base de dados
          Então deverá retornar Status 200
          */
    //Deletar uma simulação de um ID que existe
    public void DELETE_SimulacaoExistente() throws Exception {
        this.mockMvc.perform(delete("http://localhost:8080/api/v1/simulacoes/11"))
                .andDo(print())
                .andExpect(status().is(200))
                .andReturn().getResponse();

    }

    @Test
         /*
          CT02 - Deletar uma Simulação de um ID que não existe
          Dado a request de deletar
          Quando o ID não existir na base de dados
          Então deverá retornar Status 400
          */
    //Deletar uma simulação de um ID que não existe
         public void DELETE_SimulacaoNaoExistente() throws Exception {
        this.mockMvc.perform(delete("http://localhost:8080/api/v1/simulacoes/999999999999999999999999999"))
                .andDo(print())
                .andExpect(status().is(400))
                .andReturn().getResponse();

    }
}
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       package br.com.sicredi.simulacao;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class TC05_DELETESimulacaoTest {

    @Autowired
    private MockMvc mockMvc;
    //   http://localhost:8080/api/v1/simulacoes/999999999999999999999999999

    @Test
         /*
          CT01 - Deletar uma Simulação Existente
          Dado a request de deletar
          Quando o ID existir na base de dados
          Então deverá retornar Status 200
          */
    //Deletar uma simulação de um ID que existe
    public void DELETE_SimulacaoExistente() throws Exception {
        this.mockMvc.perform(delete("http://localhost:8080/api/v1/simulacoes/11"))
                .andDo(print())
                .andExpect(status().is(200))
                .andReturn().getResponse();

    }

    @Test
         /*
          CT02 - Deletar uma Simulação de um ID que não existe
          Dado a request de deletar
          Quando o ID não existir na base de dados
          Então deverá retornar Status 400
          */
    //Deletar uma simulação de um ID que não existe
         public void DELETE_SimulacaoNaoExistente() throws Exception {
        this.mockMvc.perform(delete("http://localhost:8080/api/v1/simulacoes/999999999999999999999999999"))
                .andDo(print())
                .andExpect(status().is(400))
                .andReturn().getResponse();

    }
}
