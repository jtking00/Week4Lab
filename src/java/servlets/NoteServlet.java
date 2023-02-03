
package servlets;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.Note;

public class NoteServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String path = getServletContext().getRealPath("/WEB-INF/note.txt");
        BufferedReader br = new BufferedReader(new FileReader(new File(path)));
        
        String noteT = br.readLine();
        String noteC = br.readLine();
        
        String editNote = request.getParameter("edit");
        Note note = new Note(noteT, noteC);
        request.setAttribute("note", note);
        
        if(editNote == null){
            getServletContext().getRequestDispatcher("/WEB-INF/viewnote.jsp").forward(request, response);
            return;
        }
        else{
            getServletContext().getRequestDispatcher("/WEB-INF/editnote.jsp").forward(request, response);
        }
        br.close();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String path = getServletContext().getRealPath("/WEB-INF/note.txt");
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(path, false))); 
        
        String noteT = request.getParameter("noteTitle");
        String noteC = request.getParameter("noteContent");
        
        Note note = new Note(noteT, noteC);
        note.setNoteTitle(noteT);
        note.setNoteContent(noteC);
        
        pw.println(note.getNoteTitle());
        pw.println(note.getNoteContent());
        
        pw.close();
        
        request.setAttribute("note", note);
        
        getServletContext().getRequestDispatcher("/WEB-INF/viewnote.jsp").forward(request, response);
    }
}
