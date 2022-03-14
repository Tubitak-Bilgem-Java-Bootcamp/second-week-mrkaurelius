package com.adventureincorporated.game;

import java.util.Scanner;

public class GameIO {
    private Scanner scanner;

    public GameIO(){
        this.scanner = new Scanner(System.in);
    }

    public String inputString(String promptString) {
        System.out.print("> " + promptString + " ");
        return this.scanner.next();
    }

    public int inputInt(String promptString) {
        System.out.print("> " + promptString + " [0-9] ");
        return this.scanner.nextInt();
    }

    public boolean inputYesOrNo(String promptString) {
        System.out.print("> " + promptString + " [y/n] ");
        String inputString = this.scanner.next();
        if (inputString.charAt(0) == 'y') {
            return true;
        } else {
            return false;
        }
    }
}
