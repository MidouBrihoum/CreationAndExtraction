<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
  pageEncoding="UTF-8" %>



<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html >
    
    <% 
Integer i ; 
if (null == session.getAttribute("numberprecond")){
    
    i=0;
session.setAttribute("numberprecond",i) ;}
else{
       i= (Integer)session.getAttribute("numberprecond");
       i++;
        session.setAttribute("numberprecond",i);
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
            <button type="button" class="btn btn-primary btn-circle" disabled="disabled">4</button>
            <p>preconditions   (<% out.print(i);%>)</p>
        </div> 

         <div class="stepwizard-step">
            <button type="button" class="btn btn-default btn-circle" disabled="disabled">5</button>
            <p>postconditions</p>
        </div> 

         <div class="stepwizard-step">
            <button type="button" class="btn btn-default btn-circle" disabled="disabled">6</button>
            <p>operation</p>
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
  
  
  <form id="contact" action="PreConditions" method="get">
    <h3>pré-conditions (<% out.print(i);%>)</h3>
    <h4>veuillez introduire une précondition </h4>

    <fieldset>
      <input placeholder="nom de la pré-condition" type="text" tabindex="1" name="name" required autofocus>
    </fieldset>

    <fieldset>
      <input placeholder="contenu de la pré-condition" type="text" tabindex="2" name="type" required autofocus>
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
