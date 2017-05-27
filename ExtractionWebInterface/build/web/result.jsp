
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" import="java.util.List" %>



<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html >



    <head>
        <meta charset="UTF-8">
        <title>Simple HTML/CSS Contact Form</title>



        <link rel="stylesheet" href="css/style.css">


    </head>

    <body>


      
    


        <div class="container"> 


            <form id="contact" >
                <h2 class="copyright" >Liste des ICE similaire</h2>
                <h4 class="copyright"></h4>

                <%
                   List <String> L = (List<String>) session.getAttribute("ElementList");
                    if (L == null) {
                %>
                <h2 class="copyright" >Liste des ICE similaire</h2>
                <%
                } else {
                    for (int i = 0; i < L.size(); i++) {

                %>

                <fieldset>
                    <button name="ice" value="ice" type="submit" id="contact-submit" data-submit="...Sending" onclick="window.open('http://localhost/xmls/<%out.print(L.get(i)); %>')"><%out.print(L.get(i)); %></button>
                </fieldset>   

                <%

                        }
                    }

                %>

                 


            </form>
        </div>

    </body>
</html>