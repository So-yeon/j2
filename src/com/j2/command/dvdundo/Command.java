package com.j2.command.dvdundo;

public interface Command {
    public void execute();
    public void undo();
}