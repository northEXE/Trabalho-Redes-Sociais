package com.example.north_exe.trabalhoredessociais.br.ufc.qxd.enums;

/**
 * Created by north-exe on 23/11/17.
 */

public enum CategoriaDenuncia {
    VIAS_PUBLICAS(1), EQUIPAMENTOS_COMUNITARIOS(2), LIMPEZA_URBANA(3);

    private final int valor;
    CategoriaDenuncia(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }
}
