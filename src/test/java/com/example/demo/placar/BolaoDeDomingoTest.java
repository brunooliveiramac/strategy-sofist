package com.example.demo.placar;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BolaoDeDomingoTest {



    @Test
    public void shouldReturn20PointsWhenResultsMatchesAll(){
        Bolao bolao = new BolaoDeDomingo();
        Placar placarOficial = new Placar(3, 2);
        Placar placarAposta = new Placar(3, 2);
        int pontuacao = bolao.calculaPontuacao(placarAposta, placarOficial);
        assertEquals(20, pontuacao);
    }

    @Test
    public void shouldReturn10PointsWhenResultsMatchesTheWinner(){
        Bolao bolao = new BolaoDeDomingo();
        Placar placarOficial = new Placar(3, 0);
        Placar placarAposta = new Placar(3, 1);
        int pontuacao = bolao.calculaPontuacao(placarAposta, placarOficial);
        assertEquals(10, pontuacao);
    }

    @Test
    public void shouldReturn5PointsWhenResultsMatchesAnyTeamResult(){
        Bolao bolao = new BolaoDeDomingo();
        Placar placarOficial = new Placar(3, 2);
        Placar placarAposta = new Placar(0, 2);
        int pontuacao = bolao.calculaPontuacao(placarAposta, placarOficial);
        assertEquals(5, pontuacao);
    }



}
