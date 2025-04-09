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

    @Column(name = "last_name")
    private  String lastName;

    @Column(name = "age")
    private  int age;

    @Column(name = "email_adr")
    private String emailAdress;

    @Column(name = "pass")
    private String pass;


}
