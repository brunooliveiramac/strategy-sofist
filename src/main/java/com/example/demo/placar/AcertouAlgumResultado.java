package com.example.demo.placar;

public class AcertouAlgumResultado implements StrategiaDePlacar {

    Placar oficial;
    Placar aposta;

    public AcertouAlgumResultado(Placar oficial, Placar aposta) {
        this.oficial = oficial;
        this.aposta = aposta;
    }

    @Override
    public boolean match() {
        if (aposta.getTime1() == oficial.getTime2() &&
                aposta.getTime2() != oficial.getTime2()
        || aposta.getTime1() != oficial.getTime2() &&
                aposta.getTime2() == oficial.getTime2()) {
            return true;
        }
        return false;
    }

    @Override
    public int caculo() {
        return 5;
    }
}
