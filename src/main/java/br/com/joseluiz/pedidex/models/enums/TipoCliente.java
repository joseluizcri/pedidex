package br.com.joseluiz.pedidex.models.enums;

import lombok.Getter;

@Getter
public enum TipoCliente {

    PESSOA_FISICA(1, "Pessoa física"),
    PESSOA_JURIDICA(2, "Pessoa jurídica");

    private Integer id;
    private String descricao;

    TipoCliente(Integer id, String descricao) {
        this.id = id;
        this.descricao = descricao;
    }

    public static TipoCliente toEnum(Integer id) {
        if (id == null) {
            return null;
        }

        for (TipoCliente tipoCliente: TipoCliente.values()) {
            if (id.equals(tipoCliente.id)) {
                return tipoCliente;
            }
        }

        throw new IllegalArgumentException("Tipo do cliente inválido. [" + id + "]");
    }

}
