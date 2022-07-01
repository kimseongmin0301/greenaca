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
    answer += el.value + "\n";});

    document.getElementById('answer').innerText = answer;
}
