/**
 * solution 1
 * time: O(n)
 * space: O(n)
 *
 * @param {string} str
 * @returns {boolean}
 */
export function isIsogram(str) {
    const loweredStr = str.toLowerCase();
    const noHypensOrSpaces = loweredStr.replaceAll(/[ -]/g, "");
    const noRepeatedLetters = new Set(noHypensOrSpaces);

    return noHypensOrSpaces.length === noRepeatedLetters.size;
}

console.log(isIsogram("isogram")); // true
console.log(isIsogram("eleven")); // false
