# Online Quiz Application in Java

![Java](https://img.shields.io/badge/Java-17%2B-blue)

A console-based quiz application built with Java that tests your knowledge through multiple-choice questions.

## Table of Contents
- [Features](#features)
- [Installation](#installation)
- [Usage](#usage)
- [Customizing Questions](#customizing-questions)
- [Example Output](#example-output)
- [Contributing](#contributing)
- [License](#license)

## Features

✅ Multiple-choice question format  
✅ Immediate feedback on answers  
✅ Score calculation with percentage  
✅ Input validation  
✅ Easy question customization  
✅ Clean console interface  

## Installation

1. **Prerequisites**: Ensure you have Java JDK 17 or later installed
   ```bash
   java -version
   ```

2. **Clone the repository**:
   ```bash
   git clone https://github.com/yourusername/java-quiz-app.git
   cd java-quiz-app
   ```

3. **Compile the program**:
   ```bash
   javac QuizApp.java
   ```

## Usage

Run the compiled program:
```bash
java QuizApp
```

The application will:
1. Display welcome message and instructions
2. Present questions one at a time
3. Accept your numeric input (1-4) for answers
4. Show immediate feedback
5. Display final results

## Customizing Questions

To modify or add questions, edit the `initializeQuestions()` method:

```java
private static List<Question> initializeQuestions() {
    List<Question> questions = new ArrayList<>();
    
    // Add new questions like this:
    List<String> options = new ArrayList<>();
    options.add("Option 1");
    options.add("Option 2");
    options.add("Option 3");
    options.add("Option 4");
    questions.add(new Question("Your question text?", options, 0)); // 0 = index of correct answer
    
    return questions;
}
```

## Example Output

```
Welcome to the Online Quiz App!
You will be presented with 5 questions.
For each question, enter the number of your answer (1-4).

Question 1: How do you create a variable with the numeric value 5?
1. int X=5;
2. num X=5;
3. float X=5;
4. X=5;
Your answer (1-4): 1
Correct!

[... more questions ...]

Quiz completed!
Your score: 4 out of 5
Percentage: 80.0%
```

## Contributing

Contributions are welcome! Please follow these steps:
1. Fork the repository
2. Create your feature branch (`git checkout -b feature/your-feature`)
3. Commit your changes (`git commit -m 'Add some feature'`)
4. Push to the branch (`git push origin feature/your-feature`)
5. Open a Pull Request
