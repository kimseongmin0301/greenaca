// var a = [51, 73, 100, 32, 57, 100, 31, 20];
//
// var sum = 0;
// var avg = 0;
//
// for (var i = 0; i < a.length; i++) {
//   sum += a[i];
// }
// avg = sum / a.length;
//
// console.log(sum);
// console.log(avg);

// function sum(a, b) {
//   return a + b;
// }
// console.log(sum(10, 20));
// function sum() {
//   var a = [51, 73, 100, 32, 57, 100, 31, 20];
//   var sum = 0;
//
//   for (var i = 0; i < a.length; i++) {

// function tri_area(x, y) {
//   return (x * y) / 2;
//     sum += a[i];
//   }
//   return sum;
// }
//
// function avg() {
//   var a = [51, 73, 100, 32, 57, 100, 31, 20];
//
//   var sum = 0;
//   var avg = 0;
//
//   for (var i = 0; i < a.length; i++) {
//     sum += a[i];
//   }
//   avg = sum / a.length;
//   return avg;
// }
// console.log(sum());
// console.log(avg());
// a = function (x, y) {
//   return x + y;
// };
// console.log(a(1, 2));
// }
//
// console.log(tri_area(3, 4));


// console.log("1234")


//익명함수
// console.log(add(5,7))

// var add=function(a,b){
//     return a+b;
// }


// //콜백함수(매개변수로 전달하는 함수)

// // callback 함수 선언
// function callbacktest(){
//     for(var i =0; i<3; i++){
//         callback();
//     }
// }

// //callback 함수 호출
// var callback = function (){
//     console.log('콜백함수 호출')
// }

// //callbacktest함수 호출
// callbacktest();

// var a=function(){console.log("asb")}

// function callbacktest ( a ){
//     for(var i=0; i<3; i++)
//     a();
// }

// callbacktest(function(){console.log("asb")})

// function abc(a,b,c){
//     alert(a)
//     alert(a*b)
//     alert(a*b*c)
// }
// abc(10,100);

// function power(a,b = 2){
//     console.log(Math.pow(a,b));
// }
// power(2,4);


// function multiply(){       
//     if(arguments.length==0) {
//         return 0;}
//     else{
//         value=1;        
    
//         for (var i = 0; i<arguments.length; i++){    
//             value=value*arguments[i];        
//         }       

//         return value;    
//     }   
// }    

// console.log(multiply(3,4,5,9));


// function multiply(...nums){       
//     if(nums.length==0) {
//         return undefined;}
//     else{
//         return nums.reduce((key, value) => key * value);
//     }   
// }    

// console.log(multiply(3,4,5,6));


// let value = { a: 1, b: 2, c: 3 };
// value = { ...value, a: 2 };
// console.log(value);


// var x=10, y=2;

// if(x>4){
//     if(y>2){
//         console.log(x*y)
//     }
// }else{
//     console.log();
// }
var cols = document.querySelectorAll("#cols .btn");

for (var i = 0; i < cols.length; i++) {
    cols[i].addEventListener("click", click);
}
cols[1].style.color = "red";

var text = document.getElementById("text");

function click(e) {
    text.innerHTML = "text";
}
