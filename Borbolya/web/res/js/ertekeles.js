var csillagok = document.getElementById('stars');

var egy = document.getElementById('1');
var ketto = document.getElementById('2');
var harom = document.getElementById('3');
var negy = document.getElementById('4');
var ot = document.getElementById('5');

var pont = document.getElementById('pont');
var pontkuldes = document.getElementById('pontkuldes');

csillagok.addEventListener("mouseleave", csillag0);
csillagok.addEventListener("click", ertekeles);

egy.addEventListener("mouseover", csillag1);
ketto.addEventListener("mouseover", csillag2);
harom.addEventListener("mouseover", csillag3);
negy.addEventListener("mouseover", csillag4);
ot.addEventListener("mouseover", csillag5);

function csillag0(){
    egy.className = "fa fa-star-o";
    ketto.className = "fa fa-star-o";
    harom.className = "fa fa-star-o";
    negy.className = "fa fa-star-o";
    ot.className = "fa fa-star-o";
    pont.innerHTML = "0/5";
    pontkuldes.innerHTML="0";
}
function csillag1(){
    egy.className = "fa fa-star";
    ketto.className = "fa fa-star-o";
    harom.className = "fa fa-star-o";
    negy.className = "fa fa-star-o";
    ot.className = "fa fa-star-o";
    pont.innerHTML = "1/5";
    pontkuldes.innerHTML="1";
}
function csillag2(){
    egy.className = "fa fa-star";
    ketto.className = "fa fa-star";
    harom.className = "fa fa-star-o";
    negy.className = "fa fa-star-o";
    ot.className = "fa fa-star-o";
    pont.innerHTML = "2/5";
    pontkuldes.innerHTML="2";
}
function csillag3(){
    egy.className = "fa fa-star";
    ketto.className = "fa fa-star";
    harom.className = "fa fa-star";
    negy.className = "fa fa-star-o";
    ot.className = "fa fa-star-o";
    pont.innerHTML = "3/5";
    pontkuldes.innerHTML="3";
}
function csillag4(){
    egy.className = "fa fa-star";
    ketto.className = "fa fa-star";
    harom.className = "fa fa-star";
    negy.className = "fa fa-star";
    ot.className = "fa fa-star-o";
    pont.innerHTML = "4/5";
    pontkuldes.innerHTML="4";
}
function csillag5(){
    egy.className = "fa fa-star";
    ketto.className = "fa fa-star";
    harom.className = "fa fa-star";
    negy.className = "fa fa-star";
    ot.className = "fa fa-star";
    pont.innerHTML = "5/5";
    pontkuldes.innerHTML="5";
}
function ertekeles(){
    csillagok.removeEventListener("mouseleave", csillag0);
    egy.removeEventListener("mouseover", csillag1);
    ketto.removeEventListener("mouseover", csillag2);
    harom.removeEventListener("mouseover", csillag3);
    negy.removeEventListener("mouseover", csillag4);
    ot.removeEventListener("mouseover", csillag5);
    
    egy.addEventListener("click", csillag1);
    ketto.addEventListener("click", csillag2);
    harom.addEventListener("click", csillag3);
    negy.addEventListener("click", csillag4);
    ot.addEventListener("click", csillag5);
    
    pont.style.animationName = "pontszam";
}