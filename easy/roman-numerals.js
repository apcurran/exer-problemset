/**
 * solution 1 -- lookup table
 * time: O(n)
 * space: O(1) -- not including result string
 *
 * @param {number} arabicNum
 * @returns {string} - Roman numeral
 */
export function toRoman(arabicNum) {
    if (arabicNum < 1 || arabicNum > 3_999) {
        throw new Error("Input number must be between 1 and 3,999.");
    }

    const romanMapping = new Map([
        [1000, "M"],
        [900, "CM"],
        [500, "D"],
        [400, "CD"],
        [100, "C"],
        [90, "XC"],
        [50, "L"],
        [40, "XL"],
        [10, "X"],
        [9, "IX"],
        [5, "V"],
        [4, "IV"],
        [1, "I"],
    ]);
    let result = "";

    for (let [value, romanSymbol] of romanMapping) {
        while (arabicNum >= value) {
            result += romanSymbol;
            arabicNum -= value;
        }
    }

    return result;
}

console.log(toRoman(105)); // "CV"
