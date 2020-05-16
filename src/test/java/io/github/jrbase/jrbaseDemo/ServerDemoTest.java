package io.github.jrbase.jrbaseDemo;

import io.github.jrbase.JRServerEmbedded;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.IOException;

class ServerDemoTest {

    private static final JRServerEmbedded jrServerEmbedded = new JRServerEmbedded("6379");

    @BeforeAll
    static void start() throws IOException {
        jrServerEmbedded.start();
    }

    @AfterAll
    static void end() {
        jrServerEmbedded.stop();
    }

    @Test
    void main() throws InterruptedException {
        // access redis operate
        Thread.sleep(10 * 1000);
    }
}