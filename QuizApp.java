import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuizApp {
    // Question class to represent each quiz question
    static class Question {
        private String questionText;
        private List<String> options;
        private int correctAnswerIndex;

        public Question(String questionText, List<String> options, int correctAnswerIndex) {
            this.questionText = questionText;
            this.options = options;
            this.correctAnswerIndex = correctAnswerIndex;
        }

        public String getQuestionText() {
            return questionText;
        }

        public List<String> getOptions() {
            return options;
        }

        public int getCorrectAnswerIndex() {
            return correctAnswerIndex;
        }
    }

    public static void main(String[] args) {
        // Initialize quiz questions
        List<Question> questions = initializeQuestions();
        
        // Welcome message
        System.out.println("Welcome to the Online Quiz!");
        System.out.println("You will be presented with " + questions.size() + " questions.");
        System.out.println("For each question, enter the number of your answer (1-4).");
        
        // Start the quiz
        int score = 0;
        Scanner scanner = new Scanner(System.in);
        
        for (int i = 0; i < questions.size(); i++) {
            Question currentQuestion = questions.get(i);
            
            // Display question and options
            System.out.println("Question " + (i + 1) + ": " + currentQuestion.getQuestionText());
            List<String> options = currentQuestion.getOptions();
            for (int j = 0; j < options.size(); j++) {
                System.out.println((j + 1) + ". " + options.get(j));
            }
            
            // Get user's answer
            int userAnswer = -1;
            while (userAnswer < 1 || userAnswer > options.size()) {
                System.out.print("Your answer (1-" + options.size() + "): ");
                try {
                    userAnswer = Integer.parseInt(scanner.nextLine());
                    if (userAnswer < 1 || userAnswer > options.size()) {
                        System.out.println("Please enter a number between 1 and " + options.size());
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Please enter a valid number.");
                }
            }
            
            // Check if answer is correct
            if (userAnswer - 1 == currentQuestion.getCorrectAnswerIndex()) {
                System.out.println("Correct!\n");
                score++;
            } else {
                System.out.println("Incorrect! The correct answer was: " + 
                    (currentQuestion.getCorrectAnswerIndex() + 1) + ". " + 
                    options.get(currentQuestion.getCorrectAnswerIndex()) + "\n");
            }
        }
        
        // Display final results
        System.out.println("Quiz completed!");
        System.out.println("Your score: " + score + " out of " + questions.size());
        double percentage = (double) score / questions.size() * 100;
       System.out.println("Percentage: " + String.format("%.1f", percentage) + "%");
        
    }
    
    // Method to initialize quiz questions
    private static List<Question> initializeQuestions() {
        List<Question> questions = new ArrayList<>();
        
        // Question 1
        List<String> options1 = new ArrayList<>();
        options1.add("int X=5");
        options1.add("num X=5");
        options1.add("float X=5");
        options1.add("X=5");
        questions.add(new Question("How do you create a variable with the numeric value 5?", options1, 0));
        
        // Question 2
        List<String> options2 = new ArrayList<>();
        options2.add("Object-Oriented Programming");
        options2.add("Object-Oriented Protocol");
        options2.add("Object-Oriented Process");
        options2.add("Object-Oriented Pattern");
        questions.add(new Question("What does OOP stand for in programming?", options2, 0));
        
        // Question 3
        List<String> options3 = new ArrayList<>();
        options3.add("String");
        options3.add("string");
        options3.add("Txt");
        options3.add("myString");
        questions.add(new Question("Which data type is used to create a variable that should store text?", options3, 0));
        
        // Question 4
        List<String> options4 = new ArrayList<>();
        options4.add("1991");
        options4.add("1995");
        options4.add("2000");
        options4.add("1989");
        questions.add(new Question("In which year was Java first released?", options4, 1));
        
        // Question 5
        List<String> options5 = new ArrayList<>();
        options5.add("JVM");
        options5.add("JRE");
        options5.add("JDK");
        options5.add("JAR");
        questions.add(new Question("Which component of Java is responsible for bytecode execution?", options5, 0));
        
        return questions;
    }
}