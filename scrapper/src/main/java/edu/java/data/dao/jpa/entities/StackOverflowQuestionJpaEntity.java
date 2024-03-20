package edu.java.data.dao.jpa.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "stack_overflow_questions")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class StackOverflowQuestionJpaEntity {

    @Id
    @Column(name = "id")
    private long id;

    @OneToOne
    @JoinColumn(name = "link_id", referencedColumnName = "id")
    private LinkJpaEntity link;

    @Column(name = "description_md5_hash")
    private String descriptionMd5Hash;

}
