//Ex1

// 자바 스크립트에서는 전역변수를 선호 하지 않는다 (이유 : 전역변수는 상당한 메모리를 차지, 유지보수 힘듬) => 함수로 묶어 지역변수 사용
// 굳이 querySelector를 사용한 이유는? 궁금함, 
let plus = document.querySelector('#plus');
let minus = document.querySelector('#minus');
let text = document.querySelector('#num');

// 이것도 마찬가지 함수로 묶는다
// plus.addEventListener("click",nplus)
// minus.addEventListener("click",nminus)

// // 밑에 두개의 함수는 하나로 묶을 수 있다. (이유 : 중복되는 코드 줄이기)
// function nplus(){
//     var p = 1
//     var sum = Number(text.value) + p;
//     text.value = sum;
// }
// function nminus(){
//     var p = 1
//     var sum = Number(text.value) - p;
//     if(sum < 1 ){
//         sum = 1;
//     }
//     text.value = sum;

// }

// 줄인 코드
function nNum(type){
    var sum = Number(text.value) + type;
    if(sum < 1 ){
        sum = 1;
    }
    console.log(sum);
    text.value = sum;
}
plus.addEventListener("click",()=>nNum(1));
minus.addEventListener("click",()=>nNum(-1));


//Ex2
// 지역변수로 변경
// querySelecter가 중복됨 => querySelecterAll를 사용해서 하나의 id 기준 자식값을 배열로 가져오기
var check1 = document.getElementById('check1');
var check2 = document.querySelector('#check2');
var check3 = document.querySelector('#check3');
var answer = document.querySelector('#answer')
var list = document.querySelector('#list');

list_result.addEventListener('click',result)

// handle함수의 이름은 대도록이면 특정 이름 붙이기, 난 handle씀 (이유 : 이게 많아지면 알아먹기 힘듬) ex) function handleResult()
function result(){
    const query = 'input[name="play"]:checked';
    const selectedEls = 
        document.querySelectorAll(query);
        
    let answer = '';

    // 이렇게 쓰면 마지막 문자도 띄어쓰기가 포함됨..
    selectedEls.forEach((el) => {
    answer += el.value;});

    document.getElementById('answer').innerText = answer;
}

//Ex3
let area = document.querySelector('#area')
let area_result = document.querySelector('#area_result')

area.addEventListener('keyup',keyup1)

// aaddListener에 keyup 옵션만 주는 경우 paste 나 change에 대해서 반응을 안함 => 실시간이 안됨
function keyup1(){
    area_result.innerHTML = area.value.length;
}


// 특정 ID 값 가져올경우 getElementById 사용(이유 : 이게 더 빠름 querySelector일 경우 크롤링이라 조금 더 느림)
let one = document.querySelector('#one')
let two = document.querySelector('#two')
let three = document.querySelector('#three')
let ssum = document.querySelector('#ssum')

ssum.addEventListener('click',Sum)

function Sum(){
    var Sum = Number(one.value) + Number(two.value)
    three.value=Sum;
}


//Ex4
let f_num = document.querySelector('#f_num')
let mul = document.querySelector('#mul')
let opt = document.querySelector('#opt')

opt.addEventListener('change',chan)
f_num.addEventListener('change',chan)

function chan(){
    var sum = Number(f_num.value) * Number(opt.value)
    mul.value = sum

    // innerHTML.. 단순히 text만 추가하는 거면 innerText 사용 (이유 : 적는칸에 <script>for(let i=0; i<100000; i++) alert('test')</script) 쓰면 말그대로 100000번의 alert가 발생)
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
