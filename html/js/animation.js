$(document).ready(function(){
    $('#show').on("click",function(){
        $('p').show("slow",function(){
            alert("보여져")
        });
    })

    $('#hide').on("click",function(){
        $('p').hide("slow",function(){
            alert("숨겨")
        });
    })

    $('#toggle').on("click",function(){
        $('p').toggle("slow",function(){
            alert("영차")
        });
    })

    $('#slideDown').on("click",function(){
        $('p').slideDown();
    })

    $('#slideUp').on("click",function(){
        $('p').slideUp();
    })
    
    $('#slideToggle').on("click",function(){
        $('p').slideToggle();
    })

    $('#fadeIn').on("click",function(){
        $('p').fadeIn("slow",function(){
            alert("asdf")
        });
    })

    $('#fadeOut').on("click",function(){
        $('p').fadeOut();
    })

    $('#fadeToggle').on("click",function(){
        $('p').fadeToggle();
    })


//사용자 지정 애니메이션

    $('div').on("click",function(){
        $('div').animate({
            left:'500',
            width:'+=50',
            height:"+=50"  ,
            "max-width":'100',
            "max-height":'100'
        },"slow")
    })

})