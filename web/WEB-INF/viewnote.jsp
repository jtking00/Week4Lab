<%-- 
    Document   : viewnote
    Created on : 2-Feb-2023, 5:56:27 PM
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
        <h2>View Note</h2>
        <br>
        <form method="post" action="note">
            <h3>Title:</h3> ${note.noteTitle}
            <br>
            <h3>Contents:</h3>
            <p>
                ${note.noteContent}
            </p>
            <a href="note?edit">Edit</a>
        </form>
    </body>
</html>
