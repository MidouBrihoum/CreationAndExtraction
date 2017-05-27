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
  
  
  <form id="contact" action="getfilename" method="post" enctype="multipart/form-data">
    <h2 class="copyright" >IBC</h2>
    <h4 class="copyright">veuillez introduire votre IBC</h4>

    <fieldset >
      <input placeholder="similarité minimal" type="number" tabindex="1" name="sim" required autofocus>
    </fieldset>

     <fieldset>
  
<input id="file" type="file" name="file" class="file" data-show-preview="true" >
    </fieldset>

    <fieldset>
      <button name="fin" value="fin" type="submit" id="contact-submit" data-submit="...Sending">confirmer</button>
    </fieldset>   


    </form>
</div>
  
</body>
</html>