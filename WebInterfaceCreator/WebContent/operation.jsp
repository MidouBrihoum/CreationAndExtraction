<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
  pageEncoding="UTF-8" %>



<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html >
    
    <% 
Integer i ; 
if (null == session.getAttribute("numberoperation")){
    
    i=0;
session.setAttribute("numberoperation",i) ;}
else{
       i= (Integer)session.getAttribute("numberoperation");
       i++;
        session.setAttribute("numberoperation",i);
        }

%>

   
<head>
  <meta charset="UTF-8">
  <title>Simple HTML/CSS Contact Form</title>
  
  
  
      <link rel="stylesheet" href="css/style.css">

  
</head>

<body>


 <script>
function removeRequired(form){
    $.each(form, function(key, value) {
        if ( value.hasAttribute("required")){
            value.removeAttribute("required");
        }
    });
}
</script> 






<div class="stepwizard">
    <div class="stepwizard-row">

        <div class="stepwizard-step">
            <button type="button" class="btn btn-default btn-circle"disabled="disabled">1</button>
            <p>keywords</p>
        </div>

        <div class="stepwizard-step">
            <button type="button" class="btn btn-default btn-circle"disabled="disabled">2</button>
            <p>inputs</p>
        </div>

        <div class="stepwizard-step">
            <button type="button" class="btn btn-default btn-circle" disabled="disabled">3</button>
            <p>outputs</p>
        </div> 

         <div class="stepwizard-step">
            <button type="button" class="btn btn-default btn-circle" disabled="disabled">4</button>
            <p>preconditions</p>
        </div> 

         <div class="stepwizard-step">
            <button type="button" class="btn btn-default btn-circle" disabled="disabled">5</button>
            <p>postconditions</p>
        </div> 

         <div class="stepwizard-step">
            <button type="button" class="btn btn-primary btn-circle" disabled="disabled">6</button>
            <p>operation  (<% out.print(i);%>)</p>
        </div> 
        
        <div class="stepwizard-step">
            <button type="button"  class="btn btn-default btn-circle" disabled="disabled">7</button>
            <p>confirmation</p>
        </div>   
        <div class="stepwizard-step">
            <button type="button"  class="btn btn-default btn-circle" disabled="disabled">8</button>
            <p>service</p>
        </div> 
    </div>
</div>



  <div class="container"> 
  
  
  <form id="contact" action="operation" method="get">
    <h3>operation (<% out.print(i);%>)</h3>
    <h4>veuillez introduire information concrétes de l'operation </h4>

    <fieldset>
      <input placeholder="nom de l'operation " type="text" tabindex="1" name="name" required autofocus>
    </fieldset>

    <fieldset>
      <input placeholder="type de l'operation" type="text" tabindex="2" name="type" required autofocus>
    </fieldset>

    <fieldset>
      <input placeholder="titre concret" type="text" tabindex="3" name="concret" required autofocus>
    </fieldset>

    <fieldset>
      <input placeholder="numero de la ligne du début" type="text" tabindex="4" name="debut" required autofocus>
    </fieldset>

    <fieldset>
      <input placeholder="numero de la ligne de fin" type="text" tabindex="5" name="fin" required autofocus>
    </fieldset>
    

    <fieldset>
      <button name="other" value="other" type="submit" id="contact-submit" data-submit="...Sending">ajouter</button>
    </fieldset>
   
    <fieldset>
      <button name="fin" value="fin" type="submit" id="contact-submit2" formnovalidate>suivant</button>
    </fieldset>
       


    <p class="copyright">ICE Creator</a></p>

    </form>
</div>
  
</body>
</html>
