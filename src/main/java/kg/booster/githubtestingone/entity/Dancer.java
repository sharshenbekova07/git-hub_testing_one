package kg.booster.githubtestingone.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "dancers")
public class Dancer {

    // будем проверять git update в ветке firstBranchTom ,тперь будем то же самое проверять в ветке dev
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "dancers_name")
    private String nameOfDancer;

    @Column(name = "home_address")
    private String homeAddress;

    @Column(name = "last_name")

    private  String lastName;

    @Column(name = "age")
    private int age;

    @Column(name = "email_adr")
    private String emailAdress;

    @Column(name = "pass")
    private String pass;

    @Column(name = "phone_number")
    private int phoneNumber;

}
