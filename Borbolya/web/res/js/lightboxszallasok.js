

var vendeghazmain = document.getElementById("vendeghazmain");
var vendeghaz1 = document.getElementById("vendeghaz1");
var vendeghaz2 = document.getElementById("vendeghaz2");
var vendeghaz3 = document.getElementById("vendeghaz3");
var vendeghaz4 = document.getElementById("vendeghaz4");
var vendeghaz5 = document.getElementById("vendeghaz5");

var ketszemelyesmain = document.getElementById("ketszemelyesmain");
var ketszemelyes1 = document.getElementById("ketszemelyes1");
var ketszemelyes2 = document.getElementById("ketszemelyes2");
var ketszemelyes3 = document.getElementById("ketszemelyes3");
var ketszemelyes4 = document.getElementById("ketszemelyes4");
var ketszemelyes5 = document.getElementById("ketszemelyes5");

var negyszemelyesmain = document.getElementById("negyszemelyesmain");
var negyszemelyes1 = document.getElementById("negyszemelyes1");
var negyszemelyes2 = document.getElementById("negyszemelyes2");
var negyszemelyes3 = document.getElementById("negyszemelyes3");
var negyszemelyes4 = document.getElementById("negyszemelyes4");
var negyszemelyes5 = document.getElementById("negyszemelyes5");

var active = document.getElementById("active");
var lightbox = document.getElementById("lightbox");

var x = document.getElementById("close");
x.addEventListener("click", closeL);

vendeghazmain.addEventListener("click", openL);
ketszemelyesmain.addEventListener("click", openL2);
negyszemelyesmain.addEventListener("click", openL3);

var i = 1;

function arrow(n){
    i += n;
    if(i < 1) i = 5;
    if(i > 5) i = 1;
    mainchange(i);
}

function mainchange(n){
    switch(n){
        case 1:
            vendeghazmain.src = vendeghaz1.src;
            i = n;
            break;
        case 2:
            vendeghazmain.src = vendeghaz2.src;
            i = n;
            break;
        case 3:
            vendeghazmain.src = vendeghaz3.src;
            i = n;
            break;
        case 4:
            vendeghazmain.src = vendeghaz4.src;
            i = n;
            break;
        case 5:
            vendeghazmain.src = vendeghaz5.src;
            i = n;
            break;
    }
}
function mainchange2(n){
    switch(n){
        case 1:
            ketszemelyesmain.src = ketszemelyes1.src;
            break;
        case 2:
            ketszemelyesmain.src = ketszemelyes2.src;
            break;
        case 3:
            ketszemelyesmain.src = ketszemelyes3.src;
            break;
        case 4:
            ketszemelyesmain.src = ketszemelyes4.src;
            break;
        case 5:
            ketszemelyesmain.src = ketszemelyes5.src;
            break;
    }
}
function mainchange3(n){
    switch(n){
        case 1:
            negyszemelyesmain.src = negyszemelyes1.src;
            break;
        case 2:
            negyszemelyesmain.src = negyszemelyes2.src;
            break;
        case 3:
            negyszemelyesmain.src = negyszemelyes3.src;
            break;
        case 4:
            negyszemelyesmain.src = negyszemelyes4.src;
            break;
        case 5:
            negyszemelyesmain.src = negyszemelyes5.src;
            break;
    }
}


function nyilak(event){
    var x = event.keyCode;
    if(x == 27) closeL();
}

function openL(n){
    lightbox.style.display = "block";
    lightbox.style.animationName = "open";
    document.body.addEventListener("keydown", nyilak);
    
    active.src = vendeghazmain.src;
}
function openL2(n){
    lightbox.style.display = "block";
    lightbox.style.animationName = "open";
    document.body.addEventListener("keydown", nyilak);
    
    active.src = ketszemelyesmain.src;
}
function openL3(n){
    lightbox.style.display = "block";
    lightbox.style.animationName = "open";
    document.body.addEventListener("keydown", nyilak);
    
    active.src = negyszemelyesmain.src;
}

function closeL(){
    lightbox.style.display = "none";
    lightbox.style.animationName = "close";
    document.body.removeEventListener("keydown", nyilak);
}