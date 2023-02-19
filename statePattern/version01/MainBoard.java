package samin.statePattern.version01;

import java.util.Scanner;

public class MainBoard {
    public static void main(String[] args) {

        Player player = new Player();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("jump | run | turn | play | show");
            String command = sc.nextLine();
            // sc.close();

            if (command.compareTo("jump") == 0) {
                player.jump();
            } else if (command.compareTo("run") == 0) {
                player.run();
            } else if (command.compareTo("turn") == 0) {
                player.turn();
            } else if (command.compareTo("play") == 0) {
                player.play();
            } else if (command.compareTo("show") == 0) {
                player.showLevel();
            }
        }

    }
}
