package behavioral.state_pattern.problem3;

public interface DocumentState {

    void edit(Document doc);
    void submitForReview(Document doc);
    void approve(Document doc);
    void reject(Document doc);
}
