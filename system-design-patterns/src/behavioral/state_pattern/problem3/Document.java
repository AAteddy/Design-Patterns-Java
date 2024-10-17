package behavioral.state_pattern.problem3;

public class Document {
    private DocumentState currentState;

    public Document() {
//        this.currentState = new DraftState();
    }

    public DocumentState getCurrentState() {
        return currentState;
    }

    public void setCurrentState(DocumentState state) {
        this.currentState = state;
    }

    public void edit() {
        currentState.edit(this);
    }

    public void submitForReview() {
        currentState.submitForReview(this);
    }

    public void approve() {
        currentState.approve(this);
    }

    public void reject() {
        currentState.reject(this);
    }
}
