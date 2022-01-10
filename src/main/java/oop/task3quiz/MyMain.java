package oop.task3quiz;

import java.util.Scanner;

public class MyMain {

    public static void main(String[] args) {
        System.out.println("Welcome to the quiz.");
        Quiz quiz = new Quiz();
        System.out.println("Reading answers.txt");
        quiz.initAnswers("src/main/resources/answers.txt");
        System.out.println("Total number of participants: " + quiz.numParticipants());
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an ID of a participant to get his answers: ");
        System.out.println("The answers: " + quiz.getAnswerOfParticipant(scanner.nextLine()));
        System.out.println("Enter and ID of a Participant to get and evaluate his answers: ");
        quiz.evaluateAnswer(scanner.nextLine());
        System.out.println("Enter task number: ");
        quiz.numOfGoodTasks(scanner.nextInt());
        System.out.println("...Calculating points...");
        quiz.calculatePoints();
        System.out.println("...Writing ID-s and Points into File...");
        quiz.writeResultsToFile("src/main/resources/results.txt");
        System.out.println("The winners are: ");
        quiz.winners();
    }
}
