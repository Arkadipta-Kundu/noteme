package org.arkadipta.noteme;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.arkadipta.noteme.repository.NoteRepository;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE)
class NotemeApplicationTests {

    @MockitoBean
    private NoteRepository noteRepository;

    @Test
    void contextLoads() {
        // Test passes if Spring context loads successfully
        // MongoDB repository is mocked, so no actual database connection needed
    }

}
