$(function(){
    
    /*
    $("h1").css("color", "red");
 //   $("p").fadeOut("slow");
    $("h2").text("おやすみ");
    
    $("#aa,#bb").css("color", "red");
    
    $(".aaa .bbb").fadeOut();
    
    
    $("h1").click(function(){
        $("p").fadeOut();
    });
    
    */
    
    /*
    $("div").click(function(){
        $("p").css("color", "blue")
    });
    */
    
    $(".total").click(function(){
        $("p").text("20");
    });
    
    
    $(".boxA").click(function(){
        $(".boxB").hide();
    });
    
    $("p").hover(
      function(){
          $("img").fadeIn();
      },
      function(){
          $("img").fadeOut();
      }
      );
    
    $("img").hover(
        function(){
            $(this).animate({width:"220px"});
        },
        function(){
            $(this).animate({width:"200px"});
        }
    
    
    );





});