$(function () {
  $('[data-toggle="tooltip"]').tooltip()
})

module = angular.module("ogrodnik",[])

module.controller("kontrolSekcji", function() {
    var sekcja = this;
    sekcja.stan = false;
    sekcja.zatwierdzony = false;
    sekcja.shown = true;
    sekcja.h = 6;
    sekcja.m = 30;
    sekcja.rt = 15;
    sekcja.days = [0,0,0,0,0,0,0];
    sekcja.id="Przedogródek";

    sekcja.hide = () =>{
        sekcja.shown=!sekcja.shown;
        console.log(sekcja.shown)
        };

    sekcja.zmianaStanu = () =>{
    sekcja.stan=!sekcja.stan;
    };

    sekcja.getStan = () =>{
        if(!sekcja.stan){
            return "red";
        };
        return "green";
    }

    sekcja.zatwierdz = () =>{
        sekcja.zatwierdzony=!sekcja.zatwierdzony;
        console.log(sekcja)
    }

    sekcja.stanNazwa = () =>{
        if(sekcja.stan){
        return "ZAŁĄCZONO. KLIKNIJ ABY WYŁĄCZYĆ"
        }
        return "WYŁĄCZONO. KLIKNIJ ABY ZAŁĄCZYĆ"
    }

    sekcja.validuj = () => {
        if(sekcja.h>23){sekcja.h=23}
    }

    sekcja.stanZatwierdz = () =>{
        if(!sekcja.zatwierdzony){
        return "ZATWIERDŹ - AKTYWUJ PROGRAM"
        }
        return "PROGRAM AKTYWNY. DEZAKTYWACJA"
    }

    sekcja.getZatwierdzenie = () =>{
        if(!sekcja.zatwierdzony){
            return "blue";
        };
        return "green";
    }
});


module.controller("tabChangeController", function() {
    var tab = this;

    tab.open = "nawadnianie";

    tab.showOnly = (tabName) =>{
        tab.open=tabName
        };


    tab.getTabActive = (tabName) =>{
        if(tab.open==tabName){
            return "active";
        };
}

});

