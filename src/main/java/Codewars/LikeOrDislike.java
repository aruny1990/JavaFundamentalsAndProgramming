package Codewars;

public class LikeOrDislike {

	// Enum to represent the possible states
    enum State {
       LIKE, DISLIKE, NOTHING
    }

    public static String likeOrDislike(String[] buttons) {
        // Start with the "Nothing" state
        State currentState = State.NOTHING;

        // Process each button in the input array
        for (String button : buttons) {
            switch (button) {
                case "Like":
                    // If already "Like", undo it; otherwise, set to "Like"
                    currentState = (currentState == State.LIKE) ? State.NOTHING : State.LIKE;
                    break;
                case "Dislike":
                    // If already "Dislike", undo it; otherwise, set to "Dislike"
                    currentState = (currentState == State.DISLIKE) ? State.NOTHING : State.DISLIKE;
                    break;
            }
        }

        // Return the final state as a string
        switch (currentState) {
            case LIKE:
                return "Like";
            case DISLIKE:
                return "Dislike";
            default:
                return "Nothing";
        }
    }

    public static void main(String[] args) {
        // Test cases
      //  System.out.println(likeOrDislike(new String[]{"Dislike"})); // Dislike
        System.out.println(likeOrDislike(new String[]{"Like", "Like"})); // Nothing
        System.out.println(likeOrDislike(new String[]{"Dislike", "Like"})); // Like
        System.out.println(likeOrDislike(new String[]{"Like", "Dislike", "Dislike"})); // Nothing
    }
}
