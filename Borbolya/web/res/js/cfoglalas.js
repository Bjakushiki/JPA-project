function createFoglalas(apartman_id){
                var nev_in = document.getElementById("inputNev").value;
                var email_in = document.getElementById("inputEmail").value;
                var telefon_in = document.getElementById("inputTelefonszam").value;
                var erkezes_in = document.getElementById("erkezesNap").value;
                var tavozas_in = document.getElementById("tavozasNap").value;
                var felnott_in = document.getElementById("felnottSzam").value;
                var gyerek1_in = document.getElementById("kisgyerekSzam").value;
                var gyerek2_in = document.getElementById("gyerekSzam").value;
                var kisallat_in = document.getElementById("kisallatSzam").value;
                var fizetesimod_in = document.getElementById("fizetes").value;
                var task = "createFoglalas";
                var data = {
                    "task": task,
                    "nev_in": nev_in,
                    "apartman_id": apartman_id,
                    "email_in": email_in,
                    "telefon_in":telefon_in,
                    "erkezes_in": erkezes_in,
                    "tavozas_in": tavozas_in,
                    "felnott_in": felnott_in,
                    "gyerek1_in": gyerek1_in,
                    "gyerek2_in": gyerek2_in,
                    "kisallat_in": kisallat_in,
                    "fizetesimod_in": fizetesimod_in
                };
                $.ajax({
                    url: "FoglalasController",
                    type: "POST",
                    data: data,
                    success: function (result) {
                       console.log(result.toString());
                    },
                    error: function () {
                        
                    }
                });
}
function getAllFoglalas(id){
                
                var data = {"task": "getAllFoglalasDatum",
                            "id": id
                };
                $.ajax({
                    url: "FoglalasController",
                    type: "POST",
                    data: data,
                    success: function (result) {
                        console.log(JSON.stringify(result));
                    },
                    error: function(){
                        
                    }
                });
            }