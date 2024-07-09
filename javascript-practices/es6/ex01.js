/**
 * let & const
 *
 */
// 1. const 블록 범위: 상수
try {
    if (true) {
        var i = 10;
        var j = 20;
    }

    console.log(i);
    console.log(j);

} catch (e) {
    console.error('error:' + e);
}