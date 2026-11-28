package org.example.CincuentazoGame.Models;


public interface IGameLog {
    default void logEvent(String mensaje) {
        System.out.println("[LOG]: " + mensaje);
    }
}