package domain;

import javax.persistence.*;

@Entity // This annotation specifies that the following class is a JPA entity.
public class Option {
    @Id // Specifies that the following field is a primary key for the entity.
    @GeneratedValue // Specifies that the value of this field should be generated
                    // automatically by the database.
    @Column(name = "OPTION_ID") // Specifies that this field is mapped to
                                // the OPTION_ID column in the database
    private Long id;
    @Column(name = "OPTION_VALUE") // Specifies that this field is mapped to
                                    // the OPTION_VALUE column in the database
    private String value;

    public Option(){
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
