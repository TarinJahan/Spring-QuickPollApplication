package domain;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "POLLS") // Specifies the name of the database table
                        // that this entity maps to
public class Poll {
    @Id
    @GeneratedValue
    @Column(name = "POLL_ID")
    private Long id;

    @Column(name = "QUESTION")
    private String question;

    @OneToMany(cascade = CascadeType.ALL) // Specifies that the options field is a
                                            // one-to-many relationship with the Option entity
    @JoinColumn(name = "POLL_ID") // Specifies the name of the column in the database
                                    // table that the foreign key maps to
    @OrderBy // Specifies that the order of the elements in the options set should be preserved
    private Set<Option> options;

    public Poll() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public Set<Option> getOptions() {
        return options;
    }

    public void setOptions(Set<Option> options) {
        this.options = options;
    }
}
