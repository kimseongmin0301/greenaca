/*
 * 대화상자(alert,confirm.prompt)
 * */

alert('hi');
confirm('hi\ngd');
prompt('gd');

let carName = 'Volvo';

let k = 50;

let x = 5,
  y = 10;

alert(x + y);

let answer = confirm('진짜로 삭제하시겠습니까?');
if (answer == true) {
  alert('삭제됨');
} else {
  alert('취소됨');
}

let num1 = prompt('첫번째 값');
let num2 = prompt('두번째 값');

alert(Number(num1) + Number(num2));

let age = Number(prompt('나이를 입력하세요'));

while (true) {
  if (age == null) {
    break;
  }
  if (age >= 19) {
    alert('인증됨');
    break;
  } else {
    alert('인증불가');
    age = prompt('나이를 입력하세요');
    if (age >= 19) {
      alert('인증됨');
      break;
    }
  }
}
