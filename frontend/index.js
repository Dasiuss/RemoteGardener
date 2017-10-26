module = angular.module("ogrodnik",[])

module.controller("kontrolSekcji", function() {
  var sekcja = this;
  sekcja.stan = false;
  sekcja.h = 6;
  sekcja.m = 30;
  sekcja.rt = 15;
  sekcja.days = [0,0,0,0,0,0,0];
  sekcja.id="przedogrodek";

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
        console.log(sekcja)
    }

    sekcja.stanNazwa = () =>{
        if(sekcja.stan){
        return "WYLĄCZ RĘCZNIE"
        }
        return "ZAŁĄCZ RĘCZNIE"
    }

  sekcja.validuj = () => {
    if(sekcja.h>23){sekcja.h=23}
  }
});



