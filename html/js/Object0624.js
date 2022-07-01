var product={
    //속성
    name : "ice Americano",
    type : "coffee",

    //메소드
    eat : function(drink){
        console.log(drink+"를 마십니다.");
    }
}

console.log(product.type);
product.eat("뭔가");

window.document.write("abc")