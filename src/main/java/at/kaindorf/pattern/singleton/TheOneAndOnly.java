package at.kaindorf.pattern.singleton;

/**
 * Singleton simplest implementation
 */
public class TheOneAndOnly {
    private static TheOneAndOnly theInstance;

    private TheOneAndOnly() {

    }

    public static TheOneAndOnly getTheInstance() {
        if(theInstance == null) {
            theInstance = new TheOneAndOnly();
        }
        return theInstance;
    }
}
