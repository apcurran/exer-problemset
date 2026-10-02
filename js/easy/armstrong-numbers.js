/**
 * solution -- works for BigInts and Number inputs
 * time: O(n)
 * space: O(n)
 *
 * @param {number|bigint} num
 * @returns {boolean}
 */
export function isArmstrongNumber(num) {
    let strNum = String(num);
    let total = 0n;

    for (let strDigit of strNum) {
        const val = BigInt(strDigit) ** BigInt(strNum.length);
        total += val;
    }

    return BigInt(num) === total;
}

console.log(isArmstrongNumber(153)); // true
console.log(isArmstrongNumber(100)); // false
console.log(isArmstrongNumber(9474)); // true
