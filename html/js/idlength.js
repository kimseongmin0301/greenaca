function change(){
    let id = document.querySelector('#text').value;
    let an = document.querySelector('#sb');

    let test = /[a-z0-9_]{5,20}/g
    if(test.test(id)){
        alert("asdf");
    }

    if(id.length >= 5 && id.length <= 20){
        an.textContent = "정상";
        an.style.color = "green"
    }else if(id.length == 0){
        an.textContent = "필수값이다"
        an.style.color="red";
    }else{
        an.textContent="5이상 20이하를 적어";
        an.style.color="red";
    }
}

function change_pw(){
    const pw = document.querySelector('#pw').value;
    const pw_an = document.querySelector('#pw_an')

    if(pw.length >= 8 && pw.length<= 16){
        pw_an.textContent = "확인"
        pw_an.style.color = "green"
    }else if(pw.length == 0){
        pw_an.textContent = "필수값이다"
        pw_an.style.color="red";
    }else{
        pw_an.textContent="8이상 16이하를 적어";
        pw_an.style.color="red";
    }
}

function change_pw_re(){
    const pw = document.querySelector('#pw').value; 
    const pw_re = document.querySelector('#pw_re').value;
    const pw_an_re = document.querySelector('#pw_an_re');

    if(pw === pw_re){
        pw_an_re.textContent = "일치"
        pw_an_re.style.color = "green"
    }else{
        pw_an_re.textContent = "안일치"
        pw_an_re.style.color = "red"
    }

}

