package Advance.QuizProject;

public class Main {
    public static void main(String[] args) {
        QuestionService service = new QuestionService();
        service.displayQuestions();
        service.prinScore();

        RegisterService registerService = new RegisterService();
        registerService.displayRegister();


    }
}
