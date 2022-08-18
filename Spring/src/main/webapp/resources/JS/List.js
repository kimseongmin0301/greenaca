$(document).ready(function (){

    $("input[type='button']").on("click",function (){
        $("input[name='pageNum']").val("1");
        $("#searchForm").submit();
    })

})