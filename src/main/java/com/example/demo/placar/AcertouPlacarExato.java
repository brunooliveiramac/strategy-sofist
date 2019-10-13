package com.example.demo.placar;

public class AcertouPlacarExato implements StrategiaDePlacar {

    Placar oficial;
    Placar aposta;

    public AcertouPlacarExato(Placar oficial, Placar aposta) {
        this.oficial = oficial;
        this.aposta = aposta;
    }

    @Override
    public boolean match() {
        if(oficial.equals(aposta)){
            return true;
        }
        return false;
    }

    @Override
    public int caculo() {
        return 20;
    }
}
