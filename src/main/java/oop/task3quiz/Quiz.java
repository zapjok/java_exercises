package oop.task3quiz;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Quiz {

    String correctAnswer;
    ArrayList<Participant> answers = new ArrayList<>();

    public void initAnswers(String filePath) {
        try {
            File file = new File(filePath);
            Scanner scanner = new Scanner(file);
            this.correctAnswer = scanner.nextLine();
            while (scanner.hasNext()) {
                answers.add(new Participant(scanner.next(), scanner.next(), 0));
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File cannot be read.");
            e.printStackTrace();

        }
    }

    public int numParticipants() {
        return answers.size();
    }

    public String getAnswerOfParticipant(String participantID) {
        String result = "Not found";
        for (Participant participant : answers ) {
            if (participantID.equals(participant.getId())) {
                result = participant.getAnswer();
                break;
            }
        }
        return result;
    }

    public void evaluateAnswer(String participantID) {
        String answer = getAnswerOfParticipant(participantID);
        String score = new String();
        for (int i = 0; i < answer.length(); i++) {
            if ( answer.charAt(i) == correctAnswer.charAt(i)) {
                score += "+";
            }
            else {
                score += " ";
            }
        }
        System.out.println(answer);
        System.out.println(score);
    }

    public void numOfGoodTasks(int taskNumber) {
        int sumOfCorrectAnswers = 0;
        int allAnswers = numParticipants();
        for ( Participant participant : answers) {
            if ( correctAnswer.charAt(taskNumber+1) == participant.getAnswer().charAt(taskNumber+1)) {
                sumOfCorrectAnswers++;
            }
        }
        System.out.println("Number of participants, who get the correct answers: " + (int)sumOfCorrectAnswers);
        System.out.println((sumOfCorrectAnswers * 100 / allAnswers) + " % got the answer right.");
    }

    public void calculatePoints() {
        for (Participant participant : answers) {
            int points = 0;
            for (int i = 0; i < participant.getAnswer().length(); i++) {
                boolean correctness = participant.getAnswer().charAt(i) == correctAnswer.charAt(i);
                if (correctness) {
                    if (i < 5) {
                        points += 3;
                    } else if (i < 10) {
                        points += 4;
                    } else if (i < 13) {
                        points += 5;
                    } else if (i == 13) {
                        points += 6;
                    }
                }
            }
            participant.setPoints(points);
        }
    }

    public void writeResultsToFile(String filePath) {
        try {
            File file = new File(filePath);
            FileWriter myWriter = new FileWriter(filePath,true);
            for (Participant participant : answers) {
                 myWriter.write(participant.getId() + System.lineSeparator() + participant.getPoints() + System.lineSeparator());
                }
            myWriter.close();
        } catch (IOException e) {
            System.out.println("An error occurred. File was not created.");
            e.printStackTrace();
        }
    }

   public void winners() {
       Collections.sort(answers);
       int counter = 1;
       for (int i = 0; i < 4; i++) {
            if (answers.get(i).getPoints() == answers.get(i+1).getPoints()) {
               System.out.println(counter + ". " + answers.get(i).getPoints() + " points " + answers.get(i).getId());
               System.out.println(counter + ". " + answers.get(i+1).getPoints() + " points " + answers.get(i+1).getId());
               i++;
           }
           else {
               System.out.println(counter + ". " + answers.get(i).getPoints() + " points " + answers.get(i).getId());
           }
           counter++;
       }
   }
}
