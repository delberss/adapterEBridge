package org.example;

public abstract class Dispositivo {

    protected ModoOperacao modo;
    protected IControle controle;

    public Dispositivo(IControle controle) {
        this.controle = controle;
    }

    public void definirModo(ModoOperacao modo) {
        this.modo = modo;
    }

    public String acionarControle() {
        return controle.acionar();
    }

    public abstract String operarDispositivo();
}