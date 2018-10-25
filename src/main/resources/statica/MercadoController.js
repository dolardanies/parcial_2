$(document).ready(function() {
    $.ajax({
        url: "https://www.alphavantage.co/query?function=FX_DAILY&from_symbol=EUR&to_symbol=USD&apikey=demo"
    }).then(function(data) {
       $('.valores_id').append(data.id);
       $('.valores_content').append(data.content);
    });
});