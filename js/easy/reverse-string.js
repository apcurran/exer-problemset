/**
 *
 * @param {string} str
 * @returns {string}
 */
export function reverseString(str) {
    let result = "";

    for (let right = str.length - 1; right >= 0; right--) {
        result += str[right];
    }

    return result;
}
