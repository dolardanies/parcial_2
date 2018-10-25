/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
function getClimaCiudad(nombreCiudad) {
    axios.get('/ciudades/' + nombreCiudad + '/' + document.getElementById("inputCiudad").value)
            .then(function (response) {
                document.getElementById("dataDiv").innerHTML = "";
                var dataContent = document.getElementById("dataDiv");  
                }
                
            );


}

