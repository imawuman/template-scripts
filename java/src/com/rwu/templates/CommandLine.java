package com.rwu.templates;

/**
 * Usage: java -jar command-line.jar [arg]
 */
public class CommandLine {

    public static void main(String[] args) {
        CommandLine cl = new CommandLine();
        cl.commandLine(args);
    }

    public void commandLine(String... args) {
        // TODO: implementation
        if (args.length > 0) {
            System.out.println("Running function with arg: " + args[0]);
        } else {
            System.out.println("Running function with arg: " + null);
        }
    }
}
