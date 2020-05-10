package kg.it.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name="task")
@Data
public class less {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "id", nullable = false , unique = true)
    private Long id;
    @Column(name="title")
    private String title;
    @Column(name="text")
    private String text;
    @Column(name="isDone")
    private Boolean isDone;

    public less(String title ,String text,Boolean isDone) {
         this.title = title;
         this.text =text;
         this.isDone =isDone;
    }
}
