$(document).ready(function (){
    const bno = $("input[name='bno']").val();
    const id = "a";
    $("#add").on("click",function (){
        var target = $("#reply").val();
        write_reply(bno,id,target);
    })
})

function write_reply(x,y,z){
    $.ajax({
        url : `/replies`,
        type : "post",
        datatype : "json",
        data: JSON.stringify({"bno":x,"id":y,"reply":z}),
        contentType:"application/json; charset=utf-8",
        success:function (data){
            console.log(data);
        }
    })
}
