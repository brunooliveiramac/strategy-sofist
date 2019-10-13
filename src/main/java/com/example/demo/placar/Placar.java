package com.example.demo.placar;

import java.util.Objects;

public class Placar {
    private int time1;
    private int time2;

    public Placar(int time1, int time2) {
        this.time1 = time1;
        this.time2 = time2;
    }

    public int getTime1() {
        return time1;
    }

    public int getTime2() {
        return time2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Placar placar = (Placar) o;
        return time1 == placar.time1 &&
                time2 == placar.time2;
    }

    @Override
    public int hashCode() {
        return Objects.hash(time1, time2);
    }

    /**
     *
     * @return resultado ganhador, 0 quando empate.
     */
    public int getGanhador() {
        return time1 == time2 ? 0 : time1 > time2 ? time1 : time2;
    }
}
