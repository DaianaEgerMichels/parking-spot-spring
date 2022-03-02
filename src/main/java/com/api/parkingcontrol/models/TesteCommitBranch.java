package com.api.parkingcontrol.models;

import javax.persistence.*;

@Entity
public class TesteCommitBranch {
    private String branch = "Nova Branch";
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "userger")
    @SequenceGenerator(name = "userger", sequenceName = "usuario_id_seq", allocationSize =1)
    private Long id;

    public void OlaBranch(){
        System.out.println("Novo arquivo para testar a criação de commit na branch criada: " + branch);
    }

}
