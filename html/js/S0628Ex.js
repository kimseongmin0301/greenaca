//Ex1
let plus = document.querySelector('#plus');
let minus = document.querySelector('#minus');
let text = document.querySelector('#num');

plus.addEventListener("click",nplus)
minus.addEventListener("click",nminus)

function nplus(){
    var p = 1
    var sum = Number(text.value) + p;
    text.value = sum;
}
function nminus(){
    var p = 1
    var sum = Number(text.value) - p;
    if(sum < 1 ){
        sum = 1;
    }
    text.value = sum;

}

// plus.addEventListener("click",nNum)
// minus.addEventListener("click",nNum)

// // 줄인 코드
// function nNum(type){
//     var sum = Number(text.value) + type;
//     if(sum < 1 ){
//         sum = 1;
//     }
//     console.log(sum);
//     text.value = sum;
// }
// plus.addEventListener("click",()=>nNum(1));
// minus.addEventListener("click",()=>nNum(-1));


//Ex2
var check1 = document.getElementById('check1');
var check2 = document.querySelector('#check2');
var check3 = document.querySelector('#check3');
var answer = document.querySelector('#answer')
var list = document.querySelector('#list');

list_result.addEventListener('click',result)

function result(){
    const query = 'input[name="play"]:checked';
    const selectedEls = 
        document.querySelectorAll(query);

    let answer = '';
    selectedEls.forEach((el) => {
    answer +='<h1>' + el.value + '</h1>';});

    document.getElementById('answer').innerHTML = answer;
}

//Ex3
let area = document.querySelector('#area')
let area_result = document.querySelector('#area_result')

area.addEventListener('keyup',keyup1)

function keyup1(){
    area_result.innerHTML = area.value.length;
}


//Ex4
let one = document.querySelector('#one')
let two = document.querySelector('#two')
let three = document.querySelector('#three')
let ssum = document.querySelector('#ssum')

ssum.addEventListener('click',Sum)

function Sum(){
    var Sum = Number(one.value) + Number(two.value)
    three.value=Sum;
}


let f_num = document.querySelector('#f_num')
let mul = document.querySelector('#mul')
let opt = document.querySelector('#opt')

opt.addEventListener('change',chan)
f_num.addEventListener('change',chan)

function chan(){
    var sum = Number(f_num.value) * Number(opt.value)
    mul.value = sum
    mul.innerHTML = sum
}

let btn_f = document.querySelector('#btn_f')

btn_f.addEventListener('click',fruit_sum)

function fruit_sum(){
    let f_list = 'input[name="fruit"]:checked'
    let rhkdlf = document.querySelectorAll(f_list)

    let answer = 0

    rhkdlf.forEach((el) => {
      answer  += Number(el.value)});
        
        document.getElementById('fruit_sum').innerText = Number(answer);
}

//Ex5
function check() {
    let idc = document.getElementById('idc')
    let pwc = document.getElementById('pwc')
    idc.innerText = ""
    pwc.innerText = ""

    if(!fr.id.value && !fr.pw.value){
        idc.innerText = "아이디를 입력하시오"
        pwc.innerText = "비밀번호를 입력하시오"

        return false;
    }else if(!fr.id.value) {
        idc.innerText = "아이디를 입력하시오"
      
        return false;
    }else if(!fr.pw.value) {
        pwc.innerText = "비밀번호를 입력하시오"

        return false;
    }
}