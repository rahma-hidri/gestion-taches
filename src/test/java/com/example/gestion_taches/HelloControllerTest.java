package com.example.gestion_taches;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HelloControllerTest {
    @Test
    public void testIndex() {
        HelloController controller = new HelloController();
        assertEquals("Application de gestion des taches - OK", controller.index());
    }
}
