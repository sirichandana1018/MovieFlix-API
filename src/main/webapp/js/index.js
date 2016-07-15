/**
 * Created by Siri on 5/23/2016.
 */

function myFunction() {
    document.getElementsByClassName("topnav")[0].classList.toggle("responsive");
}

$(document).ready(function() {
    $('#myCarousel').carousel({
        interval: 500000
    })

    $('#myCarousel').on('slid.bs.carousel', function() {
        //alert("slid");
    });
});

