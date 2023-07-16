package TP2.src;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        //Appeller  versApi une syllabe en unicode
        String syllabe = "\\u0E0D\\u0E34";
        String syllabeAPI = Thai.versAPI(syllabe);
        System.out.println("Resultat final " + syllabeAPI);
     }
}