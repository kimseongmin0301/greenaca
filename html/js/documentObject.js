// id를 이용한 선택자

window.onload=function(){
var header_id = document.getElementById("header1");
var header_class = document.getElementsByClassName('header1');
var header_tag = document.getElementsByTagName("h1");
console.log(header_id);
console.log(header_class);
console.log(header_tag);

// querySelector
var header_qid = document.querySelector('#header1');
var header_qclass = document.querySelector('.header1');
var header_qtag = document.querySelector('h1');
console.log(header_qid);
console.log(header_qclass);
console.log(header_qtag);

// querySelectorAll
var header_qid_all = document.querySelectorAll('#header1');
var header_qclass_all = document.querySelectorAll('.header1');
var header_qtag_all = document.querySelectorAll('h1');
console.log(header_qid_all);
console.log(header_qclass_all);
console.log(header_qtag_all);

var id = document.querySelector("p");
    id.innerHTML="뭐123124";
    id.style.color="red";
    id.style.backgroundColor="yellow";
 
    
var img = document.querySelector("img");
    // console.log(img.getAttribute("src"));

    // img.setAttribute("src","img/flower.jpg");
    // console.log(img.getAttribute("src"));


var cnt = 0;

var button = document.querySelector("input");
    button.onclick=function(){
        if(cnt == 0){
            img.setAttribute("src","img/flower.jpg");
            cnt ++;
        }else if(cnt == 1){
            img.setAttribute("src","img/cosmos.jpg");
            cnt = 0;
        }
    }
}


