package br.edu.ifpe.recife.gcms.WebApp;

import static org.hamcrest.Matchers.containsString;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class WebAppApplicationTests {
        @Autowired
        private MockMvc mockMvc;

        @Test
        public void shouldReturnDefaultMessage() throws Exception {
                this.mockMvc.perform(get("/"))
                                .andDo(print()).andExpect(status().isOk())
                                .andExpect(content()
                                                .string(containsString("Hello, World")));
        }

        @Test
        public void shouldReturnFulano() throws Exception {
                this.mockMvc.perform(get("/fulano"))
                                .andDo(print()).andExpect(status().isOk())
                                .andExpect(content()
                                                .string(containsString("Hello, Fulano")));
        }

        @Test
        public void shouldReturnAlbert() throws Exception {
                this.mockMvc.perform(get("/albert"))
                                .andDo(print()).andExpect(status().isOk())
                                .andExpect(content()
                                                .string(containsString("Hello, Albert")));
        }

        @Test
        public void shouldReturnHelloFromAlbertsFork() throws Exception {
                this.mockMvc.perform(get("/fork/albert"))
                                .andDo(print()).andExpect(status().isOk())
                                .andExpect(content()
                                                .string(containsString("Hello from Albert's fork!")));
        }

        @Test
        public void shouldReturnBranchAlbertAlvin() throws Exception {
                this.mockMvc.perform(get("/branch/albert-alvin"))
                                .andDo(print()).andExpect(status().isOk())
                                .andExpect(content()
                                                .string(containsString("Hello from branch albert-alvin!")));
        }

        @Test
        public void shouldReturnJoaoGouveia() throws Exception {
                this.mockMvc.perform(get("/JoaoGouveia"))
                                .andDo(print()).andExpect(status().isOk())
                                .andExpect(content()
                                                .string(containsString("Hello, João Gouveia")));
        }
        
        @Test
        public void shouldReturnBranchJoaoGouveia() throws Exception {
                this.mockMvc.perform(get("/branch/joao-gouveia"))
                                .andDo(print()).andExpect(status().isOk())
                                .andExpect(content()
                                                .string(containsString("Hello from branch joao-gouveia!")));
        }


        @Test
        public void shouldReturnRichardson() throws Exception {
                this.mockMvc.perform(get("/richardson"))
                                .andDo(print()).andExpect(status().isOk())
                                .andExpect(content()
                                                .string(containsString("Hello, Richardson Silva!")));
        }

        @Test
        public void shouldReturnBranchRichardsonSilva() throws Exception {
                this.mockMvc.perform(get("/branch/richardson-silva"))
                                .andDo(print()).andExpect(status().isOk())
                                .andExpect(content()
                                                .string(containsString("Hello from branch richardson-silva!")));
        }

        @Test
        public void shouldReturnVictor() throws Exception {
                this.mockMvc.perform(get("/victor"))
                                .andDo(print()).andExpect(status().isOk())
                                .andExpect(content()
                                                .string(containsString("Hello, Victor!")));
        }

        @Test
        public void shouldReturnForkVictor() throws Exception {
                this.mockMvc.perform(get("/fork/victor"))
                                .andDo(print()).andExpect(status().isOk())
                                .andExpect(content()
                                                .string(containsString("Hello, Fork Victor!")));
        }
        
        @Test
        public void shouldReturnAugusto() throws Exception {
                this.mockMvc.perform(get("/augusto"))
                        .andDo(print()).andExpect(status().isOk())
                        .andExpect(content()
                                .string(containsString("Hello, Augusto!")));
        }


        @Test
        public void shouldReturnBranchVictor() throws Exception {
                this.mockMvc.perform(get("/branch/victor"))
                                .andDo(print()).andExpect(status().isOk())
                                .andExpect(content()
                                                .string(containsString("Hello, Branch Victor!")));
        }

        @Test
        public void shouldReturnFernando() throws Exception {
                this.mockMvc.perform(get("/fernando"))
                                .andDo(print()).andExpect(status().isOk())
                                .andExpect(content()
                                                .string(containsString("Hello, Fernando!")));
        }

        @Test
        public void shouldReturnJulia() throws Exception {
                this.mockMvc.perform(get("/julia"))
                                .andDo(print()).andExpect(status().isOk())
                                .andExpect(content()
                                                .string(containsString("Hello, Julia!")));
        }

        @Test
        public void shouldReturnhotfix() throws Exception {
                this.mockMvc.perform(get("/hotfix"))
                                .andDo(print()).andExpect(status().isOk())
                                .andExpect(content()
                                                .string(containsString("Hello, Hotfix!")));
        }

        @Test
        public void shouldReturnJoaoTorpe() throws Exception {
                this.mockMvc.perform(get("/joaoTorpe"))
                                .andDo(print()).andExpect(status().isOk())
                                .andExpect(content()
                                                .string(containsString("Hello, joaoTorpe!")));
        }
        
        @Test
        public void shouldReturnRinaldoHub() throws Exception {
                this.mockMvc.perform(get("/rinaldohub"))
                                .andDo(print()).andExpect(status().isOk())
                                .andExpect(content()
                                                .string(containsString("Hello, RinaldoHub!")));
        }
        
        @Test
        public void shouldReturnJamilly() throws Exception {
                this.mockMvc.perform(get("/jamilly"))
                        .andDo(print()).andExpect(status().isOk())
                        .andExpect(content()
                                .string(containsString("Hello, Jamilly!")));
        }
        
        public void shouldAurianLira() throws Exception {
            this.mockMvc.perform(get("/aurianlira"))
                    .andDo(print()).andExpect(status().isOk())
                    .andExpect(content()
                            .string(containsString("Hello, Aurian Lira!")));
    }
        @Test
        public void shouldReturnRaul() throws Exception {
                this.mockMvc.perform(get("/raul"))
                                .andDo(print()).andExpect(status().isOk())
                                .andExpect(content()
                                                .string(containsString("Hello, Raul!")));
        }
        
        @Test
        public void shouldReturnGustavo() throws Exception {
                this.mockMvc.perform(get("/gustavo"))
                                .andDo(print()).andExpect(status().isOk())
                                .andExpect(content()
                                                .string(containsString("Hello, Gustavo!")));
        }
        
        @Test
        public void shouldReturnBranchGustavo() throws Exception {
                this.mockMvc.perform(get("/branch/gustavo"))
                                .andDo(print()).andExpect(status().isOk())
                                .andExpect(content()
                                                .string(containsString("Hello, Branch Gustavo!")));
        }
}
