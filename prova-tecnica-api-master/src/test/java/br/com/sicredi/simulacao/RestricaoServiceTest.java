package br.com.sicredi.simulacao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConpackage br.com.sicredi.simulacao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.hamcrest.CoreMatchers.containsString;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class RestricaoServiceTest {
    @Autowired
    private MockMvc mockMvc;

    /*
     CT01 - Consultar CPF com Restrição
     Dado o endpoint da consulta de CPF com Restrição
     Quando consultar um CPF com Restrição
     Então deverá retornar Status 200 com uma mensagem de validação
     */
    @Test
    public void GET_consultaCpf_com_Restricao() throws Exception {
        //Dado o endpoint da consulta de CPF com Restrição;
        this.mockMvc.perform(get("http://localhost:8888/api/v1/restricoes/24094592008"))
        //Quando consultar um CPF com Restrição;
                .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8))
                .andDo(print())
        //Então deverá retornar Status 200 com uma mensagem de validação;
                .andExpect(status().is(200))
                .andExpect(content().string(containsString("O CPF 24094592008 tem problema")));
    }
    /*
     CT02 - Consultar CPF sem Restrição
     Dado o endpoint da consulta de CPF com Restrição
     Quando consultar um CPF sem Restrição
     Então deverá retornar Status 200 com uma mensagem de validação
     */
    @Test
    public void GET_consultaCpf_sem_Restricao() throws Exception {
        this.mockMvc.perform(get("http://localhost:8888/api/v1/restricoes/02949243100"))
                .andDo(print())
                .andExpect(status().is(204));

}

}


