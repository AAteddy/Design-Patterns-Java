# **Real-World Problem for You to Solve**

## **Problem: Implementing a Document Workflow System**

**Scenario:**
You are tasked with creating a document workflow system for an organization. In this system, a document can be in one of the following states:

1. **Draft**: The document is being created or edited.
2. **Submitted for Review**: The document is submitted for approval.
3. **Approved**: The document is reviewed and approved.
4. **Rejected**: The document is reviewed but rejected.

## **Requirements:**

1. When a document is created, it starts in the Draft state.
2. In the Draft state:
 - The document can be edited.
 - It can also be submitted for review.
3. In the Submitted for Review state:
 - The document can either be approved or rejected.
4. In the Approved state:
 - The document can no longer be edited, and no further actions can be taken.
5. In the Rejected state:
 - The document can be sent back to the Draft state for further editing.
6. The system should handle transitions between these states and ensure that only valid actions are allowed based on the current state.

## **Steps:**

- **Context**: The Document class will serve as the context that holds the current state and transitions between states.
- **State Interface**: Create a DocumentState interface to define common behaviors (e.g., edit(), submitForReview(), approve(), reject()).
- C**oncrete States**: Implement states like DraftState, SubmittedState, ApprovedState, and RejectedState.

**Tasks:**
1. Create the Document class that acts as the Context and manages the current state.
2. Create the DocumentState interface that declares methods for document actions (edit(), submitForReview(), approve(), reject()).
3. Implement concrete state classes: DraftState, SubmittedState, ApprovedState, and RejectedState.
4. Test the system:
 - Start with a document in the Draft state.
 - Submit it for review, approve or reject it, and handle any transitions back to the Draft state.

## **Expected Workflow:**

1. Document created (initial state: Draft).
2. The user edits the document (valid action in Draft).
3. The user submits the document for review (state changes to Submitted for Review).
4. The document is either approved or rejected:
 - If approved, the state changes to Approved, and no further edits are allowed.
 - If rejected, the state changes to Rejected, and the document can be sent back to Draft for further editing.

## **Deliverables:**

- Provide a solution with classes for the Context (Document), State Interface (DocumentState), and Concrete States (DraftState, SubmittedState, ApprovedState, RejectedState).
- Test the transitions in a Main class, and print the current state at each step.