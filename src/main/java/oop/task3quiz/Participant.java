package oop.task3quiz;

public class Participant implements Comparable<Participant>{

    String id;
    String answer;
    int points;

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }
    public Participant(String id, String answer, int points) {
        this.id = id;
        this.answer = answer;
        this.points = points;
    }

    public String getId() {
        return id;
    }

    public String getAnswer() {
        return answer;
    }

    @Override
    public int compareTo(Participant o) {
        if(o.points == this.points) {
            return 0;
        }
        else if(o.points > this.points) {
            return 1;
        }
        else {
            return -1;
        }
    }
}


