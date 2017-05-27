<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
  pageEncoding="UTF-8" %>



<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html >
  

   
<head>
  <meta charset="UTF-8">
  <title>Simple HTML/CSS Contact Form</title>
  
  
  
      <link rel="stylesheet" href="css/style.css">

  
</head>

<body>







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
            <button type="button" class="btn btn-default btn-circle" disabled="disabled">6</button>
            <p>operation </p>
        </div> 
        
        <div class="stepwizard-step">
            <button type="button"  class="btn btn-primary btn-circle" disabled="disabled">7</button>
            <p>confirmation</p>
        </div>   
        <div class="stepwizard-step">
            <button type="button"  class="btn btn-default btn-circle" disabled="disabled">8</button>
            <p>service</p>
        </div> 
    </div>
</div>



  <div class="container"> 
  
  
  <form id="contact" action="confirmation" method="get">
    <h3>avez-vous d'autre operation ?</h3>
    <h4>veuillez indiquer si votre ICE contients d'autres operations</h4>

    
    <div>

    <fieldset>
      <button name="other" value="other" type="submit" id="contact-submit" data-submit="...Sending">OUI</button>
    </fieldset>
   
    <fieldset>
      <button name="fin" value="fin" type="submit" id="contact-submit2" formnovalidate>NON</button>
    </fieldset>
       
  </div>

    <p class="copyright">ICE Creator</a></p>

    </form>
</div>
  
</body>
</html>
