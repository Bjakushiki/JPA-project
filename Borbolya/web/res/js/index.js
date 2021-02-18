function sendEmail() {
                var nev = document.getElementById("inputName").value;
                var email = document.getElementById("inputEmail").value;
                var targy = document.getElementById("inputTargy").value;
                var uzenet = document.getElementById("inputUzenet").value;
                var task = "sendEmail";
                //json
                var request = {
                    "task": task,
                    "nev": nev,
                    "email": email,
                    "targy": targy,
                    "uzenet": uzenet
                };
                $.ajax({
                    url: "EmailController",
                    type: "POST",
                    data: request,
                    success: function (rd) {
                       
                    },
                    error: function () {
                        
                    }
                });
            }