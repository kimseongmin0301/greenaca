$(document).ready(function () {
    $.ajaxSettings.traditional = true;
    const bno = $("input[name='bno']").val();
    const id = "c";
    list(bno);

    $("#add").on("click", function () {
        var target = $("#reply").val();
        write_reply(bno, id, target);
    })

    $("#chat").on("click", ".update", function () {
        let rno = $(this).data("rno");
        let reply = $("#replycontent" + rno).val();
        modify({rno: rno, reply: reply});
    })

    $("#chat").on("click", ".remove", function () {
        let rno = $(this).data("rno");
        remove({rno: rno});
    })
})

function write_reply(x, y, z) {
    $.ajax({
        url: "/replies",
        type: "post",
        data: JSON.stringify({"bno": x, "id": y, "reply": z}),
        contentType: "application/json; charset=utf-8",
        success: function (data) {
            console.log(data);
            document.getElementById('reply').value = '';
            list();
        }
    })
}

function modify(reply) {
    console.log(reply)
    $.ajax({
        url: "/replies/modify",
        type: "put",
        data: JSON.stringify(reply),
        contentType: "application/json; charset=utf-8",
        success: function (data) {
            if (data == 'success') {
                console.log("성공");
            } else {
                console.log("실패");
            }
        }
    })
}

function remove(rno) {
        $.ajax({
        url: "/replies/remove",
        type: "delete",
        data: JSON.stringify(rno),
        contentType: "application/json; charset=utf-8",
        success: function (data) {
            alert("삭제되었습니다.");
            list();
        }
    })

}

function list() {
    const bno = $("input[name='bno']").val();

    $.getJSON("/replies/" + bno + ".json", function (data) {
        let str = "";

        for (let i = 0; i < data.length; i++) {
            str += "<div><ul><li>" + "작성자 : " + data[i].id + "</li>"
            str += "<li>" + "내용 : " + "<input type='text' value='" + data[i].reply + "' id='replycontent" + data[i].rno + "'>" + "</li>"
            str += "<li>" + "날짜 : " + data[i].replydate + "</li>"
            str += "<li><input class='update' type='button' value='수정' data-rno='" + data[i].rno + "' data-reply='" + data[i].reply + "'>"
            str += "<input class='remove' type='button' value='삭제' data-rno='" + data[i].rno + "'></li></ul></div>"
        }

        $("#replyUL").html(str);
    })
}


