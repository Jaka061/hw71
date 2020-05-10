package kg.it.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name="userRole")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserRole {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "id", nullable = false , unique = true)
    private Long id;
    @Column(name= "roleName")
    private String roleName;
    @ManyToOne
    @JoinColumn(name= "user_id")
    private User user;
}
