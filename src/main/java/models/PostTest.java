package models;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PostTest{
    @Test
    public void NewPostObjectGetsCorrectlyCreated_true()throws   Exception{
        Post post = new Post("Day 1: Intro");
        assertEquals(true, post instanceof Post);
    }
}
