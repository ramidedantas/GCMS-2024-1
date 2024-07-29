package br.edu.ifpe.recife.gcms.WebApp;

import org.junit.jupiter.api.Test; 
import org.springframework.boot.test.context.SpringBootTest; 
 
import static org.hamcrest.Matchers.containsString; 
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get; 
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print; 
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content; 
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status; 
 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc; 
import org.springframework.test.web.servlet.MockMvc; 
 
@SpringBootTest 
@AutoConfigureMockMvc 
class WebAppApplicationTests
{
  @Autowired 
  private MockMvc mockMvc; 
 
  @Test 
  public void shouldReturnDefaultMessage() throws Exception
  {
    this.mockMvc.perform(get("/")) 
        .andDo(print()).andExpect(status().isOk()) 
        .andExpect(content() 
          .string(containsString("Hello, World"))); 
  } 
  
  @Test 
  public void shouldReturnFulano() throws Exception
  {
    this.mockMvc.perform(get("/fulano")) 
        .andDo(print()).andExpect(status().isOk()) 
        .andExpect(content() 
          .string(containsString("Hello, Fulano"))); 
  }

  @Test
  public void shouldReturnAlbert() throws Exception
  {
    this.mockMvc.perform(get("/albert"))
            .andDo(print()).andExpect(status().isOk())
            .andExpect(content()
                    .string(containsString("Hello, Albert")));
  }

  @Test
  public void shouldReturnBranchAlbertAlvin() throws Exception {
    this.mockMvc.perform(get("/branch/albert-alvin"))
            .andDo(print()).andExpect(status().isOk())
            .andExpect(content()
                    .string(containsString("Hello from branch albert-alvin!")));
  }

  public void shouldReturnJoaoGouveia() throws Exception {
    this.mockMvc.perform(get("/JoaoGouveia"))
            .andDo(print()).andExpect(status().isOk())
            .andExpect(content()
                    .string(containsString("Hello, João Gouveia")));
  }

}
