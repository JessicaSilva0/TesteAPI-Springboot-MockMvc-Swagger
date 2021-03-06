package br.com.sicredi.simulacao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.hamcrest.CoreMatchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc

public class TC03_GETSimulacaoTest {
    @Autowired
    private MockMvc mockMvc;

    @Test
          /*
         CT01 - Listar todas as simulações cadastradas
         Dado o endpoint de Listar simulação cadastrada
         Quando consumir a request
         Então deverá retornar a lista com todas as simulações cadastradas
         */
    public void CT01_SimulacaoConsultaLista() throws Exception {

        this.mockMvc.perform(get("http://localhost:8080/api/v1/simulacoes/"))
                .andDo(print())
                .andExpect(status().is(200));
                    if (MockMvcResultMatchers.request().equals(status().is(200))) {

                    } else{
                        if (MockMvcResultMatchers.request().equals(status().is(204)));
                    }
    }

    @Test
       /*
         CT02 - Consultar uma simulação pelo CPF valido
         Dado o endpoint de Consultar Simulação pelo CPF Valido
         Quando consultar um CPF
         Então deverá retornar a simulação cadastrada
         */

      public void CT02_SimulacaoConsultaCPF_valido() throws Exception {

          this.mockMvc.perform(get("http://localhost:8080/api/v1/simulacoes/17822386034"))
                  .andDo(print())
                  .andExpect(status().is(200));

      }

    @Test
    /*
         CT03 - Consultar uma simulação pelo CPF invalido
         Dado o endpoint de Consultar Simulação pelo CPF
         Quando consultar um CPF
         Então deverá retornar status 404 e mensagem de erro
         */
    public void CT03_SimulacaoConsultaCPF_invalido() throws Exception {

        this.mockMvc.perform(get("http://localhost:8080/api/v1/simulacoes/02949243100"))
                .andDo(print())
                .andExpect(status().is(404))
                .andExpect(content().string(containsString("CPF 02949243100 não encontrado")));
    }


































        /*
         CT07 - Alterar uma simulação existente
         Dado o endpoint de Alterar uma simulação de um CPF já cadastrado.
         Quando Alterar um CPF que esteja cadastrado
         Então a alteração poderá ser feita em qualquer atributo
         */



        /*
         CT08 - Alterar uma simulação de um CPF que não existe
         Dado o endpoint de Alterar uma simulação de um CPF que não existe
         Quando Alterar o CPF
         Então deverá retornar Status 404 com uma mensagem de validação.
         */


    /*
   CT09 - Remover uma simulação
   Dado o endpoint de Remover uma simulação
   Quando informar o numero do CPF que possui simulação
   Então deverá retornar Status 204 com uma mensagem de validação.
   */

    /*
     CT10 - Deletar uma simulação de um CPF que não existe
     Dado o endpoint de Deletar de um CPF simulação que não existe
     Quando informar o numero do CPF que não existe
     Então deverá retornar Status 404 com uma mensagem de validação.
     */

}
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                package br.com.sicredi.simulacao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.hamcrest.CoreMatchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc

public class TC03_GETSimulacaoTest {
    @Autowired
    private MockMvc mockMvc;

    @Test
          /*
         CT01 - Listar todas as simulações cadastradas
         Dado o endpoint de Listar simulação cadastrada
         Quando consumir a request
         Então deverá retornar a lista com todas as simulações cadastradas
         */
    public void CT01_SimulacaoConsultaLista() throws Exception {

        this.mockMvc.perform(get("http://localhost:8080/api/v1/simulacoes/"))
                .andDo(print())
                .andExpect(status().is(200));
                    if (MockMvcResultMatchers.request().equals(status().is(200))) {

                    } else{
                        if (MockMvcResultMatchers.request().equals(status().is(204)));
                    }
    }

    @Test
       /*
         CT02 - Consultar uma simulação pelo CPF valido
         Dado o endpoint de Consultar Simulação pelo CPF Valido
         Quando consultar um CPF
         Então deverá retornar a simulação cadastrada
         */

      public void CT02_SimulacaoConsultaCPF_valido() throws Exception {

          this.mockMvc.perform(get("http://localhost:8080/api/v1/simulacoes/17822386034"))
                  .andDo(print())
                  .andExpect(status().is(200));

      }

    @Test
    /*
         CT03 - Consultar uma simulação pelo CPF invalido
         Dado o endpoint de Consultar Simulação pelo CPF
         Quando consultar um CPF
         Então deverá retornar status 404 e mensagem de erro
         */
    public void CT03_SimulacaoConsultaCPF_invalido() throws Exception {

        this.mockMvc.perform(get("http://localhost:8080/api/v1/simulacoes/02949243100"))
                .andDo(print())
                .andExpect(status().is(404))
                .andExpect(content().string(containsString("CPF 02949243100 não encontrado")));
    }


































        /*
         CT07 - Alterar uma simulação existente
         Dado o endpoint de Alterar uma simulação de um CPF já cadastrado.
         Quando Alterar um CPF que esteja cadastrado
         Então a alteração poderá ser feita em qualquer atributo
         */



        /*
         CT08 - Alterar uma simulação de um CPF que não existe
         Dado o endpoint de Alterar uma simulação de um CPF que não existe
         Quando Alterar o CPF
         Então deverá retornar Status 404 com uma mensagem de validação.
         */


    /*
   CT09 - Remover uma simulação
   Dado o endpoint de Remover uma simulação
   Quando informar o numero do CPF que possui simulação
   Então deverá retornar Status 204 com uma mensagem de validação.
   */

    /*
     CT10 - Deletar uma simulação de um CPF que não existe
     Dado o endpoint de Deletar de um CPF simulação que não existe
     Quando informar o numero do CPF que não existe
     Então deverá retornar Status 404 com uma mensagem de validação.
     */

}
