package kg.it.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name="users")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "id", nullable = false , unique = true)
    private Long id;
    @Column(name= "login", nullable = false , unique = true)
    private String login;
    @Column(name= "password", nullable = false )
    private String password;
    @Column(name= "isActiv", nullable = false )
    private Integer isActiv;
}
