package br.com.stream.collectors;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.util.ArrayList;
import java.util.Arrays;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@DisplayName("Stream: Collectors")
public class CollectorsUtilTest {

    private CollectorsUtil util;

    @BeforeEach
    void init() {
        util = new CollectorsUtil();
    }

    @Test
    @DisplayName("String ids with list null.")
    void stringIdsWithListNull() {
        util.setList(null);
        assertNull(util.getStringIds());
    }

    @Test
    @DisplayName("String ids with list empty.")
    void stringIdsWithListEmpty() {
        util.setList(new ArrayList<>());
        assertNull(util.getStringIds());
    }

    @Test
    @DisplayName("String ids with list empty.")
    void stringIdsOneElement() {
        util.setList(new ArrayList<>(Arrays.asList("1")));
        assertEquals("1", util.getStringIds());
    }

    @Test
    @DisplayName("String ids with list empty.")
    void stringIdsMultipleElements() {
        util.setList(new ArrayList<>(Arrays.asList("1", "2", "3")));
        assertEquals("1,2,3", util.getStringIds());
    }
}