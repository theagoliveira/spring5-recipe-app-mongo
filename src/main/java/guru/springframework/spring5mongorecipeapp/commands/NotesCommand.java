package guru.springframework.spring5mongorecipeapp.commands;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class NotesCommand {

    private String id;
    private String recipeNotes;

}
