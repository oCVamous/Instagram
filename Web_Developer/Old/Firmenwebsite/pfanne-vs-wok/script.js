function includeHTML() {
    var z, i, elmnt, file, xhttp;
    /* Loop through a collection of all HTML elements: */
    z = document.getElementsByTagName("*");
    for (i = 0; i < z.length; i++) {
      elmnt = z[i];
      /*search for elements with a certain atrribute:*/
      file = elmnt.getAttribute("w3-include-html");
      if (file) {
        /* Make an HTTP request using the attribute value as the file name: */
        xhttp = new XMLHttpRequest();
        xhttp.onreadystatechange = function() {
          if (this.readyState == 4) {
            if (this.status == 200) {elmnt.innerHTML = this.responseText;}
            if (this.status == 404) {elmnt.innerHTML = "Page not found.";}
            /* Remove the attribute, and call this function once more: */
            elmnt.removeAttribute("w3-include-html");
            includeHTML();
          }
        }
        xhttp.open("GET", file, true);
        xhttp.send();
        /* Exit the function: */
        return;
      }
    }
  
  }
  
  function myFunction() {
    document.getElementById("navigation-bar").classList.toggle("show");
  }
  
  document.addEventListener("DOMContentLoaded", function() {
    document.getElementById('js_portionInput').addEventListener("keyup", function() {
      let receivers = document.getElementsByClassName('js_portionCalculationReceiver');
      let quantity = document.getElementById('js_portionInput').value;
      quantity = quantity !== ""? quantity:1;
      for(let key in receivers) {
        if(receivers.hasOwnProperty(key)) {
          receivers[key].innerHTML = (receivers[key].dataset.quantity * quantity) + receivers[key].dataset.unit;
        }
      }
    });
    document.getElementById('js_portionInput').addEventListener("change", function() {
      let receivers = document.getElementsByClassName('js_portionCalculationReceiver');
      let quantity = document.getElementById('js_portionInput').value;
      quantity = quantity !== ""? quantity:1;
      for(let key in receivers) {
        if(receivers.hasOwnProperty(key)) {
          receivers[key].innerHTML = (receivers[key].dataset.quantity * quantity) + receivers[key].dataset.unit;
        }
      }
    });
  });