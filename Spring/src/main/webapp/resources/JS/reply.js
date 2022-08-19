$(document).ready(function (){
    const bno = $("input[name='bno']").val();
    const id = "a";
    list(bno);

    $("#add").on("click",function (){
        var target = $("#reply").val();
        write_reply(bno, id, target);
    })
})

function write_reply(x,y,z){
    $.ajax({
        url: "/replies",
        type: "post",
        datatype: "json",
        data: JSON.stringify({"bno": x, "id": y, "reply": z}),
        contentType: "application/json; charset=utf-8",
        success: function (data) {
            document.getElementById('reply').value = ''
            list();
        }
    })
}
function list(){
    const bno = $("input[name='bno']").val();

    $.getJSON("/replies/"+ bno +".json", function (data){
        let str = "";

        for(let i = 0; i < data.length; i++){
            str += "<div>" + "<ul>" + "<li>" + "작성자 : " +data[i].id + "</li>"
            str += "<li>" + "내용 : " + data[i].reply + "</li>"
            str += "<li>" + "날짜 : " + data[i].replydate + "</li>" + "</ul>" + "</div>"
        }

        $("#replyUL").html(str);
    })
}