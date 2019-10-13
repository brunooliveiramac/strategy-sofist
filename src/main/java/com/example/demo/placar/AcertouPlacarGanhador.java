package com.example.demo.placar;

public class AcertouPlacarGanhador implements StrategiaDePlacar {

    Placar oficial;
    Placar aposta;

    public AcertouPlacarGanhador(Placar oficial, Placar aposta) {
        this.oficial = oficial;
        this.aposta = aposta;
    }

    @Override
    public boolean match() {
        if(aposta.getGanhador() == oficial.getGanhador()){
            return true;
        }
        return false;
    }

    @Override
    public int caculo() {
        return 10;
    }


}
