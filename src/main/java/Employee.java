import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "employee")
@EqualsAndHashCode(exclude = {"id"})
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    //@Column(name = "gender") т.е. аннотацию колонки можно удалить при точном совпадении полей
    private String gender;
    @Column(name = "age")
    private int age;
    @Column(name = "city_id")
    private int city;
}
