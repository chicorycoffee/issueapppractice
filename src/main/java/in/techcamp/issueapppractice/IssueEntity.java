package in.techcamp.issueapppractice;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class IssueEntity {
    private long id;
    private String title;
    private String content;
    private String period;
    private String importance;
}
