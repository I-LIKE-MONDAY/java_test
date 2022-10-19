
while(true) {
    let inputStream = prompt("문장을 입력하세요.");
    console.log("입력>> " + inputStream);
    inputStream = inputStream.replace(/e/g, 'q');
    console.log("출력>> " + inputStream);
}