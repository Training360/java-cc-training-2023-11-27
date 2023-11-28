package samples;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class Book {

    private Long id;

    private String title;

    private String author;

    private YearOfCreation yearOfCreation;

    private  BookDetails bookDetails;

    public static void main(String[] args) {


    }

    public void setYear(int pYear) {

    }
}
