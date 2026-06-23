public class SingletonPattern {
    // ===== Singleton Class =====
    static class Logger {

        // Step 1: static instance
        private static Logger instance;

        // Step 2: private constructor
        private Logger() {
            System.out.println("Logger instance created");
        }

        // Step 3: global access point
        public static Logger getInstance() {
            if (instance == null) {
                instance = new Logger();
            }
            return instance;
        }

        // Sample method
        public void log(String message) {
            System.out.println("LOG: " + message);
        }
    }

    // ===== Test Class =====
    public static void main(String[] args) {

        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        logger1.log("First message");
        logger2.log("Second message");

        System.out.println("Same instance? " + (logger1 == logger2));
    }
}
