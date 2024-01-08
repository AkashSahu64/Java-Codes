import java.util.Scanner;

public class OnlineExaminationSystem {
    private static final int EXAM_DURATION_MINUTES = 30;

    private static String username;
    private static String password;
    private static boolean isLoggedIn;
    private static boolean isExamInProgress;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("===== ONLINE EXAMINATION SYSTEM =====");
            System.out.println("1. Login");
            System.out.println("2. Update Profile and Password");
            System.out.println("3. Start Exam");
            System.out.println("4. Logout");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    login(scanner);
                    break;
                case 2:
                    if (isLoggedIn) {
                        updateProfileAndPassword(scanner);
                    } else {
                        System.out.println("Please login first!");
                    }
                    break;
                case 3:
                    if (isLoggedIn) {
                        startExam(scanner);
                    } else {
                        System.out.println("Please login first!");
                    }
                    break;
                case 4:
                    logout();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice!");
                    break;
            }
        }
    }

    private static void login(Scanner scanner) {
        System.out.print("Enter username: ");
        String enteredUsername = scanner.nextLine();

        System.out.print("Enter password: ");
        String enteredPassword = scanner.nextLine();

        // Authenticate user (example validation, replace with your own logic)
        if (enteredUsername.equals("admin") && enteredPassword.equals("password")) {
            System.out.println("Login successful!");
            username = enteredUsername;
            password = enteredPassword;
            isLoggedIn = true;
        } else {
            System.out.println("Login failed. Invalid username or password.");
        }
    }

    private static void updateProfileAndPassword(Scanner scanner) {
        System.out.println("===== UPDATE PROFILE AND PASSWORD =====");
        System.out.println("1. Update Profile");
        System.out.println("2. Update Password");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        switch (choice) {
            case 1:
                System.out.print("Enter new profile information: ");
                String profileInfo = scanner.nextLine();
                // Update profile information in the database or file
                System.out.println("Profile information updated successfully!");
                break;
            case 2:
                System.out.print("Enter current password: ");
                String currentPassword = scanner.nextLine();
                if (currentPassword.equals(password)) {
                    System.out.print("Enter new password: ");
                    String newPassword = scanner.nextLine();
                    password = newPassword;
                    System.out.println("Password updated successfully!");
                } else {
                    System.out.println("Incorrect password!");
                }
                break;
            default:
                System.out.println("Invalid choice!");
                break;
        }
    }

    private static void startExam(Scanner scanner) {
        System.out.println("===== START EXAM =====");
        System.out.println("Welcome, " + username + "!");
        System.out.println("Exam duration: " + EXAM_DURATION_MINUTES + " minutes");
        System.out.println("You can start the exam now.");

        System.out.print("Enter 'start' to begin: ");
        String startCommand = scanner.nextLine();

        if (startCommand.equalsIgnoreCase("start")) {
            System.out.println("Exam started!");
            isExamInProgress = true;
            startTimer();
            // Present MCQs and allow the user to select answers
            // You can implement the MCQ functionality and auto submission here
            // For simplicity, let's assume the user completes the exam within the time limit
            // and submit the exam manually
            System.out.print("Enter 'submit' to finish the exam: ");
            String submitCommand = scanner.nextLine();

            if (submitCommand.equalsIgnoreCase("submit")) {
                submitExam();
            } else {
                System.out.println("Invalid command. Exam not submitted.");
            }
        } else {
            System.out.println("Invalid command. Exam not started.");
        }
    }

    private static void startTimer() {
        Thread timerThread = new Thread(() -> {
            try {
                Thread.sleep(EXAM_DURATION_MINUTES * 60 * 1000); // Convert minutes to milliseconds
                if (isExamInProgress) {
                    System.out.println("Time's up! Exam auto submitted.");
                    submitExam();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        timerThread.start();
    }

    private static void submitExam() {
        System.out.println("Exam submitted successfully!");
        isExamInProgress = false;
    }

    private static void logout() {
        username = null;
        password = null;
        isLoggedIn = false;
        System.out.println("Logged out successfully!");
    }
}
