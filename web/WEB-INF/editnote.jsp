<%-- 
    Document   : editnote
    Created on : 2-Feb-2023, 5:56:45 PM
    Author     : 882199
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Simple Note Keeper</title>
    </head>
    <body>
        <h1>Simple Note Keeper</h1>
        <br>
        <h2>Edit Note</h2>
        <br>
        <form method="post" action="note">
            <h3>Title:</h3> <input type="text" name="noteTitle" value="${note.noteTitle}">
            <br>
            <h3>Contents:</h3> <textarea name="noteContent">${note.noteContent}</textarea>
            <br>
            <input type="submit" name="saveNote" value="Save">
        </form>
    </body>
</html>
