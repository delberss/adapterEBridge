package org.example;

public class TV extends Dispositivo {

    public TV(IControle controle) {
        super(controle);
    }

    public String operarDispositivo() {
        return modo.operar();
    }
}