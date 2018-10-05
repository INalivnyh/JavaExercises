package lesson_1;

import hw1.animals.Team;
import hw1.obstances.Course;

/**
 * GeekBrains. Java. Level 1. Lesson ???.
 *
 * @author Igor Nalivnyh
 * @version 24.09.2018
 */

public class Main {
    public static void main(String[] args) {
        Team team1 = new Team("team1");
        team1.printInformationAboutTheTeam();
        Team team2 = new Team("team2");
        team2.printInformationAboutTheTeam();
        Course course = new Course();
        course.printInformationAboutTheObstacle();
        course.passObstacles(team1);
        course.passObstacles(team2);
        team1.passedTheDistance();
        team2.passedTheDistance();
    }
}
