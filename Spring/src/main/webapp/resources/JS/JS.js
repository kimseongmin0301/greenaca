function id_check(){
    $.ajax({
        url:"/join",
        type:"POST",
        dataType:"JSON",
        data:{"id" : $("#id").val()},
        success:function (data){
            if(data == 1){
                alert("중복된 아이디입니다.");
            }else if(data == 0){
                $("#idCheck").attr("value","Y");
                alert("사용가능");
            }
        }
    })
}