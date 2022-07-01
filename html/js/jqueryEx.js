$(document).ready(function(){
    // $('#header1').css({"color":"red","background":"blue"});
    // $('.header1').css("background","yellow");
    // $('h1').css("font-size","20px");
    $('#header1').on("click",function(){
        alert("asdf");
    });
    $('#header1').on("mouseover",function(){
        $('#header1').css({"color":"red","background":"blue"});
    });
    $('#header1').on("mouseout",function(){
        $('#header1').css({"color":"black","background":"none"});
    });



    // $('#idchk').on("blur",function(){
    //     let text = /^[a-z0-9-_]{5,20}$/g;
    // //     alert("id입력란에서 커서를 뺏겼을 때");
    // console.log($('#idchk').val())

    // if(text.test($('#idchk').val())){
    //     document.querySelector('#answer').innerHTML="통과"
    //     $('#answer').css({"color":"green"});
    // }else{
    //     document.querySelector('#answer').innerHTML="안통과"
    //     $('#answer').css({"color":"red"});
    // }

    // });

  
    $('#txtEmail').on("blur",function(){
        let email =/^[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*@[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*.[a-zA-Z]$/g;
    //     alert("id입력란에서 커서를 뺏겼을 때");

    if(email.test($('#txtEmail').val())){
        document.querySelector('#email_answer').innerHTML="통과"
        $('#email_answer').css({"color":"green"});
    }else{
        document.querySelector('#email_answer').innerHTML="안통과"
        $('#email_answer').css({"color":"red"});
    }

    });

});