package com.aclab.dne.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@IdClass(PresenceSessionId.class)
public class PresenceSession implements Serializable {

    @Id
    private Long idEtudiant;

    @Id
    private Long idSession;

    private boolean isPresent;
}
