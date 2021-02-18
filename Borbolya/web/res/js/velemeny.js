                
            function createVelemeny(apartman_id) {
                var nev_in = document.getElementById("inputVelemenyNev").value;
                var email_in = document.getElementById("inputVelemenyEmail").value;
                var ertekeles_in = parseInt(document.getElementById("pont").innerHTML[0]);
                var tetszett_in = document.getElementById("inputElonyok").value;
                var nemtetszett_in = document.getElementById("inputHatranyok").value;
                var megjegyzes_in = document.getElementById("inputMegjegyzes").value;

                var task = "createVelemeny";
                //json
                var data = {
                    "task": task,
                    "nev_in": nev_in,
                    "apartman_id": apartman_id,
                    "email_in": email_in,
                    "ertekeles_in": ertekeles_in,
                    "tetszett_in": tetszett_in,
                    "nemtetszett_in": nemtetszett_in,
                    "megjegyzes_in": megjegyzes_in
                };
                $.ajax({
                    url: "VelemenyController",
                    type: "POST",
                    data: data,
                    success: function (result) {
                       console.log(result.toString());
                    },
                    error: function () {
                        
                    }
                });
            }
            
            
            
            
            
            
            
            
            