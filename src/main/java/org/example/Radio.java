package org.example;

public class Radio extends Dispositivo {

    public Radio(IControle controle) {
        super(controle);
    }

    public String operarDispositivo() {
        return modo.operar();
    }
}