/*
string primitive 타입과 String 객체 함수(String.prototype.*)
*/

// casting
var str5 = "5" + 5;
console.log(str5);

var str6 = "boolean:" + true;
console.log(str6);

// 객체 함수
var str7 = "string1 string2 string3";

var index = str7.indexOf('string2');  // 8
console.log(index);

index = str7.indexOf('string4');  // -1
console.log(index);

var str8 = str7.substring(10/*firstIndex*/, 13/*lastIndex - 1*/);
console.log(str8);

var a = str7.split(" ");
console.log(a);

a = str7.split(":");
console.log(a);