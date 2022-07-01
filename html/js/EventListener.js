
        const element = document.querySelector('#btn');
        const text = document.getElementById('text')
    
        element.addEventListener("click",ck)
        element.addEventListener("mouseover",mu)
        function ck(){
            text.innerHTML += "Hello<br>";
        }
    
        function mu(){
            text.innerHTML += "hover<br>";
        }
