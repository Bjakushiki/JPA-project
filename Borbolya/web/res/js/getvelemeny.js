function getAllVelemeny(){
                
                var data = {"task": "getAllVelemeny"};
                $.ajax({
                    url: "VelemenyController",
                    type: "POST",
                    data: data,
                    success: function (result) {
                        console.log(JSON.stringify(result));
                        var has1=0;
                        var has2=0;
                        var has3=0;
                        
                        while(has1==0 || has2==0 || has3==0){
                            min = Math.ceil(0);
                            max = Math.floor(result.length-1);
                            var random = Math.floor(Math.random() * (max - min + 1)) + min;
                                var data = result[random];
                                data = JSON.parse(JSON.stringify(data));
                                if(data.Apartmanid==1 && has1==0){
                                  var object = JSON.parse(JSON.stringify(data));
                                  $('#megjegyzes1').html(object.megjegyzes);
                                  $('#nev1').html(object.nev);
                                  var csillag = object.ertekeles;
                                  switch(csillag){
                                      case 1:
                                            document.getElementById('1.1').className = "fa fa-star";
                                            break;
                                      case 2:
                                            document.getElementById('1.1').className = "fa fa-star";
                                            document.getElementById('1.2').className = "fa fa-star";
                                            break;
                                      case 3:
                                            document.getElementById('1.1').className = "fa fa-star";
                                            document.getElementById('1.2').className = "fa fa-star";
                                            document.getElementById('1.3').className = "fa fa-star";
                                            break;
                                      case 4:
                                            document.getElementById('1.1').className = "fa fa-star";
                                            document.getElementById('1.2').className = "fa fa-star";
                                            document.getElementById('1.3').className = "fa fa-star";
                                            document.getElementById('1.4').className = "fa fa-star";
                                            break;
                                      case 5:
                                            document.getElementById('1.1').className = "fa fa-star";
                                            document.getElementById('1.2').className = "fa fa-star";
                                            document.getElementById('1.3').className = "fa fa-star";
                                            document.getElementById('1.4').className = "fa fa-star";
                                            document.getElementById('1.5').className = "fa fa-star";
                                            break;
                                      default:
                                            document.getElementById('1.1').className = "fa fa-star-o";
                                            document.getElementById('1.2').className = "fa fa-star-o";
                                            document.getElementById('1.3').className = "fa fa-star-o";
                                            document.getElementById('1.4').className = "fa fa-star-o";
                                            document.getElementById('1.5').className = "fa fa-star-o";
                                          
                                  }
                                  has1++;
                                }
                                else if(data.Apartmanid==2 && has2==0){
                                   var object = JSON.parse(JSON.stringify(data));
                                   $('#megjegyzes2').html(object.megjegyzes);
                                   $('#nev2').html(object.nev);
                                   var csillag = object.ertekeles;
                                   switch(csillag){
                                      case 1:
                                            document.getElementById('2.1').className = "fa fa-star";
                                            break;
                                      case 2:
                                            document.getElementById('2.1').className = "fa fa-star";
                                            document.getElementById('2.2').className = "fa fa-star";
                                            break;
                                      case 3:
                                            document.getElementById('2.1').className = "fa fa-star";
                                            document.getElementById('2.2').className = "fa fa-star";
                                            document.getElementById('2.3').className = "fa fa-star";
                                            break;
                                      case 4:
                                            document.getElementById('2.1').className = "fa fa-star";
                                            document.getElementById('2.2').className = "fa fa-star";
                                            document.getElementById('2.3').className = "fa fa-star";
                                            document.getElementById('2.4').className = "fa fa-star";
                                            break;
                                      case 5:
                                            document.getElementById('2.1').className = "fa fa-star";
                                            document.getElementById('2.2').className = "fa fa-star";
                                            document.getElementById('2.3').className = "fa fa-star";
                                            document.getElementById('2.4').className = "fa fa-star";
                                            document.getElementById('2.5').className = "fa fa-star";
                                            break;
                                      default:
                                            document.getElementById('2.1').className = "fa fa-star-o";
                                            document.getElementById('2.2').className = "fa fa-star-o";
                                            document.getElementById('2.3').className = "fa fa-star-o";
                                            document.getElementById('2.4').className = "fa fa-star-o";
                                            document.getElementById('2.5').className = "fa fa-star-o";
                                          
                                  }
                                   has2++;
                                }
                                else if(data.Apartmanid==3&&has3==0){
                                   var object = JSON.parse(JSON.stringify(data));
                                   $('#megjegyzes3').html(object.megjegyzes);
                                   $('#nev3').html(object.nev);
                                   var csillag = object.ertekeles;
                                   switch(csillag){
                                      case 1:
                                            document.getElementById('3.1').className = "fa fa-star";
                                            break;
                                      case 2:
                                            document.getElementById('3.1').className = "fa fa-star";
                                            document.getElementById('3.2').className = "fa fa-star";
                                            break;
                                      case 3:
                                            document.getElementById('3.1').className = "fa fa-star";
                                            document.getElementById('3.2').className = "fa fa-star";
                                            document.getElementById('3.3').className = "fa fa-star";
                                            break;
                                      case 4:
                                            document.getElementById('3.1').className = "fa fa-star";
                                            document.getElementById('3.2').className = "fa fa-star";
                                            document.getElementById('3.3').className = "fa fa-star";
                                            document.getElementById('3.4').className = "fa fa-star";
                                            break;
                                      case 5:
                                            document.getElementById('3.1').className = "fa fa-star";
                                            document.getElementById('3.2').className = "fa fa-star";
                                            document.getElementById('3.3').className = "fa fa-star";
                                            document.getElementById('3.4').className = "fa fa-star";
                                            document.getElementById('3.5').className = "fa fa-star";
                                            break;
                                      default:
                                            document.getElementById('3.1').className = "fa fa-star-o";
                                            document.getElementById('3.2').className = "fa fa-star-o";
                                            document.getElementById('3.3').className = "fa fa-star-o";
                                            document.getElementById('3.4').className = "fa fa-star-o";
                                            document.getElementById('3.5').className = "fa fa-star-o";
                                          
                                  }
                                   has3++;
                                }

                        }
                    },
                    error: function(){alert("hiba");}
                });
            }



