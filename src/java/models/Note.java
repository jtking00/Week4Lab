package models;

import java.io.Serializable;

public class Note implements Serializable{
    private String noteTitle;
    private String noteContent;
    
    public Note(){
        noteTitle = "";
        noteContent = "";
    }
    public Note(String noteT, String noteC){
        this.noteTitle = noteT;
        this.noteContent = noteC;
    }
    public String getNoteTitle(){
        return noteTitle;
    }
    public void setNoteTitle(String noteT){
        this.noteTitle = noteT;
    }
    public String getNoteContent(){
        return noteContent;
    }
    public void setNoteContent(String noteC){
        this.noteContent = noteC;
    }
}
