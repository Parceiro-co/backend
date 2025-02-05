package com.Parceria.co.interfaces;

public interface Updater<E, T> {
    E map(E model, T dto);
}
