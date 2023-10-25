package net.weg.fixacaospring.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@IdClass(UsuarioId.class)
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Id
    private Long cpf;
    private String nome;
    private String email;
    private String telefone;
    @OneToOne (cascade = CascadeType.PERSIST)
    private Endereco endereco;


}
