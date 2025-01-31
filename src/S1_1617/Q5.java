package S1_1617;

import java.util.*;
import java.io.*;

public class Q5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int grammar;
        int spelling;
        int length;
        int content;
        int total;      
        
        while (true) {
            System.out.print("Enter the marks for Grammar (maximum 30 marks): ");
            grammar = s.nextInt();
            System.out.print("Enter the marks for Spelling (maximum 20 marks): ");
            spelling = s.nextInt();
            System.out.print("Enter the marks for Length (maximum 20 marks): ");
            length = s.nextInt();
            System.out.print("Enter the marks for Content (maximum 30 marks): ");
            content = s.nextInt();
        
            if ((grammar <= 30) && (spelling <= 20) && (length <= 20) && (content <= 30)) {
                break;
            }
            else {
                System.out.println("\nInvalid input. Try again.");
            }
        }
        
        total = grammar + spelling + length + content;
        
        Essay e = new Essay();
        e.setGrammar(grammar);
        e.setSpelling(spelling);
        e.setLength(length);
        e.setContent(content);
        System.out.println(e.toString());
        
        GradedActivity g = new GradedActivity();
        g.setScore(total);
        System.out.println(g.toString());
    }
}

class GradedActivity {
    private int score;
    
    public void setScore(int score) {
        this.score = score;
    }
    
    public int getScore() {
        return score;
    }
    
    public char getGrade() {
        if (score < 60) {
            return 'F';
        }
        else if ((score >= 60) && (score < 70)) {
            return 'D';
        }
        else if ((score >=70) && (score < 80)) {
            return 'C';
        }
        else if ((score >=80) && (score < 90)) {
            return 'B';
        }
        else {
            return 'A';
        }
    }
    
    public String toString() {
        return "Total Score: " + score + "\nEssay Grade: " + getGrade();
    }
}

class Essay extends GradedActivity {
    private int grammar;
    private int spelling;
    private int length;
    private int content;
    
    public void setGrammar(int grammar) {
        this.grammar = grammar;
    }
    
    public int getGrammar() {
        return grammar;
    }
    
    public void setSpelling(int spelling) {
        this.spelling = spelling;
    }
    
    public int getSpelling() {
        return spelling;
    }
    
    public void setLength(int length) {
        this.length = length;
    }
    
    public int getLength() {
        return length;
    }
    
    public void setContent(int content) {
        this.content = content;
    }
    
    public int getContent() {
        return content;
    }
    
    public String toString() {
        return "\nEssay score:\n" + "Grammar: " + grammar + "\nSpelling: " + spelling + "\nLength: " + length + "\nContent: " + content + "\n";
    }
}