/* Essa anotação indica que o valor do ID de um animal de estimação é gerado automaticamente e aumentado sempre que uma nova linha 
é inserida na tabela de pets.*/

@Entity
@Table(name = "pets")
public class Pets {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String species;
}
