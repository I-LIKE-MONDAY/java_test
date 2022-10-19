// 날짜를 입력받으면 해당 날짜의 요일을 출력하는 프로그램을 작성하세요

var date = prompt("날짜를 입력하세요. (YYYY-MM-DD)")
let searchDay = new Date(date).getDay();
switch (parseInt(searchDay)) {
    case 0:
        console.log(date + " 일요일");
        break;
    case 1:
        console.log(date + " 월요일");
        break;
    case 2:
        console.log(date + " 화요일");
        break;
    case 3:
        console.log(date + " 수요일");
        break;
    case 4:
        console.log(date + " 목요일");
        break;
    case 5:
        console.log(date + " 금요일");
        break;
    case 6:
        console.log(date + "토요일");
        break;
}


