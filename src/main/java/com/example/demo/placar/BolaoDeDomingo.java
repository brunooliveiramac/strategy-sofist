package com.example.demo.placar;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * se o placar do jogo foi 3x2, o jogador ganha 0 pontos se a aposta foi 0x1, 5 pontos se foi 0x2 ou 3x5, 10 pontos por 1x0 ou 20 se a aposta foi exatamente o resultado correto 3x2
 */
public class BolaoDeDomingo implements Bolao {


    /**
     *
     * Aplicando SOLID, principio de responsabilidade unica e principio do aberto/fechado. Deixamos
     * a classe cliente com responsabilidade apenas de executar o calculo, removendo varios ifs e delegamos
     * para o padraos strategy, definir e executar a estrategia de calculo, deixando a classe aberta para extensão
     * e fechada para modificação, pois novas estrategias podem ser adicionadas sem alterar a classe cliente.
     */
    @Override
    public int calculaPontuacao(Placar aposta, Placar oficial) {

        StrategiaDePlacar exato = new AcertouPlacarExato(oficial, aposta);
        StrategiaDePlacar ganhador = new AcertouPlacarGanhador(oficial, aposta);
        StrategiaDePlacar algum = new AcertouAlgumResultado(oficial, aposta);

        List<StrategiaDePlacar> strategiaDePlacars = Arrays.asList(exato, ganhador, algum);

        Optional<StrategiaDePlacar> estrategia = strategiaDePlacars.stream().filter(strategiaDePlacar -> strategiaDePlacar.match())
                .findFirst();

        return estrategia.get().caculo();
    }

}
