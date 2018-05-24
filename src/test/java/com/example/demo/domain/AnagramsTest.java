package com.example.demo.domain;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class AnagramsTest {
    @Test
    public void should_return_empty_when_given_empty_string() {
        List<String> result = Anagrams.of("");
        assertEquals(0, result.size());
    }
    @Test
    public void should_return_a_when_given_one_string() {
        List<String> result = Anagrams.of("a");
        ArrayList<String> list=new ArrayList<String>();
        list.add("a");
        assertEquals(list, result);
    }

    @Test
    public void should_return_ab_ba_when_given_ab() {
        List<String> result = Anagrams.of("ab");
        ArrayList<String> list=new ArrayList<String>();
        list.add("ab");
        list.add("ba");
        assertEquals(list, result);
    }

    @Test
    public void should_return_list_has_6_elements_when_given_abc() {
        List<String> result = Anagrams.of("abc");
        ArrayList<String> list=new ArrayList<String>();
        list.add("abc");
        list.add("acb");
        list.add("bac");
        list.add("bca");
        list.add("cab");
        list.add("cba");
        assertEquals(list, result);
    }

    @Test
    public void should_return_list_has_24_elements_when_given_abc() {
        List<String> result = Anagrams.of("abcd");

        assertEquals(24, result.size());
    }

}
