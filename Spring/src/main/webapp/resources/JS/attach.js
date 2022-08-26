$(function (){
    let bno = $("#bno").val();
    $.getJSON("/attachlist",{bno:bno},function (data){
        console.log(data);

        $(data).each(function (i,e){
            let str = "";
            if(e.image){
                let filePath = encodeURI(e.uploadPath + "/s_" + e.uuid + "_" + e.fileName);
                str += "<li><img src='display?fileName=" + filePath + "'></li>"
                // str += "<li><img src='/api/img/'></li>"
            }else{
                let filePath = encodeURI(e.uploadPath + "/" + e.uuid + "_" + e.fileName);
                str += "<li><a href='download?fileName=" + filePath + "'>" + e.fileName + "</a></li>"
            }
            $("#upload_img").append(str);
        })

    })
})
