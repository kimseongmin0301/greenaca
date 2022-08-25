$(document).ready(function () {

    // 첨부파일 조건, 특정 크기 이상파일 x
    // 정규식을 이용하여 확장자 제한
    let reg = new RegExp("(.*?)\.(exe|zip|alz)$");
    // 최대 크기 설정
    let maxSize = 5242880; // 5MB
    function checkExtension(filename, fileSize) {
        if (fileSize >= maxSize) {
            alert("파일크기가 너무 커");
            return false;
        }
        if (reg.test(filename)) {
            alert("해당 파일은 업로드 불가능");
            return false;
        }

        return true;
    }

    $("#uploadBtn").on("click", function (e) {
        e.preventDefault();
        alert("a")
        let formData = new FormData();

        let inputFile = $("#upload");
        let files = inputFile[0].files;

        // console.log(files);

        for (var i = 0; i < files.length; i++) {
            checkExtension(files[i].name, files[i].size)

            formData.append("multipartFile", files[i]);
        }

        $.ajax({
            type: "post",
            url: "/uploadajaxAction",
            data: formData,
            processData: false,
            contentType: false,
            dataType: "json",
            success: function (data) {
                console.log(data);
                let str = ""
                $(data).each(function (i, e) {
                    if (e.image) {
                        let filePath = encodeURI(e.uploadPath + "/s_" + e.uuid + "_" + e.fileName);
                        str += "<li><img src='display?fileName=" + filePath + "'></li>"
                    } else {
                        let filePath = encodeURI(e.uploadPath + "/" + e.uuid + "_" + e.fileName);
                        str += "<li><a href='download?fileName=" + filePath + "'>" + e.fileName + "</a></li>"
                    }
                })
                $("#upload_img").html(str);
            }
        })

    })
})
