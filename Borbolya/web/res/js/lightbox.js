var active = document.getElementById("active");

var elso = document.getElementById("elso");
var masodik = document.getElementById("masodik");
var harmadik = document.getElementById("harmadik");
var negyedik = document.getElementById("negyedik");
var otodik = document.getElementById("otodik");
var hatodik = document.getElementById("hatodik");

var lightbox = document.getElementById("lightbox");

var sorszam = document.getElementById("sorszam");

elso.addEventListener("click", openL);
masodik.addEventListener("click", openL);
harmadik.addEventListener("click", openL);
negyedik.addEventListener("click", openL);
otodik.addEventListener("click", openL);
hatodik.addEventListener("click", openL);

var x = document.getElementById("close");
x.addEventListener("click", closeL);

/*var vissza = document.getElementById("vissza");
var tovabb = document.getElementById("tovabb");

vissza.addEventListener("click", previous);
tovabb.addEventListener("click", next);*/

var index = 0;

function nyilak(event){
    var x = event.keyCode;
    if(x == 37) openL(index -= 1);
    else if(x == 39) openL(index += 1);
    else if(x == 27) closeL();
}

function next(n){
    openL(index += n);
}
function aktiv(n){
    openL(index = n);
}

function openL(n){
    lightbox.style.display = "block";
    lightbox.style.animationName = "open";
    
    if(index < 1) n = 6;
    if(index > 6) n = 1;
    
    switch(n){
        case 1:
            active.src = elso.src;
            index = n;
            sorszam.innerHTML = "1/6";
            break;
        case 2:
            active.src = masodik.src;
            index = n;
            sorszam.innerHTML = "2/6";
            break;
        case 3:
            active.src = harmadik.src;
            index = n;
            sorszam.innerHTML = "3/6";
            break;
        case 4:
            active.src = negyedik.src;
            index = n;
            sorszam.innerHTML = "4/6";
            break;
        case 5:
            active.src = otodik.src;
            index = n;
            sorszam.innerHTML = "5/6";
            break;
        case 6:
            active.src = hatodik.src;
            index = n;
            sorszam.innerHTML = "6/6";
            break;
    }
    
    document.body.addEventListener("keydown", nyilak);
}

function closeL(){
    lightbox.style.display = "none";
    lightbox.style.animationName = "close";
    document.body.removeEventListener("keydown", nyilak);
}

var vissza = document.getElementById("galeriaVissza");
var tovabb = document.getElementById("galeriaTovabb");
var felirat = document.getElementById("galeriaFelirat");
var kepek = document.getElementsByClassName("galeriakep");

var aktivGaleria = 1;

vissza.addEventListener("click", elozo);
vissza.addEventListener("click", feliratok);
tovabb.addEventListener("click", kovetkezo);
tovabb.addEventListener("click", feliratok);

function elozo(){
    aktivGaleria--;
    if(aktivGaleria == 0) aktivGaleria = 5;
    
    for(i = 0; i < kepek.length; i++) kepek[i].src = "res/img/galeria/" + aktivGaleria.toString() + "/" + (i+1).toString() + ".jpg";
    
}
function kovetkezo(){
    aktivGaleria++;
    if(aktivGaleria == 6) aktivGaleria = 1;
    
    for(i = 0; i < kepek.length; i++) kepek[i].src = "res/img/galeria/" + aktivGaleria.toString() + "/" + (i+1).toString() + ".jpg";
    
}
function feliratok(){
    switch(aktivGaleria){
        case 1: felirat.innerHTML = " cserkút / környezet ";
            break;
        case 2: felirat.innerHTML = " vendégház ";
            break;
        case 3: felirat.innerHTML = " négyszemélyes apartman ";
            break;
        case 4: felirat.innerHTML = " kétszemélyes apartman ";
            break;
        case 5: felirat.innerHTML = " hangulatképek ";
    }
}
