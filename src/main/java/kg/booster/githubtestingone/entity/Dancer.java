package kg.booster.githubtestingone.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "dancers")
public class Dancer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private  String name;

    @Column(name = "address")
    private  String address;

    @Column(name = "name")
    private  String lastName;

    @Column(name = "age")
    private  int age;
}
