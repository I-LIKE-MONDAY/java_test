// 하고 싶은 일 목록에 '다이어트', '제주도여행', 'PS5구입' 이 있습니다.
// 여기에 하고 싶은 것들 사용자 입력을 통해 추가로 하고 싶은 일을 5개 이상을 추가하고
// 버킷 리스트 5개만 랜덤으로 남기고 모두 삭제한 후 화면에 출력하는 프로그램을 작성하시오

let bucketListArray = ["다이어트", "제주도여행", "PS5구입"];


for(let i = 0; i < 5; i++) {
    bucketListArray.push(prompt("하고싶은 일을 입력하세요."));

}

console.log(bucketListArray);
for(let i = 0; i < 3; i++) {
    const random = Math.floor(Math.random() * bucketListArray.length);
    console.log(random);
    bucketListArray.splice(random, 1);
}
console.log("------- 내 버킷리스트 -------")
for(let i = 0; i < bucketListArray.length; i++) {
console.log(bucketListArray[i]);
}