function getAllVelemenyByID(id){
                
                var data = {"task": "getAllVelemenyByID",
                            "id": id
                };
                $.ajax({
                    url: "VelemenyController",
                    type: "POST",
                    data: data,
                    success: function (result) {
                        console.log(JSON.stringify(result));
                        
                    $('#myTable tr').empty();
                        var header = $('#myTable thead');
                        var body = $('#myTable tbody');
                        var hTr;
                        $('#myTable thead').append(hTr = $('<tr>'));
                        for (var h = 0; h < 1; h++) {
                            hTr.append($('<th>', { text: "ID" }))
                            hTr.append($('<th>', { text: "Név" }))
                            hTr.append($('<th>', { text: "Email" }))
                            hTr.append($('<th>', { text: "Értékelés" }))
                            hTr.append($('<th>', { text: "Tetszett" }))
                            hTr.append($('<th>', { text: "Nem Tetszett" }))
                            hTr.append($('<th>', { text: "Megjegyzés" }))
                                }
                        for (var d in result) {
                           var data = result[d];
                           $('#myTable tbody').append($('<tr>')
                               .append($('<td>', { text: data.id }))
                               .append($('<td>', { text: data.nev }))
                               .append($('<td>', { text: data.email }))
                               .append($('<td>', { text: data.ertekeles }))
                               .append($('<td>', { text: data.tetszett }))
                               .append($('<td>', { text: data.nemTetszett }))
                               .append($('<td>', { text: data.megjegyzes })) 
                           )
                        }
                        
                    },
                    error: function(){alert("hiba");}
                });
            }
            
