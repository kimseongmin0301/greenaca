// let num = 140;
//
// switch (num) {
//   case 10:
//     alert('10');
//     break;
//   case 20:
//     alert('20');
//     break;
//   case 30:
//     alert('30');
//     break;
//   default:
//     alert('50');
// }

<!-- 문제 1 -->
// let answer = prompt('');
// if (answer.includes('안녕')) {
//   alert('안녕하세요');
// } else if (answer.includes('잘자') || answer.includes('잘 자')) {
//   alert('안녕히 주무세요');
// }

<!-- 삼항연산자1 -->
// answer.includes('안녕')
//   ? alert('안녕하세요')
//   : answer.includes('잘자') || answer.includes('잘 자')
//   ? alert('안녕히 주무세요')
//   : answer;

<!-- 문제 2 -->
// if (!answer.includes('안녕')) {
//   alert('인사를 안하다니');
// }
<!-- 삼항연산자2 -->
// !answer.includes('안녕')?alert('인사를 안하다니'):answer


<!-- 문제 3 -->
// let answer = Number(prompt(''));
// if (answer % 4 == 0) {
//   alert('4로 나눌수 있는 숫자입니다.');
// }
<!-- 삼항연산자3 -->
// answer%4==0 ? alert('4로 나눌 수 있는 숫자입니다.') : alert('없어');


<!-- 문제 4 -->
// let answer = Number(prompt(''));
// if (answer > 0) {
//   alert('양수입니다.');
// } else if (answer < 0) {
//   alert('음수입니다.');
// } else {
//   alert('0입니다.');
// }

<!-- 삼항연산자4 -->
// answer > 0?alert('양수') : answer<0 ? alert('음수') : alert('0임');


<!-- 문제 5 -->
// let answer = Number(prompt(''));
// if (answer == 0) {
//   alert('0입니다.');
// } else if (answer % 2 == 0) {
//   alert('짝수입니다.');
// } else if (answer % 2 == 1) {
//   alert('홀수입니다.');
// } else if (isNaN(answer)) {
//   alert('문자임');
// } else if (answer < 0) {
//   alert('음수');
// }
// console.log(answer);

<!-- 삼항연산자5 -->
// answer==0?alert('0')
//     :answer%2==0?alert('짝수')
//     :answer%2==1?alert('홀수')
//     :isNaN(answer)?alert('문자')
//     :answer<0? alert('음수')
//     :answer;
const myFn = (a = 100, b = 200) => a + b;
console.log(myFn()); // 300