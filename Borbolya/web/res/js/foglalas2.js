var nev = document.getElementById('inputNev');
var email = document.getElementById('inputEmail');
var felnott = document.getElementById('felnottSzam');
var telefon = document.getElementById('inputTelefonszam');
var gyerek1 = document.getElementById('kisgyerekSzam');
var gyerek2 = document.getElementById('gyerekSzam');
var kisallat = document.getElementById('kisallatSzam');
var fizetes = document.getElementById('fizetes');

var datum1 = document.getElementById('erkezesNap');
var datum2 = document.getElementById('tavozasNap');

var hanynap = document.getElementById('hanynap');
var osszeg = document.getElementById('osszeg');

var hibauzenet = document.getElementById('hibauzenet');

nev.addEventListener("focusout", nevF);
felnott.addEventListener("input", felnottF);
gyerek1.addEventListener("input", gyerek1F);
gyerek2.addEventListener("input", gyerek2F);
kisallat.addEventListener("input", kisallatF);

datum1.addEventListener("input", datumF);
datum2.addEventListener("input", datumF);

felnott.addEventListener("input", vegosszeg);
gyerek1.addEventListener("input", vegosszeg);
gyerek2.addEventListener("input", vegosszeg);
kisallat.addEventListener("input", vegosszeg);
datum1.addEventListener("input", vegosszeg);
datum2.addEventListener("input", vegosszeg);

nev.addEventListener("input", kitoltve);
email.addEventListener("input", kitoltve);
telefon.addEventListener("input", kitoltve);
felnott.addEventListener("input", kitoltve);
fizetes.addEventListener("input", kitoltve);
datum2.addEventListener("input", kitoltve);

var gomb = document.getElementById('submitgomb');

gomb.disabled = false;
gomb.style.background = "gray";

var today = new Date();
var y = today.getFullYear();
var m = String(today.getMonth() + 1).padStart(2, '0'); 
var d = String(today.getDate()).padStart(2, '0');

today = y + '-' + m + '-' + d;

datum1.value = today;
datum2.value = today;

datum1.min = today;
datum2.min = today;

var kulonbseg = Math.abs((Date.parse(datum2.value) - Date.parse(datum1.value)) / 1000 / 60 / 60 / 24) + 1;
var ejszaka = kulonbseg - 1;
hanynap.innerHTML = kulonbseg.toString() + ' nap, ' + (kulonbseg - 1).toString() + ' éjszaka';

function kitoltve(){
    if(nev.value != "" && email.value != "" && telefon.value != "" && felnott.value != "" && datum2.value != datum1.value && fizetes.value != ""){
        gomb.disabled = false;
        gomb.style.animationName = "aktiv";
    }
    
    else{
        gomb.disabled = true;  
        gomb.style.animationName = "nemaktiv";
    }     
}

function datumF(){
    if(datum1.value < today || datum2.value < today) datum1.value = today;
    if(datum2.value == "" || datum1.value > datum2.value) datum2.value = datum1.value;
    
    kulonbseg = Math.abs((Date.parse(datum2.value) - Date.parse(datum1.value)) / 1000 / 60 / 60 / 24) + 1;
    ejszaka = kulonbseg - 1;
    
    hanynap.innerHTML = kulonbseg.toString() + ' nap, ' + (kulonbseg - 1).toString() + ' éjszaka';
    
    console.log("Ebben a hónapban vagyunk: " + m);
    console.log("ennyi éjszakára akarsz foglalni:" + ejszaka);
    
    if(Number(m) >= 6 && Number(m) <= 10 && ejszaka < 3){
        hibauzenet.innerHTML = "Ebben az időszakban minimum 3 éjszakára lehet csak foglalni!";
        hibauzenet.style.animationName = "hiba";
    }
    else{
        hibauzenet.style.animationName = "blank";
    }
}

function vegosszeg(){
    var foperej = 0;
    var potagyszam = 0;
    var osszesfo = Number(felnott.value) + Number(gyerek1.value) + Number(gyerek2.value);
    
    if (osszesfo > 4) potagyszam = osszesfo - 4;
    
    switch(osszesfo){
        case 1:
            foperej = 6000;
            break;
        case 2:
            foperej = 5000;
            break;
    }

    var vegosszeg = ((felnott.value * foperej) + (gyerek1.value * foperej * 0.5) + (gyerek2.value * foperej * 0.75) + (kisallat.value * 1000) + (potagyszam * 3500)) * ejszaka;
    
    
    if(ejszaka >= 7) vegosszeg *= 0.9;
    
    osszeg.innerHTML = 'Végösszeg: ' + Math.floor(vegosszeg).toString().replace(/(\d)(?=(\d\d\d)+(?!\d))/g, "$1.") + ' Ft';

    if(osszesfo >= 2){
        hibauzenet.innerHTML = "A foglalás nem haladhatja meg a 2 főt";
        hibauzenet.style.animationName = "hiba";
    }
    else{
        hibauzenet.style.animationName = "blank";
    }
}

function nevF(){
    let i = 0;
    let isFound = false;
    while(i < nev.value.length){
        if(nev.value.charAt(i) == ' '){
            isFound = true;
        }
        i++;
    }
    if (isFound == false && nev.value.length != 0){
        hibauzenet.innerHTML = "Kérem egész nevet adjon meg!";
        hibauzenet.style.animationName = "hiba";
    }else{
        hibauzenet.style.animationName = "blank";        
    }
}
function isNumber(evt){
    var charCode = (evt.which) ? evt.which : event.keyCode;
    if (charCode > 31 && (charCode < 48 || charCode > 57))
        return false;

    return true;
}
function isText(evt){
    var charCode = (evt.which) ? evt.which : event.keyCode;
    if (charCode >= 48 && charCode <= 57)
        return false;

    return true;
}
function felnottF(){
    if(felnott.value <= 0 || felnott.value > 2){
        felnott.value = null;
    }
    if(Number(felnott.value) + Number(gyerek1.value) + Number(gyerek2.value) > 2)
        felnott.value -= 1;
}
function gyerek1F(){
    if(gyerek1.value < 0 || gyerek1.value > 2){
        gyerek1.value = null;
    }
    if(Number(felnott.value) + Number(gyerek1.value) + Number(gyerek2.value) > 2)
        gyerek1.value -= 1;
}
function gyerek2F(){
    if(gyerek2.value < 0 || gyerek2.value > 2){
        gyerek2.value = null;
    }
    if(Number(felnott.value) + Number(gyerek1.value) + Number(gyerek2.value) > 2)
        gyerek2.value -= 1;
}
function kisallatF(){
    if(kisallat.value < 0 || kisallat.value > 2){
        kisallat.value = null;
    }
}
function teszt(){
    console.log(document.getElementById('fizetes').value);
}

