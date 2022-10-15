/*
jQuery is a JavaScript Library.
jQuery greatly simplifies JavaScript Programming.
jQuery is easy to learn.

It is a lightweight,"write less, do more", Javascript library.

Basic syntax is: $(selector).action()
A $ sign to define/access jQuery
A (selector) to "query (or find)" HTML elements
A jQuery action() to be performed on the element(s)

jQuery was defined as

$(document).ready(function(){

  $(this).hide()

});

also

$(function(){

  $(this).hide()

});
*/

/* 
Element Selector

jQuery selects elements based on the element name.
$("p")
*/
$(document).ready(function(){
    $("p").click(function(){
        $(this).hide();
    });
});


//To select a id - #id - $("#test")
$(document).ready(function(){
    $("#id").click(function(){
     $(this).hide();
    });
});
//To select a class - .class - $(".test")
$(document).ready(function(){
    $(".class").click(function(){
        alert("Class Function")
    });
});

/* 
Events - All the different visitors' actions that a web page can respond to are called events.

An event represents the precise moment when something happens.

Examples:

moving a mouse over an element
selecting a radio button
clicking on an element
*/
//Mouse Events are :

//click - While Clicking on the paragraphs
$(document).ready(function(){
$("#click").click(function(){
  alert("Event Click")
});
});

//dblclick - While double clicking on the paragraphs
$(document).ready(function(){
$(".dblclick").dblclick(function(){
  $(this).hide();
});
});

//mouseenter - While the mouse pointer enters the paragraphs
$(document).ready(function(){
$("#mouseenter").mouseenter(function(){
  alert("Mouse Enter");
});
});

//mouseleave - While tht mouse pointer leaves the paragraphs
$(document).ready(function(){
$(".mouseleave").mouseleave(function(){
  alert("Mouse Leaves");
});
});

//hover - It takes two functions and is a combination of the mouseenter() and mouseleave()
$(document).ready(function(){
$("#hover").hover(function(){
  alert("Hover Starts");
},
function(){
  alert("Hover Ends");
});
});

//focus - While the form field gets foucs
$(document).ready(function(){
$(".focus").focus(function(){
  $(this).css("background-color", "#909090");
});
});

//blur - While the form field loses focus
$(document).ready(function(){
$("#blur").blur(function(){
  $(this).css("background-color", "#909090");
});
});

//on() - While attaching one or more event handlers for the selected elements.  
$(document).ready(function(){
  $("p1").on("click", function(){
    $(this).hide();
  });
});

/* 
jQuery effects

Hide and Show - It will hide or show the elements
$("#hide").click(function(){
  $("p").hide();
});

$("#show").click(function(){
  $("p").show();
});

To slow down the hide element 
$("button").click(function(){
  $("p").hide(1000);
});

Toggle - It is used between hiding and showing an element 
$("button").click(function(){
  $("p").toggle();
});

Fade
Fade In - It us used to fade in a hidden element
$("button").click(function(){
  $("#div1").fadeIn();
  $("#div2").fadeIn("slow");
  $("#div3").fadeIn(3000);
});

Fade Out - It is used to fade out a visible elements
$("button").click(function(){
  $("#div1").fadeOut();
  $("#div2").fadeOut("slow");
  $("#div3").fadeOut(3000);
});

Fade Toggle - It is used between the fadeIn() and fadeOut() methods 
$("button").click(function(){
  $("#div1").fadeToggle();
  $("#div2").fadeToggle("slow");
  $("#div3").fadeToggle(3000);
});

Fade To - It is used to allows fading to a given opacity (value between 0 and 1)
$("button").click(function(){
  $("#div1").fadeTo("slow", 0.15);
  $("#div2").fadeTo("slow", 0.4);
  $("#div3").fadeTo("slow", 0.7);
});

Slide
Slidedown - It is used to slide down an element
$("#flip").click(function(){
  $("#panel").slideDown();
});

Slideup - It is used to slide up an element
$("#flip").click(function(){
  $("#panel").slideUp();
});

Slidetoggle - It is used between the slideDown() and slideUp() methods.
$("#flip").click(function(){
  $("#panel").slideToggle();
});

Animation 
Animate - It is used to create custom animations
$("button").click(function(){
  $("div").animate({left: '250px'});
}); 

Multiple Properties
$("button").click(function(){
  $("div").animate({
    left: '250px',
    opacity: '0.5',
    height: '150px',
    width: '150px'
  });
}); 

Relative Values
$("button").click(function(){
  $("div").animate({
    left: '250px',
    height: '+=150px',
    width: '+=150px'
  });
}); 

Toggle
$("button").click(function(){
  $("div").animate({
    height: 'toggle'
  });
}); 

Queue Function
1.
$("button").click(function(){
  var div = $("div");
  div.animate({height: '300px', opacity: '0.4'}, "slow");
  div.animate({width: '300px', opacity: '0.8'}, "slow");
  div.animate({height: '100px', opacity: '0.4'}, "slow");
  div.animate({width: '100px', opacity: '0.8'}, "slow");
}); 
2.
$("button").click(function(){
  var div = $("div");
  div.animate({left: '100px'}, "slow");
  div.animate({fontSize: '3em'}, "slow");
}); 

Stop
$("#stop").click(function(){
  $("#panel").stop();
});

CALLBACK FUNCTION - It will be executed line by line.
A callback function is executed after the current effect is finished.
$(selector).hide(speed,callback);

With callback
$("button").click(function(){
  $("p").hide("slow", function(){
    alert("The paragraph is now hidden");
  });
});

Without callback
$("button").click(function(){
  $("p").hide(1000);
  alert("The paragraph is now hidden");
});

CHAINING
Chaining allows us to run multiple jQuery methods (on the same element) within a single statement.
$("#p1").css("color", "red").slideUp(2000).slideDown(2000);
*/