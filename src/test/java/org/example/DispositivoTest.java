package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DispositivoTest {

    @Test
    void deveRetornarOperacaoTVLigada() {
        Dispositivo tv = new TV(new ControleRemotoPadrao());
        tv.definirModo(new Ligado());
        assertEquals("Dispositivo ligado!", tv.operarDispositivo());
    }

    @Test
    void deveRetornarControleTV() {
        Dispositivo tv = new TV(new ControleRemotoPadrao());
        assertEquals("Usando controle remoto padrão!", tv.acionarControle());
    }

    @Test
    void deveRetornarOperacaoRadioModoEconomico() {
        Dispositivo radio = new Radio(new ControlePorVoz());
        radio.definirModo(new ModoEconomico());
        assertEquals("Dispositivo em modo econômico!", radio.operarDispositivo());
    }

    @Test
    void deveRetornarControleRadio() {
        Dispositivo radio = new Radio(new ControlePorVoz());
        assertEquals("Usando controle por voz!", radio.acionarControle());
    }
}